package coop.laequidad.cache;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import coop.equidad.model.dao.TokenDao;
import coop.equidad.model.entity.S03067;
import coop.equidad.web.entity.Cliente;

public class TokenCache {
	private static TokenCache instance;
	private Map<String, Cliente> cache;

	private Map<String, Cliente> revCache;
	
	
	private TokenCache (){
		cargarCache ();
	}

	public static TokenCache getInstance() {
		if (instance == null) {
			instance = new TokenCache();

		}

		return instance;
	}

	public Map<String, Cliente> getCache() {
		return cache;
	}

	public void setCache(Map<String, Cliente> cache) {
		this.cache = cache;
	}

	public void cargarCache () {

		ConcurrentHashMap<String, Cliente> cacheTmp = new ConcurrentHashMap<String,  Cliente>();
		ConcurrentHashMap<String, Cliente> revCacheTmp = new ConcurrentHashMap<String,  Cliente>();

		TokenDao td= new TokenDao();
		
		List<Cliente> clientes = td.getClientes();

		for(Cliente cl:clientes){

			if(cl.getUsuarioosiris()!=null)
				cl.setGrupo(td.getGroup(cl.getUsuarioosiris()));
			
			cacheTmp.put(cl.getNombre(),cl);

			revCacheTmp.put(cl.getToken(),cl);

		}
		

		cache=cacheTmp;
		revCache=revCacheTmp;
	}

	public Map<String, Cliente> getRevCache() {
		return revCache;
	}

	public void setRevCache(Map<String, Cliente> revCache) {
		this.revCache = revCache;
	}

	public Cliente getClienteByToken(String token){
		
		
		if(TokenCache.getInstance().getRevCache().get(token)!=null)
			return TokenCache.getInstance().getRevCache().get(token);
		
		cargarCache();
		return TokenCache.getInstance().getRevCache().get(token);
		
	}
	
	static class as{
		String a;
		public as(String a){
			this.a=a;
		}
		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}
		
	}
	
	public static void main(String[] args) {
		as[] arr={new as("a"),new as("b"),new as("c"),new as("d")};
		List<as> list= Arrays.asList(arr);
		Integer i=0;
		
                Map<String, String> result1 = list.stream().collect(
                        Collectors.toMap(as::getA, as::getA));
         
                
                
	}

}
