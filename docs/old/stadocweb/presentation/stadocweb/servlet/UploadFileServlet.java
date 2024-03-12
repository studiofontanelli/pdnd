package it.csi.staris.pdnd.presentation.pdnd.servlet;


import it.csi.stacore.stadoc.dto.stadoc.Context;
import it.csi.stacore.stadoc.dto.stadoc.Metadati;
import it.csi.stacore.stadoc.dto.stadoc.RequestCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.RequestSalvaDocumentoLogico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.ResponseSalvaDocumentoLogico;
import it.csi.staris.pdnd.business.StadocService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;
import it.csi.util.beanlocatorfactory.SpringApplicationContextManager;
import it.doqui.index.ecmengine.mtom.dto.Attachment;
import it.doqui.index.ecmengine.mtom.dto.MtomNode;
import it.doqui.index.ecmengine.mtom.dto.MtomOperationContext;
import it.doqui.index.ecmengine.mtom.exception.MtomException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.activation.DataHandler;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxrs.ext.multipart.InputStreamDataSource;


public class UploadFileServlet extends CommonFileServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = -8474367686713974177L;
	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);






	/*
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		throw new ServletException("get method not implemented");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String method = "doPost";
		Tracer.debug(log, getClass().getName(), method, "BEGIN");
		ServletOutputStream sos = response.getOutputStream();
		//InputStream is = null;

		it.csi.util.performance.StopWatch watcher = new it.csi.util.performance.StopWatch(Constants.APPLICATION_CODE);
		watcher.start();

		String codiceFruitore=null, folder=null,tipoDocumento = null,codiceFiscale=null,targa=null,idEntitaFruitore=null;

		String info = "";
		try {	

			if (!ServletFileUpload.isMultipartContent(request)) throw new Exception("Formato della richiesta non valido!");

			DiskFileItemFactory dfif = new DiskFileItemFactory();

			//
			File repository = dfif.getRepository();

			if(repository != null){
				Tracer.debug(log, getClass().getName(), method, "reposotory path= " + repository.getAbsolutePath());
			}
			else{
				Tracer.debug(log, getClass().getName(), method, "reposotory is null ");
			}

			ServletFileUpload upload = new ServletFileUpload(dfif);
			List<FileItem> items = upload.parseRequest(request);

			InputStream stream = null;
			String contentType = null;
			String fileName = null;

			for (FileItem item : items) {

				String name = item.getName();
				String fieldName = item.getFieldName();

				if (item.isFormField()) {
					Tracer.debug(log, getClass().getName(), method, "non e' un file");
					Tracer.debug(log, getClass().getName(), method, "param [" + fieldName + "]= " + item.getString());
					if(StringUtils.equalsIgnoreCase("codiceFruitore", fieldName)) 
						codiceFruitore = item.getString();
					if(StringUtils.equalsIgnoreCase("folder", fieldName)) 
						folder = item.getString();
					if(StringUtils.equalsIgnoreCase("tipoDocumento", fieldName)) 
						tipoDocumento = item.getString();
					if(StringUtils.equalsIgnoreCase("codiceFiscale", fieldName)) 
						codiceFiscale = item.getString();
					if(StringUtils.equalsIgnoreCase("targa", fieldName)) 
						targa = item.getString();
					if(StringUtils.equalsIgnoreCase("idEntitaFruitore", fieldName)) 
						idEntitaFruitore = item.getString();



				}
				else{
					Tracer.debug(log, getClass().getName(), method, "e' un file");
					stream = item.getInputStream();
					contentType = item.getContentType();
					fileName = item.getName();

				}


				Tracer.debug(log, getClass().getName(), method, "name      = " + name);
				Tracer.debug(log, getClass().getName(), method, "fieldName = " + fieldName);
				Tracer.debug(log, getClass().getName(), method, "stream = " + stream);

			}


			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "codiceFruitore  = " + codiceFruitore);
				Tracer.debug(log, getClass().getName(), method, "folder          = " + folder);
				Tracer.debug(log, getClass().getName(), method, "tipoDocumento   = " + tipoDocumento);
				Tracer.debug(log, getClass().getName(), method, "codiceFiscale   = " + codiceFiscale);
				Tracer.debug(log, getClass().getName(), method, "targa           = " + targa);
				Tracer.debug(log, getClass().getName(), method, "idEntitaFruitore= " + idEntitaFruitore);


			}

			Tracer.debug(log, getClass().getName(), method, "java.io.tmpdir   = " + System.getProperty("java.io.tmpdir"));


			StadocService stadocService = (StadocService)SpringApplicationContextManager.getApplicationContext().getBean("stadocService");

			Metadati metadati = new Metadati();
			metadati.setCodiceFiscale(codiceFiscale);
			metadati.setTarga(targa);
			metadati.setIdEntitaFruitore(idEntitaFruitore);

			RequestSalvaDocumentoLogico requestSalvaDocumentoLogico = new RequestSalvaDocumentoLogico();
			requestSalvaDocumentoLogico.setCodiceFruitore(codiceFruitore);
			requestSalvaDocumentoLogico.setFolder(folder);
			requestSalvaDocumentoLogico.setTipoDocumento(tipoDocumento);
			requestSalvaDocumentoLogico.setNomeFile(fileName);
			requestSalvaDocumentoLogico.setMetadati(metadati);

			ResponseSalvaDocumentoLogico responseSalvaDocumentoLogico = stadocService.salvaDocumentoLogico(requestSalvaDocumentoLogico);

			Tracer.debug(log, getClass().getName(), method, "salvato empty file  = " + responseSalvaDocumentoLogico.getUuid());
			Tracer.debug(log, getClass().getName(), method, "idDocumento         = " + responseSalvaDocumentoLogico.getIdDocumento());
			Tracer.debug(log, getClass().getName(), method, "idRichiesta         = " + responseSalvaDocumentoLogico.getIdRichiesta());



			Context ctx = responseSalvaDocumentoLogico.getCxt();
			// recupero le info per la configurazione del contesto mtom.
			Tracer.debug(log, getClass().getName(), method, "configurazione mtom...");
			
			if(log.isDebugEnabled()){
				Tracer.debug(log, getClass().getName(), method, "ctx\n " + XmlSerializer.objectToXml(ctx));
			}

			MtomOperationContext context = new MtomOperationContext();
			context.setFruitore(ctx.getFruitore());
			context.setUsername(ctx.getUsername());
			context.setPassword(ctx.getPassword());
			context.setRepository(ctx.getRepository());


			Attachment attachment=new Attachment();

			attachment.attachmentDataHandler=new DataHandler(new InputStreamDataSource(stream, contentType, fileName));

			Tracer.debug(log, getClass().getName(), method, "attachment ok");

			MtomNode node = new MtomNode();
			node.setPrefixedName(ctx.getPrefixedName());
			node.setUid(responseSalvaDocumentoLogico.getUuid());


			RequestCambiaStatoRichiesta requestCambioStatoRichiesta = new RequestCambiaStatoRichiesta();
			requestCambioStatoRichiesta.setCodiceFruitore(codiceFruitore);
			requestCambioStatoRichiesta.setIdDocumento(responseSalvaDocumentoLogico.getIdDocumento());
			requestCambioStatoRichiesta.setIdRichiesta(responseSalvaDocumentoLogico.getIdRichiesta());
			requestCambioStatoRichiesta.setStatoRichiesta(RequestCambiaStatoRichiesta.STATO_RICHIESTA_OK);

			try{

				Tracer.debug(log, getClass().getName(), method, "uploading file " + fileName);
				MtomNode r = getCxf().directUploadMethod(attachment, node, context);

				Tracer.debug(log, getClass().getName(), method, "saved file " + r.getUid());
				
				// cambio lo stato in OK
				stadocService.cambiaStatoRichiesta(requestCambioStatoRichiesta);
				
				Tracer.debug(log, getClass().getName(), method, "stato cambiato correttamente!");
				
			}
			catch(MtomException e){
				Tracer.error(log, getClass().getName(), method, "MtomException " + e);
				// cambio lo stato in KO
				requestCambioStatoRichiesta.setStatoRichiesta(RequestCambiaStatoRichiesta.STATO_RICHIESTA_KO);
				stadocService.cambiaStatoRichiesta(requestCambioStatoRichiesta);
			}

		} catch (Exception e) {
			Tracer.error(log, getClass().getName(), method, "Exception " + e);
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());

		} finally {
			watcher.stop();
			watcher.dumpElapsed(getClass().getName(), method,"upload file", "info file: (" + info + ")");
			Tracer.debug(log, getClass().getName(), method, "END");
		}
	}
}
