package it.csi.staris.pdnd.presentation.pdnd.filter;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.SsoUtil;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DownloadFileValidationFilter implements Filter {

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);
	
	public void destroy() {
		// NOP

	}

	public void init(FilterConfig arg0) throws ServletException {
		// NOO

	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fchn) throws IOException, ServletException {
		String method = "doFilter";
		Tracer.debug(log, getClass().getName(), method, "BEGIN");
		try{
			HttpServletRequest hreq = (HttpServletRequest) req;
			SsoUtil ssoUtil = (SsoUtil)SpringApplicationContextManager.getApplicationContext().getBean("ssoUtil");
		
			String idDocumento = ssoUtil.getIdDocumento(hreq);
			String codiceFruitore = ssoUtil.getCodiceFruitore(hreq);
			String checkDigit = ssoUtil.getCheckDigit(hreq);
			
			
			if (StringUtils.isBlank(idDocumento)){
				throw new Exception("id documento non valorizzato");
			}
			if (StringUtils.isBlank(codiceFruitore)){
				throw new Exception("codice fruitore non valorizzato");
			}
			if (StringUtils.isBlank(checkDigit)){
				throw new Exception("checkDigit non valorizzato");
			}

			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "idDocumento    = " + idDocumento);
				Tracer.debug(log, getClass().getName(), method, "codiceFruitore = " + codiceFruitore);
				Tracer.debug(log, getClass().getName(), method, "checkDigit     = " + checkDigit);
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
