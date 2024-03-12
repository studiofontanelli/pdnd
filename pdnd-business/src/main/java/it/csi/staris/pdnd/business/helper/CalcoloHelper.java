package it.csi.staris.pdnd.business.helper;

import org.springframework.beans.factory.InitializingBean;

import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.business.exception.HelperException;
/**
 * 
 * @author andreafontanelli
 *
 */
public interface CalcoloHelper extends InitializingBean {

	
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
	public EsitoCalcoloTassaDto calcoloTassaV1(ParametriCalcoloTassaDto param) throws HelperException;
	
	
	
	
	
}
