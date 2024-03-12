package it.csi.staris.pdnd.business.adapter.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ErroreEsitoDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoDto;
import it.csi.staris.pdnd.business.adapter.DataOraAsStringAdapter;
import it.csi.staris.pdnd.business.adapter.ErroreEsitoAdapter;
import it.csi.staris.pdnd.business.adapter.EsitoPagamentoAdapter;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.CommonDtoAdapter;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamento;

/**
 * Classe implementativa adapter
 * 
 * @author andreafontanelli
 *
 */
@Component
public class EsitoPagamentoAdapterImpl extends CommonDtoAdapter<EsitoPagamentoDto, EsitoPagamento> implements EsitoPagamentoAdapter{

	/**
	 * 
	 */
	private static final long serialVersionUID = -627330293689873036L;

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private DataOraAsStringAdapter dataOraAsStringAdapter;
	
	@Autowired
	private ErroreEsitoAdapter erroreEsitoAdapter;

	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public EsitoPagamento convertTo(EsitoPagamentoDto t) throws DtoConversionException {
		throw new DtoConversionException("NOT IMPLEMENTED YET");
	}
	@Override
	public EsitoPagamentoDto convertFrom(EsitoPagamento v) throws DtoConversionException {
		final String method = "convertFrom";
		try {
			EsitoPagamentoDto esitoPagamentoDto = new EsitoPagamentoDto();
			if(v == null) {
				esitoPagamentoDto.setEsito("KO");
				ErroreEsitoDto erroreDto = new ErroreEsitoDto();
				erroreDto.setCodice("ERRORE_IMPREVISTO");
				erroreDto.setDescrizione("Si e' verificato un errore imprevisto nel calcolo tassa");
				esitoPagamentoDto.setErrori(new ArrayList<ErroreEsitoDto>());
				esitoPagamentoDto.getErrori().add(erroreDto);
				return esitoPagamentoDto;
			}
			esitoPagamentoDto.setDataPagamento(dataOraAsStringAdapter.convertFrom(v.getDataOraPagamento()));
			esitoPagamentoDto.setEsito(v.getEsito());
			
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
