package it.csi.staris.pdnd.integration.service;

import org.springframework.beans.factory.InitializingBean;

import it.csi.staris.pdnd.integration.exception.IntegrationException;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamento;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamentoIUV;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriPagamento;

public interface StarissrvService extends InitializingBean {

	
	
	public boolean testResources() throws IntegrationException; 
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws IntegrationException
	 */
	public EsitoCalcoloTassa calcoloTassa(ParametriCalcoloTassa param )throws IntegrationException; 
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws IntegrationException
	 */
	public EsitoPagamento pagamento(ParametriPagamento param )throws IntegrationException; 
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws IntegrationException
	 */
	public EsitoPagamentoIUV pagamentoIUV(ParametriPagamento param )throws IntegrationException; 
    
}
