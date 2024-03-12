package it.csi.staris.pdnd.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ValutaDto;
import it.csi.staris.pdnd.business.adapter.ValutaAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.Divisa;
import it.csi.staris.starissrv.dto.serviziorissrv.Targa;
import it.csi.staris.starissrv.dto.serviziorissrv.Valuta;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ValutaAdapterImpl extends CommonDtoAdapter<ValutaDto, Valuta> implements ValutaAdapter{


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
	public Valuta convertTo(ValutaDto t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			Valuta valuta = new Valuta();
			valuta.setDivisa(new Divisa());
			valuta.getDivisa().setCodice(t.getDivisa());
			return valuta;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}


	@Override
	public ValutaDto convertFrom(Valuta v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			if(v == null)
				return null;
			ValutaDto dto = new ValutaDto();
			dto.setImporto(Integer.valueOf(v.getImporto()));
			dto.setDivisa(v.getDivisa().getCodice());
			return dto;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}

	
	
}
