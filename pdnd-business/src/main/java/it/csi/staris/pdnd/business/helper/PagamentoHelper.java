package it.csi.staris.pdnd.business.helper;

import org.springframework.beans.factory.InitializingBean;

import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoIUVDto;
import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.ParametriPagamentoDto;
import it.csi.staris.pdnd.business.exception.HelperException;
import it.csi.staris.pdnd.integration.service.starissrv.stub.ParametriPagamento;
/**
 * 
 * @author andreafontanelli
 *
 */
public interface PagamentoHelper extends InitializingBean {

	
	/**
	 * 
	 * @return
	 * @throws HelperException
	 */
	public boolean testResources() throws HelperException;
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws HelperException
	 */
	public EsitoPagamentoDto pagamentoV1(ParametriPagamentoDto param) throws HelperException;
	
	
	/**
	 * 
	 * @param param
	 * @return
	 * @throws HelperException
	 */
	public EsitoPagamentoIUVDto pagamentoIUVV1(ParametriPagamentoDto param) throws HelperException;
	
	
	
	
	
}
