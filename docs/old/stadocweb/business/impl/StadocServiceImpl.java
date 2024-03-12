package it.csi.staris.pdnd.business.impl;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import it.csi.csi.porte.InfoPortaDelegata;
import it.csi.csi.porte.proxy.PDProxy;
import it.csi.csi.util.xml.PDConfigReader;
import it.csi.csi.wrapper.CSIException;
import it.csi.csi.wrapper.UnrecoverableException;
import it.csi.stacore.stadoc.dto.stadoc.RequestCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.RequestRecuperaRiferimentoDocumentoFisico;
import it.csi.stacore.stadoc.dto.stadoc.RequestSalvaDocumentoLogico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.ResponseRecuperaRiferimentoDocumentoFisico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseSalvaDocumentoLogico;
import it.csi.stacore.stadoc.exception.stadoc.CambiaStatoRichiestaException;
import it.csi.stacore.stadoc.exception.stadoc.RecuperaRiferimentoDocumentoFisicoException;
import it.csi.stacore.stadoc.exception.stadoc.SalvaDocumentoException;
import it.csi.stacore.stadoc.interfacecsi.stadoc.StadocSrv;
import it.csi.staris.pdnd.business.StadocService;
import it.csi.staris.pdnd.exception.ApplicationException;
import it.csi.staris.pdnd.exception.SystemException;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;

public class StadocServiceImpl implements StadocService {

	private  Log log = LogFactory.getLog(Constants.APPLICATION_CODE);


	private final static String URL_PA_SOAP = "url.pa.soap";

	private StadocSrv stadocSrv;

	private String pdFile;

	public String getPdFile() {
		return pdFile;
	}

	public void setPdFile(String pdFile) {
		this.pdFile = pdFile;
	}

	public void init(){
		String method = "init";
		try{

			Tracer.debug(log,  getClass().getName(), method, "pdFile= " + pdFile);

			InputStream is = this.getClass().getResourceAsStream(pdFile);
			InfoPortaDelegata info = PDConfigReader.read(is);
			stadocSrv = (StadocSrv) PDProxy.newInstance(info);
			Tracer.info(log,  getClass().getName(), method, "service loaded correclty!");

			try {
				InfoPortaDelegata[] infoPortaDelegataArray =  info.getPlugins();
				InfoPortaDelegata portaDelegata = infoPortaDelegataArray[0];
				Tracer.info(log, getClass().getName(), method, URL_PA_SOAP    + "= " +portaDelegata.getUrlPortaApplicativa());
			}
			catch(Exception e ) {
				Tracer.warn(log,  getClass().getName(), method, "Non sono riuscito a leggere la PD " + e);
			}
		}
		catch(Exception e){
			Tracer.error(log,  getClass().getName(), method, "Exception " + e);
			throw new RuntimeException();
		}
	}


	public boolean testResource() throws ApplicationException, SystemException {
		String method = "testResource";

		boolean b = false;
		try {
			Tracer.debug(log,  getClass().getName(), method, "calling test resource...");
			b = stadocSrv.testResources();
			Tracer.debug(log,  getClass().getName(), method, "test resource OK!");
		}
		catch (CSIException e) {
			Tracer.error(log,  getClass().getName(), method, "CSIException");
			throw new SystemException(e.getMessage());
		}
		catch (Exception e) {
			Tracer.error(log,  getClass().getName(), method, "Exception");
			throw new SystemException(e.getMessage());
		}
		return b;


	}

	public ResponseSalvaDocumentoLogico salvaDocumentoLogico(RequestSalvaDocumentoLogico request) throws ApplicationException, SystemException {
		String method = "salvaDocumentoLogico";
		try {

			return stadocSrv.salvaDocumentoLogico(request);

		} catch (SalvaDocumentoException e) {
			Tracer.error(log,  getClass().getName(), method, "SalvaDocumentoException " + e);
			throw new ApplicationException(e.getMessage());
		} catch (it.csi.csi.wrapper.SystemException e) {
			Tracer.error(log,  getClass().getName(), method, "SystemException " + e);
			throw new SystemException(e.getMessage());
		} catch (UnrecoverableException e) {
			Tracer.error(log,  getClass().getName(), method, "UnrecoverableException " + e);
			throw new SystemException(e.getMessage());
		} catch (CSIException e) {
			Tracer.error(log,  getClass().getName(), method, "CSIException " + e);
			throw new SystemException(e.getMessage());
		}





	}

	public ResponseCambiaStatoRichiesta cambiaStatoRichiesta(RequestCambiaStatoRichiesta request) throws ApplicationException, SystemException {
		String method = "cambiaStatoRichiesta";
		try {
			return stadocSrv.cambiaStatoRichiesta(request);

		} catch (CambiaStatoRichiestaException e) {
			Tracer.error(log,  getClass().getName(), method, "CambiaStatoRichiestaException " + e);
			throw new ApplicationException(e.getMessage());
		} catch (it.csi.csi.wrapper.SystemException e) {
			Tracer.error(log,  getClass().getName(), method, "SystemException " + e);
			throw new SystemException(e.getMessage());
		} catch (UnrecoverableException e) {
			Tracer.error(log,  getClass().getName(), method, "UnrecoverableException " + e);
			throw new SystemException(e.getMessage());
		} catch (CSIException e) {
			Tracer.error(log,  getClass().getName(), method, "CSIException " + e);
			throw new SystemException(e.getMessage());
		}

	}


	public ResponseRecuperaRiferimentoDocumentoFisico recuperaRiferimentoDocumentoFisico(RequestRecuperaRiferimentoDocumentoFisico request) throws ApplicationException, SystemException {
		String method = "recuperaRiferimentoDocumentoFisico";
		try {
			return stadocSrv.recuperaRiferimentoDocumentoFisico(request);

		} catch (RecuperaRiferimentoDocumentoFisicoException e) {
			Tracer.error(log,  getClass().getName(), method, "RecuperaRiferimentoDocumentoFisicoException " + e);
			throw new ApplicationException(e.getMessage());
		} catch (it.csi.csi.wrapper.SystemException e) {
			Tracer.error(log,  getClass().getName(), method, "SystemException " + e);
			throw new SystemException(e.getMessage());
		} catch (UnrecoverableException e) {
			Tracer.error(log,  getClass().getName(), method, "UnrecoverableException " + e);
			throw new SystemException(e.getMessage());
		} catch (CSIException e) {
			Tracer.error(log,  getClass().getName(), method, "CSIException " + e);
			throw new SystemException(e.getMessage());
		}

	}



}
