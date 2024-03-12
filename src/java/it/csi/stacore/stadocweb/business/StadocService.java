package it.csi.staris.pdnd.business;

import it.csi.stacore.stadoc.dto.stadoc.RequestCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.RequestRecuperaRiferimentoDocumentoFisico;
import it.csi.stacore.stadoc.dto.stadoc.RequestSalvaDocumentoLogico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseCambiaStatoRichiesta;
import it.csi.stacore.stadoc.dto.stadoc.ResponseRecuperaRiferimentoDocumentoFisico;
import it.csi.stacore.stadoc.dto.stadoc.ResponseSalvaDocumentoLogico;
import it.csi.staris.pdnd.exception.ApplicationException;
import it.csi.staris.pdnd.exception.SystemException;

public interface StadocService {
	
	
	public boolean testResource() throws ApplicationException, SystemException;
	
	public ResponseSalvaDocumentoLogico salvaDocumentoLogico(RequestSalvaDocumentoLogico request) throws ApplicationException, SystemException;
	
	public ResponseCambiaStatoRichiesta cambiaStatoRichiesta(RequestCambiaStatoRichiesta request) throws ApplicationException, SystemException;
	
	public ResponseRecuperaRiferimentoDocumentoFisico recuperaRiferimentoDocumentoFisico(RequestRecuperaRiferimentoDocumentoFisico request) throws ApplicationException, SystemException;
	
	
	
}
