package it.csi.staris.pdnd.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ErroreEsitoDto;
import it.csi.staris.pdnd.business.adapter.ErroreEsitoAdapter;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.starissrv.dto.serviziorissrv.Errore;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ErroreEsitoAdapterImpl extends CommonDtoAdapter<ErroreEsitoDto, Errore> implements ErroreEsitoAdapter{


	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;

	

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	

	
	
}
