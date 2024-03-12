package it.csi.staris.pdnd.business.adapter.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.business.adapter.ScadenzaAdapter;
import it.csi.staris.pdnd.util.DateFormat;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.Scadenza;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ScadenzaAdapterImpl extends CommonDtoAdapter<String, Scadenza> implements ScadenzaAdapter{


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
	public Scadenza convertTo(String t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			Date dd =  DateFormat.format(t, DateFormat.FORMAT_MM_BACKSLASH_DDDD);
			Scadenza scadenza = new Scadenza();
			scadenza.setScadenza(DateFormat.format(dd, DateFormat.FORMAT_YYYYMM));
			return scadenza;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Formato data non corretto ", e);
		}
	}


	@Override
	public String convertFrom(Scadenza v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			return v.getScadenza();
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Formato data non corretto ", e);
		}
	}

	
	
}
