package it.csi.staris.pdnd.presentation.pdnd.servlet;


import it.csi.stacore.stadoc.dto.stadoc.Context;
import it.csi.stacore.stadoc.dto.stadoc.RequestCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.RequestRecuperaRiferimentoDocumentoFisico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseRecuperaRiferimentoDocumentoFisico;
import it.csi.staris.pdnd.business.StadocService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.SsoUtil;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegate;
import it.doqui.index.ecmengine.client.mtom.EcmEngineMtomDelegateImpl;
import it.doqui.index.ecmengine.mtom.dto.Attachment;
import it.doqui.index.ecmengine.mtom.dto.MtomNode;
import it.doqui.index.ecmengine.mtom.dto.MtomOperationContext;
import it.doqui.index.ecmengine.mtom.exception.MtomException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

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
import org.apache.cxf.wsdl.http.UrlEncoded;


public class DownloadFileServlet extends CommonFileServlet {
	
	
	private static final String CODICE_FRUITORE_STADOC_CAMBIO_STATO_RICHIESTA = "DW_CONSDOC";

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
		ServletOutputStream sos = response.getOutputStream();
		InputStream is = null;

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch(Constants.APPLICATION_CODE);
		watcher.start();

		String info = "";
		
		
		try {	
			
			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "request char encoding : " + request.getCharacterEncoding());
				Tracer.debug(log, getClass().getName(), method, "response char encoding: " + response.getCharacterEncoding());
			}
			
			SsoUtil ssoUtil = (SsoUtil)SpringApplicationContextManager.getApplicationContext().getBean("ssoUtil");
			
			/*
			 * parametri di business
			 * codiceFruitore: codice del fruitore 
			 * idDocumento: id (stadoc) del document che si vuole ottenere (al momento � l'uuid solo in questa fase)
			 * 
			 * 
			 */
			
			String idDocumento = ssoUtil.getIdDocumento(request);
			String codiceFruitore = ssoUtil.getCodiceFruitore(request);
			

			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "idDocumento    = " + idDocumento);
				Tracer.debug(log, getClass().getName(), method, "codiceFruitore = " + codiceFruitore);
			}
			
			
			
			StadocService stadocService = (StadocService)SpringApplicationContextManager.getApplicationContext().getBean("stadocService");
			
			
			RequestRecuperaRiferimentoDocumentoFisico requestRiferimentoDocumentoFisico = new RequestRecuperaRiferimentoDocumentoFisico();
			requestRiferimentoDocumentoFisico.setCodiceFruitore(codiceFruitore);
			requestRiferimentoDocumentoFisico.setIdDocumento(idDocumento);
			
			Tracer.debug(log, getClass().getName(), method, "calling recuperaRiferimentoDocumentoFisico");
			ResponseRecuperaRiferimentoDocumentoFisico responseRecuperaRiferimentoDocFisico = stadocService.recuperaRiferimentoDocumentoFisico(requestRiferimentoDocumentoFisico);
			
			
			String uuid = responseRecuperaRiferimentoDocFisico.getUuid();

			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "uuid= " + uuid);
			}
			
			
			
			Context ctx = responseRecuperaRiferimentoDocFisico.getCxt(); 
			MtomOperationContext context = new MtomOperationContext();
			context.setFruitore(ctx.getFruitore());
			context.setUsername(ctx.getUsername());
			context.setPassword(ctx.getPassword());
			context.setRepository(ctx.getRepository());

			
			MtomNode node = new MtomNode();
			node.setPrefixedName(ctx.getPrefixedName());
			node.setUid(uuid);

			Tracer.debug(log, getClass().getName(), method, "loading file " + uuid);
			
			
			RequestCambiaStatoRichiesta requestCambioStatoRichiesta = new RequestCambiaStatoRichiesta();
			requestCambioStatoRichiesta.setCodiceFruitore(CODICE_FRUITORE_STADOC_CAMBIO_STATO_RICHIESTA);
			requestCambioStatoRichiesta.setIdDocumento(idDocumento);
			requestCambioStatoRichiesta.setIdRichiesta(responseRecuperaRiferimentoDocFisico.getIdRichiesta());
			requestCambioStatoRichiesta.setStatoRichiesta(RequestCambiaStatoRichiesta.STATO_RICHIESTA_OK);
			
			
			try{
				if(log.isDebugEnabled()){
					Tracer.debug(log, getClass().getName(), method, "tracing....");
					Tracer.debug(log, getClass().getName(), method, "Context \n " + XmlSerializer.objectToXml(ctx));
					Tracer.debug(log, getClass().getName(), method, "MtomNode \n " + XmlSerializer.objectToXml(node));					
				}
				
				
				Attachment attachment = getCxf().downloadMethod(node, context);
				
				
				Tracer.debug(log, getClass().getName(), method, "dowload file ok!");
				
				if(log.isDebugEnabled()){
					Tracer.debug(log, getClass().getName(), method, "tracing....");
					Tracer.debug(log, getClass().getName(), method, "file name    =  " + attachment.fileName);
					Tracer.debug(log, getClass().getName(), method, "file size    =  " + attachment.fileSize);
					Tracer.debug(log, getClass().getName(), method, "file type    =  " + attachment.fileType);
					Tracer.debug(log, getClass().getName(), method, "tracing OK");
				}
				
				DataHandler data = attachment.attachmentDataHandler;
				response.setHeader("Content-disposition", "attachment; filename="+ attachment.fileName);			
				response.setContentType(attachment.fileType);
				response.setContentLength((int) attachment.fileSize);


				is = data.getInputStream();
				byte[] b = new byte[1024];
				int bytesRead = 0;
				while ((bytesRead = is.read(b)) != -1) {
					sos.write(b, 0, bytesRead);
				}
				
				info = "fruitore= " + codiceFruitore + "; file= " + attachment.fileName;
				
				
				
				// cambio lo stato in OK
				stadocService.cambiaStatoRichiesta(requestCambioStatoRichiesta);
				
				Tracer.debug(log, getClass().getName(), method, "stato cambiato correttamente!");
			
			} catch(MtomException e){
				Tracer.error(log, getClass().getName(), method, "MtomException " + e);
				// cambio lo stato in KO
				requestCambioStatoRichiesta.setStatoRichiesta(RequestCambiaStatoRichiesta.STATO_RICHIESTA_KO);
				stadocService.cambiaStatoRichiesta(requestCambioStatoRichiesta);
				throw new Exception("Impossibile scaricare il documento richiesto");
			}
			
		} catch (Exception e) {
			Tracer.error(log, getClass().getName(), method, "Exception " + e);
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
			
		} finally {
			sos.flush();
			if (is != null)
				is.close();
			sos.close();
			watcher.stop();
			watcher.dumpElapsed(getClass().getName(), method,"download file", "info file: (" + info + ")");
			Tracer.debug(log, getClass().getName(), method, "END");
		}
	}
}
