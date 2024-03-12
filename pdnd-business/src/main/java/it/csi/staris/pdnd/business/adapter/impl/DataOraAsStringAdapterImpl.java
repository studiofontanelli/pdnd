package it.csi.staris.pdnd.business.adapter.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.business.adapter.DataOraAsStringAdapter;
import it.csi.staris.pdnd.util.DateFormat;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.DataOraAsString;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class DataOraAsStringAdapterImpl extends CommonDtoAdapter<Date, DataOraAsString> implements DataOraAsStringAdapter{


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
	public DataOraAsString convertTo(Date t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			DataOraAsString validita = new DataOraAsString();
			validita.setDataOra(DateFormat.format(t, DateFormat.FORMAT_YYYYMMDD));
			return validita;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}	
	}

	@Override
	public Date convertFrom(DataOraAsString v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			return DateFormat.format(v.getDataOra(), DateFormat.FORMAT_YYYYMMDD);
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Formato data " + v.getDataOra() + " non coerente " + DateFormat.FORMAT_YYYYMMDD, e);
		}	
		
	}	
}
