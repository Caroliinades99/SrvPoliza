package coop.equidad.web.security;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import coop.laequidad.cache.PermisoCache;
import coop.laequidad.cache.RestriccionCache;
import coop.laequidad.cache.TokenCache;
import coop.equidad.model.dao.TokenDao;
import coop.equidad.web.entity.Cliente;
import coop.equidad.web.entity.LogSuscripcion;
import coop.equidad.web.entity.Permiso;

/**
 * Servlet Filter implementation class RequestFilter
 */
@WebFilter("/*")
public class RequestFilter implements Filter {

	/**
	 * Default constructor. 
	 */
	public RequestFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		
		HttpServletRequest pars= (HttpServletRequest)arg0;
		HttpServletResponse httpResponse=(HttpServletResponse)arg1;		

		StringTokenizer separador= new StringTokenizer(pars.getRequestURI(), "/"); 
		String end="";
		
		while(separador.hasMoreElements()){
			end=separador.nextToken();
		}	

		TokenDao td= new TokenDao();

		long val=0;
		if(RestriccionCache.getInstance().getCache().get(end)==null){

			val=td.filtrar(end);
		}else{
			val=RestriccionCache.getInstance().getCache().get(end).getId();
		}	

		if(val!=0){

			String token=pars.getParameter("token");

			if( token==null || token.length()==0){

				httpResponse.getOutputStream().println("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'>"+
						"<soapenv:Body>"+
						"<soapenv:Fault>"+
						"<faultcode>soapenv:Server</faultcode>"+
						"<faultstring>Request sin token</faultstring>"+
						"<detail/>"+
						"</soapenv:Fault>"+
						"</soapenv:Body>"+
						"</soapenv:Envelope>");
				return;
			}else{
				System.out.println("sacando por token "+token);
				Cliente cliente = TokenCache.getInstance().getRevCache().get(token) ;
				if(cliente==null){
					cliente = td.getClienteByToken(token);
					if(cliente==null){
						cliente = td.getClienteByToken(token);
						TokenCache.getInstance().cargarCache();
					}
				}
				System.out.println("salio de token "+cliente);
				if(cliente==null){

					httpResponse.getOutputStream().println("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'>"+
							"<soapenv:Body>"+
							"<soapenv:Fault>"+
							"<faultcode>soapenv:Server</faultcode>"+
							"<faultstring>Token invalido, ingrese al servicio de autenticacion para obtener un nuevo token </faultstring>"+
							"<detail/>"+
							"</soapenv:Fault>"+
							"</soapenv:Body>"+
							"</soapenv:Envelope>");

					return;
				}else{
					if(cliente.getFromechaFin().before(Calendar.getInstance().getTime())){
						TokenCache.getInstance().cargarCache();
						cliente = TokenCache.getInstance().getRevCache().get(token);//td.getClienteByToken(token);
					}

					if(cliente!=null){
						SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyyy");
						try {
							System.out.println(token+" fecha vence "+sdf.format(cliente.getFromechaFin())+" fecha actual "+sdf.format(Calendar.getInstance().getTime()));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(cliente.getFromechaFin().before(Calendar.getInstance().getTime())){
							System.out.println("Token vencido ");
							httpResponse.getOutputStream().println("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'>"+
									"<soapenv:Body>"+
									"<soapenv:Fault>"+
									"<faultcode>soapenv:Server</faultcode>"+
									"<faultstring>Token vencido. El token que esta utilizando es muy antiguo, ingrese al servicio de autenticacion para obtener un nuevo token </faultstring>"+
									"<detail/>"+
									"</soapenv:Fault>"+
									"</soapenv:Body>"+
									"</soapenv:Envelope>");
							return;


						}else{

							Permiso permiso = PermisoCache.getInstance().getCache().get(cliente.getId()+"-"+val);

							if(permiso==null && !td.getFiltro(cliente.getId(), val)){

								System.out.println("Token valido ");
								httpResponse.getOutputStream().println("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'>"+
										"<soapenv:Body>"+
										"<soapenv:Fault>"+
										"<faultcode>soapenv:Server</faultcode>"+
										"<faultstring>Permiso denegado, el usuario no tiene permiso para acceder al servicio </faultstring>"+
										"<detail/>"+
										"</soapenv:Fault>"+
										"</soapenv:Body>"+
										"</soapenv:Envelope>");
								return;
							}
						}
					}else{
						System.out.println("el token no esta en la cache ");

						System.out.println("Token vencido ");
						httpResponse.getOutputStream().println("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/'>"+
								"<soapenv:Body>"+
								"<soapenv:Fault>"+
								"<faultcode>soapenv:Server</faultcode>"+
								"<faultstring>Token vencido. El token que esta utilizando es muy antiguo, ingrese al servicio de autenticacion para obtener un nuevo token </faultstring>"+
								"<detail/>"+
								"</soapenv:Fault>"+
								"</soapenv:Body>"+
								"</soapenv:Envelope>");
						return;
					}

				}

			}
			
		}			
		

		arg2.doFilter(pars, arg1);
		
		//String request = getRequestWS(pars);
		//guardarRequestWS(request);
	}
	
	private String getRequestWS ( HttpServletRequest pars ) throws IOException {		
		StringWriter writer = new StringWriter();
        IOUtils.copy(pars.getInputStream(), writer, pars.getCharacterEncoding());
        String requestWS = writer.toString();
        
        writer.close();      		
		return requestWS;
	}
	
	private void guardarRequestWS ( String request ) {
		System.out.println("ingrese logSuscripcion ");
		LogSuscripcion logSuscripcion = new LogSuscripcion();
		logSuscripcion.setFechamensaje(new Timestamp(Calendar.getInstance().getTimeInMillis()));
		logSuscripcion.setMensaje(request);
		
		TokenDao td = new TokenDao();
		td.creaLogSuscripcion(logSuscripcion);
		System.out.println("salida logSuscripcion ");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}


	class MultiReadHttpServletRequest extends HttpServletRequestWrapper {
		private String _body;

		public MultiReadHttpServletRequest(HttpServletRequest request) throws IOException {
			super(request);


			_body   = IOUtils.toString(request.getInputStream(),request.getCharacterEncoding());

			/*
		 BufferedReader bufferedReader = request.getReader();
		 String line;
		 while ((line = bufferedReader.readLine()) != null){
		 _body += line;
		 System.out.println(_body);
		 }

			 */
		}
/*
		@Override
		public ServletInputStream getInputStream() throws       IOException {
			final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(_body.getBytes("UTF-8"));

			ServletInputStream sis=  new ServletInputStream() {
				public int read() throws IOException {
					return byteArrayInputStream.read();
				}


			};

			return sis;
		}
*/

		public BufferedReader getReader() throws IOException {
			return new BufferedReader(new InputStreamReader(this.getInputStream()));
		}
	}

}