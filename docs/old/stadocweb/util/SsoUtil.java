package it.csi.staris.pdnd.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SsoUtil {

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);

	
	public String getIdDocumento(HttpServletRequest req){
		return req.getParameter("idDocumento");	
	}
	
	public String getCodiceFruitore(HttpServletRequest req){
		return req.getParameter("codiceFruitore");	
	}
	
	public String getCheckDigit(HttpServletRequest req){
		return req.getParameter("checkDigit");	
	}
	
	public String getToken(HttpServletRequest req) throws Exception {
		String method = "getToken";
		String token = null;
		try{
			token = (String) req.getHeader(Constants.AUTH_ID_MARKER);
			Tracer.debug(log,  getClass().getName(), method, "token= " + token);
			if(token == null) throw new Exception("token non valorizzato");
		}
		catch(Exception e ){
			Tracer.error(log, getClass().getName(), method, "Exception " + e);
			throw e;
		}
		return token;

	}
	
	

}
