package it.csi.staris.pdnd.presentation.pdnd.filter;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CharEncodingFilter implements Filter {

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);
	
	//UTF-8
	//ISO 8859-1
	
	private static final String CHAR_ENCODING = "UTF-8"; 
	
	
	
	
	public void destroy() {
		// NOP
	}

	public void init(FilterConfig arg0) throws ServletException {
		// NOP
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fchn) throws IOException, ServletException {
		String method = "doFilter";
		Tracer.debug(log, getClass().getName(), method, "BEGIN");
		try{
			
			
			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "** DEFAULT VALUES ***");
				Tracer.debug(log, getClass().getName(), method, "request char encoding : " + req.getCharacterEncoding());
				Tracer.debug(log, getClass().getName(), method, "response char encoding: " + res.getCharacterEncoding());
			}
			Tracer.debug(log, getClass().getName(), method, "forzo a UTF-8");
			req.setCharacterEncoding(CHAR_ENCODING);
			res.setCharacterEncoding(CHAR_ENCODING);
			
			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "request char encoding : " + req.getCharacterEncoding());
				Tracer.debug(log, getClass().getName(), method, "response char encoding: " + res.getCharacterEncoding());
			}
			
			
			
			
			
			fchn.doFilter(req, res);
			
		} catch (Exception e) {
			Tracer.error(log, getClass().getName(), method, "Exception " + e);
			throw new ServletException(e.getMessage());
			
		} 
		
		finally{
			Tracer.debug(log, getClass().getName(), method, "END");
		}
		
	}

	

}
