package it.csi.staris.pdnd.presentation.pdnd.servlet;


import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegate;

import javax.servlet.http.HttpServlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class CommonFileServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8203522274889951641L;

	

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);

	
	
	public EcmEngineMtomDelegate getCxf() throws Exception{
		String method = "getCxf";
		Tracer.debug(log, getClass().getName(), method, "loading cxf");
		EcmEngineMtomDelegate delegate = (EcmEngineMtomDelegate)SpringApplicationContextManager.getApplicationContext().getBean("cxfMtomDelegate");
		Tracer.debug(log, getClass().getName(), method, "cxf loaded");
		return delegate;
	}

	

	
}
