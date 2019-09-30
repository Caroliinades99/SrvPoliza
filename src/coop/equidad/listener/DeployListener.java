package coop.equidad.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import coop.equidad.cache.ServiciosCache;
import coop.laequidad.cache.CacheDetalles;
import coop.laequidad.cache.CacheParametros;
import coop.laequidad.cache.SuscripcionCache;

/**
 * Application Lifecycle Listener implementation class DeployListener
 *
 */
public class DeployListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public DeployListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         ServiciosCache.getInstance();
         CacheParametros.getInstance();
         CacheDetalles.getInstance();
         SuscripcionCache.getInstance();
    }
	
}
