package it.csi.staris.pdnd.api.interceptor;

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
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;


@Provider
@ServerInterceptor
@Component
public class SecurityInterceptor implements PreProcessInterceptor {
	
	protected static final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".interceptor");

	@Context
	HttpServletRequest servletRequest;

	@Override
	public ServerResponse preProcess(HttpRequest request, ResourceMethodInvoker resourceMethod) throws Failure, WebApplicationException {
		String method = "preProcess";
		try {
			Tracer.info(LOG, getClass().getName(), method, "check auth " + servletRequest.getPathInfo() + " from " + servletRequest.getRemoteAddr());
			HttpHeaders httpHeaders = request.getHttpHeaders();
			MultivaluedMap<String, String> headers = httpHeaders.getRequestHeaders();
			Set<String> key = headers.keySet();
			/*
			if(!key.contains(Constants.HEADER_SHIBBOLETH_IDENTITY)) {
				Tracer.error(LOG, getClass().getName(), method, "Identita Iride non trovata");
				throw new Failure("Identita Iride non trovata");
			} 
			Tracer.info(LOG, getClass().getName(), method, "Auth OK for " + servletRequest.getPathInfo());
			*/
			//Return null to continue request processing
			return null;
		} catch (Exception e){
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			throw new Failure(method + " - " + e.getMessage(), e);
		}
	}
}