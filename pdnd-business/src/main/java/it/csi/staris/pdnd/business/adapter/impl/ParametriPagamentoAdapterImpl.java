package it.csi.staris.pdnd.business.adapter.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ParametriPagamentoDto;
import it.csi.staris.pdnd.business.adapter.DataAsStringAdapter;
import it.csi.staris.pdnd.business.adapter.IdentificativoPagamentoAdapter;
import it.csi.staris.pdnd.business.adapter.MittenteAdapter;
import it.csi.staris.pdnd.business.adapter.NumeroRicevutaAdapter;
import it.csi.staris.pdnd.business.adapter.ParametriPagamentoAdapter;
import it.csi.staris.pdnd.business.adapter.ScadenzaAdapter;
import it.csi.staris.pdnd.business.adapter.TipoCalcoloAdapter;
import it.csi.staris.pdnd.business.adapter.TipoTargaAdapter;
import it.csi.staris.pdnd.business.adapter.TransazioneEnteAdapter;
import it.csi.staris.pdnd.business.adapter.TransazionePosAdapter;
import it.csi.staris.pdnd.business.adapter.ValiditaAdapter;
import it.csi.staris.pdnd.business.adapter.ValutaAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.XmlSerializer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriPagamento;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class ParametriPagamentoAdapterImpl extends CommonDtoAdapter<ParametriPagamentoDto, ParametriPagamento> implements ParametriPagamentoAdapter{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private IdentificativoPagamentoAdapter identificativoPagamentoAdapter;
	
	@Autowired
	private MittenteAdapter mittenteAdapter;
	
	@Autowired
	private ValutaAdapter valutaAdapter;
	
	@Autowired
	private NumeroRicevutaAdapter numeroRicevutaAdapter;
	
	@Autowired
	private TransazioneEnteAdapter transazioneEnteAdapter;
	
	@Autowired
	private TransazionePosAdapter transazionePosAdapter;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public ParametriPagamento convertTo(ParametriPagamentoDto t) throws DtoConversionException {
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
			if(StringUtils.isBlank(t.getMittente().getIdComunicazione())) {
				throw new DtoConversionException("ID comunicazione non valorizzato");
			}
			if(StringUtils.isBlank(t.getIdentificativoPagamento())) {
				throw new DtoConversionException("Identificativo Pagamento non valorizzato");
			}
			ParametriPagamento parametriPagamento = new ParametriPagamento();
			parametriPagamento.setCreditoUtilizzato(valutaAdapter.convertTo(t.getCreditoUtilizzato()));
			parametriPagamento.setMittente(mittenteAdapter.convertTo(t.getMittente()));
			parametriPagamento.setSpeseDiEsazione(valutaAdapter.convertTo(t.getSpeseEsazione()));
			parametriPagamento.setIdentificativoPagamento(identificativoPagamentoAdapter.convertTo(t.getIdentificativoPagamento()));
			parametriPagamento.setIuv(t.getIuv());
			parametriPagamento.setNumeroRicevuta(numeroRicevutaAdapter.convertTo(t.getNumeroRicevuta()));
			parametriPagamento.setTransazioneEnte(transazioneEnteAdapter.convertTo(t.getTransazioneEnte()));
			parametriPagamento.setTransazionePos(transazionePosAdapter.convertTo(t.getTransazionePos()));
			
			if(LOG.isDebugEnabled()) {
				Tracer.debug(LOG, getClass().getName(), method, "parametriPagamento\n " + XmlSerializer.objectToXml(parametriPagamento));
			}
			return parametriPagamento;
		}catch(DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, "DtoConversionException " + e);
			throw e;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
	}
	@Override
	public ParametriPagamentoDto convertFrom(ParametriPagamento v) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}

	
	
}
