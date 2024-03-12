package it.csi.staris.pdnd.business.adapter.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.business.adapter.ValiditaAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.Validita;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ValiditaAdapterImpl extends CommonDtoAdapter<Integer, Validita> implements ValiditaAdapter{


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
	public Validita convertTo(Integer t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			if(t > 12) {
				throw new DtoConversionException("Valore non consentito");
			}
			Validita validita = new Validita();
			validita.setValidita(StringUtils.leftPad(String.valueOf(t), 2, "0"));
			return validita;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}	
	}

	@Override
	public Integer convertFrom(Validita v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			return Integer.valueOf(v.getValidita());
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}	
		
	}	
}
