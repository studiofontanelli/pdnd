package it.csi.staris.pdnd.api.interceptor;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.ResourceMethodInvoker;
import org.jboss.resteasy.core.ServerResponse;
import org.jboss.resteasy.spi.Failure;
import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.interception.PreProcessInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Environment;
import it.csi.staris.pdnd.util.Tracer;


@Provider
@ServerInterceptor
@Component
public class HeaderInterceptor implements PreProcessInterceptor {
	
	protected static final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".interceptor");

	@Context
	HttpServletRequest servletRequest;
	
	@Autowired
	private Environment environment;
	

	@Override
	public ServerResponse preProcess(HttpRequest request, ResourceMethodInvoker resourceMethod) throws Failure, WebApplicationException {
		String method = "preProcess";
		try {
			Tracer.info(LOG, getClass().getName(), method, "LOG HEADER " + servletRequest.getPathInfo() + " from " + servletRequest.getRemoteAddr());
			HttpHeaders httpHeaders = request.getHttpHeaders();
			MultivaluedMap<String, String> headers = httpHeaders.getRequestHeaders();
			Set<Entry<String, List<String>>> entrySet = headers.entrySet();
			Set<String> key = headers.keySet();
			
			if(LOG.isDebugEnabled()) {
				for (Entry<String, List<String>> e : entrySet) {
					Tracer.debug(LOG, getClass().getName(), method, "HEADER[" + e.getKey() + "]= " + e.getValue());
				}
			}
	
			/*
			String intranet = environment.getPortaleIntranet();
			String internet = environment.getPortaleInternet();
			
			if(key.contains(Constants.HEADER_HOST)) {
				String host = headers.getFirst(Constants.HEADER_HOST);
				Tracer.debug(LOG, getClass().getName(), method, "Host= " + host);
				List<String> ll = new ArrayList<String>();
				if(StringUtils.contains(host, intranet)) {
					ll.add(Constants.PORTALE_ESPOSIZIONE_INTRANET);
				}else if(StringUtils.contains(host, internet)) {
					ll.add(Constants.PORTALE_ESPOSIZIONE_INTERNET);
					
				}else {
					ll.add(Constants.PORTALE_ESPOSIZIONE_UNKNOW);
				}
				if(!ll.isEmpty())
					headers.put(Constants.PORTALE_ESPOSIZIONE, ll);
			}	
			*/
			
			return null;
		} catch (Exception e){
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			throw new Failure(method + " - " + e.getMessage(), e);
		}
	}
}