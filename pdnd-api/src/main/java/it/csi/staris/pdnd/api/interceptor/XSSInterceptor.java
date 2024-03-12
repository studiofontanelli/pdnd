package it.csi.staris.pdnd.api.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.spi.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;


@Provider
@ServerInterceptor
@Component
public class XSSInterceptor implements ReaderInterceptor {
	
	protected static final Logger LOG = LoggerFactory.getLogger(Constants.APPLICATION_CODE  + ".interceptor");

	@Context
	HttpServletRequest servletRequest;

	@Override
	public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
		String method = "aroundReadFrom";
		try {
			Tracer.debug(LOG, getClass().getName(), method, "check XSS " + servletRequest.getPathInfo() + " from " + servletRequest.getRemoteAddr());
			//final InputStream inputStream = context.getInputStream();
	        //context.setInputStream(new GZIPInputStream(inputStream));
	        return context.proceed();
		} catch (Exception e){
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			throw new Failure(method + " - " + e.getMessage(), e);
		}
			
	}
}