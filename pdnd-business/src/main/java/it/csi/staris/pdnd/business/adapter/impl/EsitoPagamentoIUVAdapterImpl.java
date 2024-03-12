package it.csi.staris.pdnd.business.adapter.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ErroreEsitoDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoIUVDto;
import it.csi.staris.pdnd.business.adapter.CodiceFiscaleAdapter;
import it.csi.staris.pdnd.business.adapter.DataOraAsStringAdapter;
import it.csi.staris.pdnd.business.adapter.ErroreEsitoAdapter;
import it.csi.staris.pdnd.business.adapter.EsitoPagamentoIUVAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.Errore;
import it.csi.staris.starissrv.dto.serviziorissrv.Errori;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamentoIUV;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class EsitoPagamentoIUVAdapterImpl extends CommonDtoAdapter<EsitoPagamentoIUVDto, EsitoPagamentoIUV> implements EsitoPagamentoIUVAdapter{

	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ErroreEsitoAdapter erroreEsitoAdapter;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public EsitoPagamentoIUV convertTo(EsitoPagamentoIUVDto t) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}
	@Override
	public EsitoPagamentoIUVDto convertFrom(EsitoPagamentoIUV v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			EsitoPagamentoIUVDto esitoPagamentoDto = new EsitoPagamentoIUVDto();
			if(v == null) {
				esitoPagamentoDto.setEsito("KO");
				ErroreEsitoDto erroreDto = new ErroreEsitoDto();
				erroreDto.setCodice("ERRORE_IMPREVISTO");
				erroreDto.setDescrizione("Si e' verificato un errore imprevisto nel calcolo tassa");
				esitoPagamentoDto.setErrori(new ArrayList<ErroreEsitoDto>());
				esitoPagamentoDto.getErrori().add(erroreDto);
				return esitoPagamentoDto;
			}
			esitoPagamentoDto.setCodiceFiscaleEnte(v.getCodiceFiscaleEnte());
			esitoPagamentoDto.setEsito(v.getEsito());
			esitoPagamentoDto.setIuv(v.getIuv());
			esitoPagamentoDto.setTotale(v.getTotale());
			
			if(v.getErrori() != null) {
				esitoPagamentoDto.setErrori(erroreEsitoAdapter.convertFrom(v.getErrori().getElencoErrori()));
			}
			return esitoPagamentoDto;
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception " + e);
			throw new DtoConversionException("Errore in fase di conversione ", e);
		}
		
	}

	
	
}
