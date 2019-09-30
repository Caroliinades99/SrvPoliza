package coop.equidad.model.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import coop.equidad.config.ConfigProperties;
import coop.equidad.model.entity.S03067;
import coop.equidad.web.entity.Cliente;
import coop.equidad.web.entity.LogSuscripcion;
import coop.equidad.web.entity.Permiso;
import coop.equidad.web.entity.Restriccion;
import coop.laequidad.entity.LOG_SERVICIO_EMISION;
import coop.laequidad.entity.LOG_SERVICIO_EMISIONPK;

@SuppressWarnings("unchecked")
public class TokenDao {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory(ConfigProperties.getProp("persistenceUnit"));
	private EntityManager em;
	
	
	/**
	 * 
	 * @param user
	 * @param clave
	 * @return
	 */	
	public Cliente getCliente(String user, String clave){
		Cliente c=null;
		em = emf.createEntityManager();
		Query query = em.createQuery("select c from Cliente c where c.nombre=:user and c.clave = :clave");
		query.setParameter("user",user);
		query.setParameter("clave",clave);
		List<Cliente> lista=(List<Cliente>)query.getResultList();
		if(lista.size()>0)
			c= lista.get(0);

		em.close();
		return c;
	}


	/**
	 * 
	 * @param token
	 * @return
	 */
	public Cliente getClienteByToken(String token){
		Cliente c=null;
		em = emf.createEntityManager();
		Query query = em.createQuery("select c from Cliente c where c.token = :token");
		query.setParameter("token",token);
		List<Cliente> lista=(List<Cliente>)query.getResultList();
		if(lista.size()>0)
			c= lista.get(0);   

		em.close();
		return c;
	}

	/**
	 * 
	 * @param id_cliente
	 * @param id_restriccion
	 * @return
	 */
	public boolean getPermiso(long id_cliente, long id_restriccion){

		em = emf.createEntityManager();
		Query query = em.createQuery("select p from Permiso p where p.id.cliente=:cliente and p.id.restriccion = :restriccion");
		query.setParameter("cliente",id_cliente);
		query.setParameter("restriccion",id_restriccion);
		List<Permiso> lista=(List<Permiso>)query.getResultList();
		if(lista.size()>0)
			return true;      

		em.close();
		return false;
	}

