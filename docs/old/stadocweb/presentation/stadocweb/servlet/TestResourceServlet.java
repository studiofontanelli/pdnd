package it.csi.staris.pdnd.presentation.pdnd.servlet;


import it.csi.staris.pdnd.business.StadocService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.SsoUtil;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegate;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegateImpl;
import it.doqui.index.ecmengine.mtom.dto.Attachment;
import it.doqui.index.ecmengine.mtom.dto.MtomNode;
import it.doqui.index.ecmengine.mtom.dto.MtomOperationContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.activation.DataHandler;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class TestResourceServlet extends CommonFileServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4645206415617537462L;

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		throw new ServletException("Post not implemented!");
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String method = "doGet";
		Tracer.debug(log, getClass().getName(), method, "BEGIN");
		

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch(Constants.APPLICATION_CODE);
		watcher.start();

		
		try {	
			
			StadocService stadocService = (StadocService)SpringApplicationContextManager.getApplicationContext().getBean("stadocService");
			
			
			String result = (stadocService.testResource()) ? "OK" : "KO";
			
			response.setContentType("text/html");
		    PrintWriter out = response.getWriter();

		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Test respurce</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1>");
		    out.println("Test resource: " + result);
		    out.println("</h1>");
		    out.println("</body>");
		    out.println("</html>");
			

		} catch (Exception e) {
			Tracer.error(log, getClass().getName(), method, "Exception " + e);
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
			
		} finally {
			watcher.stop();
			watcher.dumpElapsed(getClass().getName(), method, "test respource", "test resource");
			Tracer.debug(log, getClass().getName(), method, "END");
		}
	}
}
