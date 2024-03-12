package it.csi.staris.pdnd.business.adapter.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ErroreEsitoDto;
import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.business.adapter.CodiceFiscaleAdapter;
import it.csi.staris.pdnd.business.adapter.DataAsStringAdapter;
import it.csi.staris.pdnd.business.adapter.ErroreEsitoAdapter;
import it.csi.staris.pdnd.business.adapter.EsitoCalcoloTassaAdapter;
import it.csi.staris.pdnd.business.adapter.IdentificativoPagamentoAdapter;
import it.csi.staris.pdnd.business.adapter.RiduzioneAdapter;
import it.csi.staris.pdnd.business.adapter.ScadenzaAdapter;
import it.csi.staris.pdnd.business.adapter.TargaAdapter;
import it.csi.staris.pdnd.business.adapter.TipoRiduzioneAdapter;
import it.csi.staris.pdnd.business.adapter.TipoSanzionamentoAdapter;
import it.csi.staris.pdnd.business.adapter.TipoTargaAdapter;
import it.csi.staris.pdnd.business.adapter.ValiditaAdapter;
import it.csi.staris.pdnd.business.adapter.ValutaAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoCalcoloTassa;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class EsitoCalcoloTassaAdapterImpl extends CommonDtoAdapter<EsitoCalcoloTassaDto, EsitoCalcoloTassa> implements EsitoCalcoloTassaAdapter{


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
	private CodiceFiscaleAdapter codiceFiscaleAdapter;
	
	@Autowired
	private ScadenzaAdapter scadenzaAdapter;
	
	@Autowired
	private ValiditaAdapter validitaAdapter;
	
	@Autowired
	private TipoRiduzioneAdapter tipoRiduzioneAdapter;
	
	@Autowired
	private IdentificativoPagamentoAdapter identificativoPagamentoAdapter;
	
	@Autowired
	private RiduzioneAdapter riduzioneAdapter;
	
	@Autowired
	private TipoSanzionamentoAdapter tipoSanzionamentoAdapter;
	
	@Autowired
	private DataAsStringAdapter dataAsStringAdapter;
	
	@Autowired
	private ValutaAdapter valutaAdapter;
	
	@Autowired
	private ErroreEsitoAdapter erroreEsitoAdapter;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public EsitoCalcoloTassa convertTo(EsitoCalcoloTassaDto t) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}
	@Override
	public EsitoCalcoloTassaDto convertFrom(EsitoCalcoloTassa v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			
			EsitoCalcoloTassaDto esitoCalcoloTassaDto = new EsitoCalcoloTassaDto();
			if(v == null) {
				esitoCalcoloTassaDto.setEsito("KO");
				ErroreEsitoDto erroreDto = new ErroreEsitoDto();
				erroreDto.setCodice("ERRORE_IMPREVISTO");
				erroreDto.setDescrizione("Si e' verificato un errore imprevisto nel calcolo tassa");
				esitoCalcoloTassaDto.setErrori(new ArrayList<ErroreEsitoDto>());
				esitoCalcoloTassaDto.getErrori().add(erroreDto);
				return esitoCalcoloTassaDto;
			}
			
			esitoCalcoloTassaDto.setTarga(targaAdapter.convertFrom(v.getTarga()));
			esitoCalcoloTassaDto.setTipoTarga(tipoTargaAdapter.convertFrom(v.getTipoTarga()));
			esitoCalcoloTassaDto.setScadenza(scadenzaAdapter.convertFrom(v.getScadenza()));
			esitoCalcoloTassaDto.setValidita(validitaAdapter.convertFrom(v.getValidita()));
			esitoCalcoloTassaDto.setCodiceFiscale(codiceFiscaleAdapter.convertFrom(v.getCodiceFiscale()));
			esitoCalcoloTassaDto.setTipoRiduzione(tipoRiduzioneAdapter.convertFrom(v.getTipoRiduzione()));
			esitoCalcoloTassaDto.setIdentificativoPagamento(identificativoPagamentoAdapter.convertFrom(v.getIdentificativoPagamento()));
			esitoCalcoloTassaDto.setRiduzione(riduzioneAdapter.convertFrom(v.getPercentualeRiduzione()));
			esitoCalcoloTassaDto.setEsplicativo(v.getEsplicativo());
			esitoCalcoloTassaDto.setTipoSanzionamento(tipoSanzionamentoAdapter.convertFrom(v.getSanzionamento()));
			esitoCalcoloTassaDto.setTassa(valutaAdapter.convertFrom(v.getTassa()));
			esitoCalcoloTassaDto.setSanzioni(valutaAdapter.convertFrom(v.getSanzioni()));
			esitoCalcoloTassaDto.setInteressi(valutaAdapter.convertFrom(v.getInteressi()));
			esitoCalcoloTassaDto.setTotaleDovuto(valutaAdapter.convertFrom(v.getTotaleDovuto()));
			esitoCalcoloTassaDto.setTotaleDaVersare(valutaAdapter.convertFrom(v.getTotaleDaVersare()));
			esitoCalcoloTassaDto.setUltimoGiornoUtile(dataAsStringAdapter.convertFrom(v.getUltimoGiornoUtile()));
			esitoCalcoloTassaDto.setEsito(v.getEsito());
			
			if(v.getErrori() != null) {
				esitoCalcoloTassaDto.setErrori(erroreEsitoAdapter.convertFrom(v.getErrori().getElencoErrori()));
			}
			
			
			return esitoCalcoloTassaDto;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}

	
	
}
