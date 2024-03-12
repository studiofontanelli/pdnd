package it.csi.staris.pdnd.presentation.pdnd.filter;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.EncryptUtil;
import it.csi.staris.pdnd.util.SsoUtil;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegate;

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

public class SsoFilter implements Filter {

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);
	
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
			
			HttpServletRequest hreq = (HttpServletRequest) req;
			SsoUtil ssoUtil = (SsoUtil)SpringApplicationContextManager.getApplicationContext().getBean("ssoUtil");
			EncryptUtil encryptUtil = (EncryptUtil)SpringApplicationContextManager.getApplicationContext().getBean("encryptUtil");
			
			String token = ssoUtil.getToken(hreq);
			
			String checkDigitCalcolato = encryptUtil.getCheckDigit(ssoUtil.getIdDocumento(hreq), token);
			String checkDigit = ssoUtil.getCheckDigit(hreq);
			
			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "token               = " + token);
				Tracer.debug(log, getClass().getName(), method, "checkDigit          = " + checkDigit);
				Tracer.debug(log, getClass().getName(), method, "checkDigitCalcolato = " + checkDigitCalcolato);
			}
			
			if(!StringUtils.equals(checkDigit, checkDigitCalcolato)){
				throw new Exception("Check digit non corrispondente");
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