	/**
	 * 
	 * @param cliente
	 * @return
	 */
	@SuppressWarnings("unused")
	public boolean updateCliente(Cliente cliente) {
		EntityTransaction transaccion = null;

		try {
			em = emf.createEntityManager();

			StoredProcedureQuery storedProcedure =em.createStoredProcedureQuery("osiris.actualizartoken");
			storedProcedure.registerStoredProcedureParameter("tokennuevo", String.class, ParameterMode.IN);
			storedProcedure.registerStoredProcedureParameter("tercero", Long.class, ParameterMode.IN);

			storedProcedure.setParameter("tokennuevo", cliente.getToken());
			storedProcedure.setParameter("tercero", cliente.getId());
			storedProcedure.execute();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * 
	 * @param url
	 * @return
	 */
	public long filtrar(String url) {
		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("select r from Restriccion r where r.url = :url");
			query.setParameter("url",url);

			List<Restriccion> lista=(List<Restriccion>)query.getResultList();

			if(lista.size()>0)                
				return lista.get(0).getId();


		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 
	 * @param cliente
	 * @param restriccion
	 * @return
	 */
	public boolean getFiltro (long cliente, long restriccion) {

		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("select p from Permiso p where p.id.cliente=:cliente and p.id.restriccion = :restriccion");
			query.setParameter("cliente",cliente);
			query.setParameter("restriccion",restriccion);
			List<Permiso> lista=(List<Permiso>)query.getResultList();
			if(lista.size()>0)                
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}


	public List<Permiso> getPermisos(){

		List<Permiso> lista=null;
		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("select p from Permiso p ");
			lista=(List<Permiso>)query.getResultList();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return lista;
	}

	public List<Restriccion> getRestricciones(){

		List<Restriccion> lista=null;
		try {
			em = emf.createEntityManager();
			Query query = em.createQuery("select p from Restriccion p ");
			lista=(List<Restriccion>)query.getResultList();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return lista;
	}

	public List<Cliente> getClientes(){

		Cliente c=null;
		em = emf.createEntityManager();
		Query query = em.createNativeQuery("select * from webservices.Cliente");//em.createQuery("select c from Cliente c ");
		List<Object[]> obj=query.getResultList();
		List<Cliente> lista=new ArrayList<Cliente>();
		
		for(Object[] cli:obj){

			c=new Cliente();
			c.setId(((BigDecimal)cli[0]).longValue());
			c.setNombre((String)cli[1]);
			c.setClave((String)cli[2]);
			c.setToken((String)cli[3]);
			c.setFromechaIni((Timestamp)cli[4]);
			c.setFromechaFin((Timestamp)cli[5]);
			c.setUsuarioosiris((String)cli[8]);
			lista.add(c);
		}

		return lista;
	}
	
	public String getGroup(String usuario){

		Cliente c=null;
		em = emf.createEntityManager();
		Query query = em.createNativeQuery("select a.GRUPO  from osiris.S03220 a where a.usuario='"+usuario+"'");//em.createQuery("select c from Cliente c ");
		List<String> obj=query.getResultList();
		
		
		for(String cli:obj){

			return cli;
		}

		return null;
	}
	
	public void creaLogSuscripcion (LogSuscripcion logSuscripcion) {
		EntityTransaction transaccion = null;

		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();
		em.persist(logSuscripcion);
				
		transaccion.commit();
		em.close();
	}
	

	public void creaLogEmision (String sucursal, String cotizacion, String mensaje) {
		LOG_SERVICIO_EMISION logEmision=new LOG_SERVICIO_EMISION();
		LOG_SERVICIO_EMISIONPK logEmisionPk=new LOG_SERVICIO_EMISIONPK();
		
		logEmisionPk.setCotizacion(cotizacion);
		logEmisionPk.setHora(Calendar.getInstance().getTime());
		logEmisionPk.setSucursal(sucursal);
		
		logEmision.setId(logEmisionPk);
		logEmision.setMensaje(mensaje);
		
		EntityTransaction transaccion = null;

		em = emf.createEntityManager();
		transaccion = em.getTransaction();
		transaccion.begin();
		em.persist(logEmision);
				
		transaccion.commit();
		//em.close();
		
		
		
	}
	
	public Map<String,Map<String,List<S03067>>> getRestriccionesSuscripcion(){
		
		Map<String,Map<String,List<S03067>>> cacheRestricciones= new HashMap<String,Map<String,List<S03067>>>();
		S03067 c=null;
		em = emf.createEntityManager();
		Query query = em.createNativeQuery("select * from osiris.S03067");//em.createQuery("select c from Cliente c ");
		List<Object[]> obj=query.getResultList();
		
		//   , GRUPO, USUARIO, CLASEPERMISO, CODPLAN, CLAUSULA, MONTO, INCISO, CODDET
		for(Object[] cli:obj){

			c=new S03067();
			c.setGrupo((String)cli[0]);//(((BigDecimal)cli[0]).longValue());
			c.setUsuario((String)cli[1]);//((String)cli[1]);
			c.setClasepermiso((BigDecimal)cli[2]);//((String)cli[2]);
			c.setCodplan((String)cli[3]);//Token((String)cli[3]);
			c.setClausula((String)cli[4]);//FromechaIni((Timestamp)cli[4]);
			c.setMonto((BigDecimal)cli[5]);//FromechaFin((Timestamp)cli[5]);
			c.setInciso((BigDecimal)cli[6]);//Usuarioosiris((String)cli[8]);
			c.setCoddet((String)cli[7]);
			
			if(c.getGrupo()!=null){
				if(!cacheRestricciones.containsKey(c.getGrupo())){
					cacheRestricciones.put(c.getGrupo(), new HashMap<String,List<S03067>>());
				}
				if(!cacheRestricciones.get(c.getGrupo()).containsKey(c.getCodplan())){
					cacheRestricciones.get(c.getGrupo()).put(c.getCodplan(), new ArrayList<S03067>());
				}
				cacheRestricciones.get(c.getGrupo()).get(c.getCodplan()).add(c);
			}else{
				if(!cacheRestricciones.containsKey(c.getUsuario())){
					cacheRestricciones.put(c.getUsuario(), new HashMap<String,List<S03067>>());
				}
				if(!cacheRestricciones.get(c.getUsuario()).containsKey(c.getCodplan())){
					cacheRestricciones.get(c.getUsuario()).put(c.getCodplan(), new ArrayList<S03067>());
				}
				cacheRestricciones.get(c.getUsuario()).get(c.getCodplan()).add(c);
			}
			
		}

		return cacheRestricciones;
	}
	
}
