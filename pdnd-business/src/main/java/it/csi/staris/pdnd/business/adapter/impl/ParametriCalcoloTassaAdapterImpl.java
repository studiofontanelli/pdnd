package it.csi.staris.pdnd.business.adapter.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.TipoCalcolo;
import it.csi.staris.pdnd.business.adapter.DataAsStringAdapter;
import it.csi.staris.pdnd.business.adapter.MittenteAdapter;
import it.csi.staris.pdnd.business.adapter.ModalitaCompensazioneAdapter;
import it.csi.staris.pdnd.business.adapter.ParametriCalcoloTassaAdapter;
import it.csi.staris.pdnd.business.adapter.ScadenzaAdapter;
import it.csi.staris.pdnd.business.adapter.TargaAdapter;
import it.csi.staris.pdnd.business.adapter.TipoCalcoloAdapter;
import it.csi.staris.pdnd.business.adapter.TipoTargaAdapter;
import it.csi.staris.pdnd.business.adapter.ValiditaAdapter;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.Regione;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ParametriCalcoloTassaAdapterImpl extends CommonDtoAdapter<ParametriCalcoloTassaDto, ParametriCalcoloTassa> implements ParametriCalcoloTassaAdapter{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private TargaAdapter targaAdapter;
	
	@Autowired
	private TipoTargaAdapter tipoTargaAdapter;
	
	@Autowired
	private TipoCalcoloAdapter tipoCalcoloAdapter;
	
	@Autowired
	private MittenteAdapter mittenteAdapter;
	
	@Autowired
	private ScadenzaAdapter scadenzaAdapter;
	
	@Autowired
	private ValiditaAdapter validitaAdapter;
	
	@Autowired
	private DataAsStringAdapter dataAsStringAdapter;
	
	@Autowired
	private ModalitaCompensazioneAdapter modalitaCompensazioneAdapter;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public ParametriCalcoloTassa convertTo(ParametriCalcoloTassaDto t) throws DtoConversionException {
		final String method = "convertTo";
		try {
			if(t == null) {
				throw new DtoConversionException("Parametri calcolo non valorizzati");
			}
			if(t.getMittente() == null) {
				throw new DtoConversionException("Mittente non valorizzato");
			}
			if(StringUtils.isBlank(t.getMittente().getCodice())) {
				throw new DtoConversionException("Codice Mittente non valorizzato");
			}
			if(StringUtils.isBlank(t.getMittente().getTipoFruitore())) {
				throw new DtoConversionException("Tipo Fruitore Mittente non valorizzato");
			}
			if(StringUtils.isBlank(t.getTipoCalcolo())) {
				throw new DtoConversionException("tipo calcolo non valorizzato");
			}else {
				// VARIFICARE BONTA' TIPO CALCOLO
				
			}
			if(StringUtils.isBlank(t.getTarga())) {
				throw new DtoConversionException("targa non valorizzata");
			}
			/*
			if(StringUtils.isBlank(t.getScadenza())) {
				throw new DtoConversionException("scadenza non valorizzata");
			}
			if(t.getValidita() == null) {
				throw new DtoConversionException("validita' non valorizzata");
			}
			*/
			
			ParametriCalcoloTassa parametriCalcoloTassa = new ParametriCalcoloTassa();
			
			parametriCalcoloTassa.setRegione(new Regione());
			parametriCalcoloTassa.getRegione().setCodice(Constants.COD_REGIONE_PIEMONTE);
			parametriCalcoloTassa.setMittente(mittenteAdapter.convertTo(t.getMittente()));
			parametriCalcoloTassa.setTarga(targaAdapter.convertTo(t.getTarga()));
			parametriCalcoloTassa.setTipoTarga(tipoTargaAdapter.convertTo(t.getTipoTarga()));
			parametriCalcoloTassa.setTipoCalcolo(tipoCalcoloAdapter.convertTo(t.getTipoCalcolo()));
			parametriCalcoloTassa.setScadenza(scadenzaAdapter.convertTo(t.getScadenza()));
			parametriCalcoloTassa.setValidita(validitaAdapter.convertTo(t.getValidita()));
			if(t.isCalcoloRidotto() != null && t.isCalcoloRidotto()) {
				parametriCalcoloTassa.setCalcoloRidotto("S");
			}
			
			if(TipoCalcolo.valueOf(t.getTipoCalcolo()).equals(TipoCalcolo.CPL)){
				Tracer.debug(LOG, getClass().getName(), method, "Modalita compensazione");
				if(t.getCompensazione() == null) {
					throw new DtoConversionException("Compensazione non valorizzata");
				}
				parametriCalcoloTassa.setModalitaCompensazione(modalitaCompensazioneAdapter.convertTo(t.getCompensazione().getModalitaCompensazione()));
				parametriCalcoloTassa.setTipoTargaCompensato(tipoTargaAdapter.convertTo(t.getCompensazione().getTipoTarga()));
				parametriCalcoloTassa.setTargaCompensato(targaAdapter.convertTo(t.getCompensazione().getTarga()));
				parametriCalcoloTassa.setValiditaCompensato(validitaAdapter.convertTo(t.getCompensazione().getValidita()));
				parametriCalcoloTassa.setDataEvento(dataAsStringAdapter.convertTo(t.getCompensazione().getDataEvento()));
				
			}
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "parametriCalcoloTassa\n " + XmlSerializer.objectToXml(parametriCalcoloTassa));
			}
			
			
			return parametriCalcoloTassa;
		}catch(DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw e;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}
	@Override
	public ParametriCalcoloTassaDto convertFrom(ParametriCalcoloTassa v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			ParametriCalcoloTassaDto parametriCalcoloTassaDto = super.convertFrom(v);
			if(parametriCalcoloTassaDto != null) {
				
			}
			return parametriCalcoloTassaDto;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}

	
	
}
