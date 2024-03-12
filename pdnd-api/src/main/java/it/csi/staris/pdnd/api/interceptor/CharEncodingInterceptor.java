package it.csi.staris.pdnd.api.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import org.apache.commons.codec.CharEncoding;
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
public class CharEncodingInterceptor implements PreProcessInterceptor {
	
	protected static final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".interceptor");

	@Context
	HttpServletRequest servletRequest;

	@Override
	public ServerResponse preProcess(HttpRequest request, ResourceMethodInvoker resourceMethod) throws Failure, WebApplicationException {
		String method = "preProcess";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "SET CHAR ENCODING TO " + CharEncoding.UTF_8);
			servletRequest.setCharacterEncoding(CharEncoding.UTF_8);
			//Return null to continue request processing
			return null;
		} catch (Exception e){
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			throw new Failure(method + " - " + e.getMessage(), e);
		}
	}
}