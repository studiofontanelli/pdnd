package it.csi.staris.pdnd.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.business.adapter.CodiceFiscaleAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.CodiceFiscale;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class CodiceFiscaleAdapterImpl extends CommonDtoAdapter<String, CodiceFiscale> implements CodiceFiscaleAdapter{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ApplicationContext applicationContext;

	

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public CodiceFiscale convertTo(String t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			CodiceFiscale codiceFiscale = new CodiceFiscale();
			codiceFiscale.setCodFis(t);
			return codiceFiscale;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}


	@Override
	public String convertFrom(CodiceFiscale v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			return v.getCodFis();
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}
}
