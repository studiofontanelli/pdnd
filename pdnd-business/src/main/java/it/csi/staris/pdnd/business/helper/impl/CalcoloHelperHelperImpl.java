package it.csi.staris.pdnd.business.helper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.business.adapter.EsitoCalcoloTassaAdapter;
import it.csi.staris.pdnd.business.adapter.ParametriCalcoloTassaAdapter;
import it.csi.staris.pdnd.business.exception.HelperException;
import it.csi.staris.pdnd.business.exception.ValidationException;
import it.csi.staris.pdnd.business.helper.CalcoloHelper;
import it.csi.staris.pdnd.integration.service.StarissrvService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriCalcoloTassa;

/**
 * Helper di test delle risorse
 * 
 * @author andreafontanelli
 *
 */
@Service()
public class CalcoloHelperHelperImpl extends CommonHelperImpl implements CalcoloHelper {

	@Autowired
	private ParametriCalcoloTassaAdapter parametriCalcoloTassaAdapter;

	@Autowired
	private EsitoCalcoloTassaAdapter esitoCalcoloTassaAdapter;

	@Autowired
	//@Qualifier("starissrvServiceImpl")
	@Qualifier("starissrvCxfServiceImpl")
	private StarissrvService starissrvService;

	@Override
	public void afterPropertiesSet() throws Exception {
		final String method = "afterPropertiesSet";
		Tracer.info(LOG, getClass().getName(), method, "bean loaded");
	}

	@Override
	public boolean testResources() throws HelperException {
		final String method = "testResources";
		try {
			return starissrvService.testResources();
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, e.getMessage());
			throw new HelperException(Constants.EXCEPTION_MESSAGE + e);
		}

	}

	@Override
	public EsitoCalcoloTassaDto calcoloTassaV1(ParametriCalcoloTassaDto param) throws HelperException {
		final String method = "calcoloTassaV1";
		try {
			ParametriCalcoloTassa  parametriCalcoloTassa  = parametriCalcoloTassaAdapter.convertTo(param);
			EsitoCalcoloTassa esitoCalcoloTassa =  starissrvService.calcoloTassa(parametriCalcoloTassa);
			return esitoCalcoloTassaAdapter.convertFrom(esitoCalcoloTassa);
		}catch(ValidationException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			throw e;	
		}catch(DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			throw new ValidationException(e.getMessage());	
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, e.getMessage());
			throw new HelperException(Constants.EXCEPTION_MESSAGE + e);
		}
	}

}
