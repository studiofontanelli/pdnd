package it.csi.staris.pdnd.api.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.csi.staris.pdnd.api.provider.ExceptionHandler;
import it.csi.staris.pdnd.util.ApplicationContextManager;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Environment;
import it.csi.staris.pdnd.util.Tracer;



@ApplicationPath("/api")
public class PdndApplication extends Application {

	protected final static Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE);

	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();

	private List<Class> getProviderList(){
		List<Class> l = new ArrayList<Class>();
		l.add(ExceptionHandler.class);
		/*
		
		l.add(LoggingInterceptor.class);
		l.add(SecurityInterceptor.class);
		l.add(CharEncodingInterceptor.class);
		*/
		return l;
	}
	

	public PdndApplication() {
		final String method = "CONSTRUCTOR";
		try {

			Environment env = (Environment)ApplicationContextManager.getBean("environment");
			/*
			if(env.getDevMode()) {
				Tracer.info(LOG, getClass().getName(), method, "DEV MOD ABILITATO");
				CorsFilter corsFilter = new CorsFilter();
		        corsFilter.getAllowedOrigins().add("*");
		        corsFilter.setAllowedMethods("OPTIONS, GET, POST, DELETE, PUT, PATCH");
		        singletons.add(corsFilter);
			}
			*/
			
			// Providers
			for(Class provider : getProviderList()) {
				Tracer.info(LOG, getClass().getName(), method, "adding provider " + provider);
				classes.add(provider);
			}
			
					
			Tracer.info(LOG, getClass().getName(), method, "Startup rest services done correctly!");

		}
		catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception: " + e);
			throw new RuntimeException("Errore infase di startup configurazione servizi rest", e);
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.core.Application#getClasses()
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		return this.singletons;
	}
}
