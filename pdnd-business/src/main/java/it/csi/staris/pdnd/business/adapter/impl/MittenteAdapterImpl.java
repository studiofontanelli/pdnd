package it.csi.staris.pdnd.business.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.MittenteDto;
import it.csi.staris.pdnd.business.adapter.MittenteAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.Mittente;
import it.csi.staris.starissrv.dto.serviziorissrv.TipoFruitore;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class MittenteAdapterImpl extends CommonDtoAdapter<MittenteDto, Mittente> implements MittenteAdapter{


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
	public Mittente convertTo(MittenteDto t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null)
				return null;
			Mittente mittente = new Mittente();
			mittente.setCodice(t.getCodice());
			mittente.setTipoFruitore(new TipoFruitore());
			mittente.getTipoFruitore().setCodice(t.getTipoFruitore());
			mittente.setIdComunicazione(t.getIdComunicazione());
			return mittente;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}

	@Override
	public MittenteDto convertFrom(Mittente v) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}
	
}
