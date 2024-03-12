package it.csi.staris.pdnd.business.helper.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.csi.staris.pdnd.api.dto.ErroreEsitoDto;
import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoIUVDto;
import it.csi.staris.pdnd.api.dto.ParametriPagamentoDto;
import it.csi.staris.pdnd.business.adapter.EsitoPagamentoAdapter;
import it.csi.staris.pdnd.business.adapter.EsitoPagamentoIUVAdapter;
import it.csi.staris.pdnd.business.adapter.ParametriPagamentoAdapter;
import it.csi.staris.pdnd.business.exception.HelperException;
import it.csi.staris.pdnd.business.exception.ValidationException;
import it.csi.staris.pdnd.business.helper.PagamentoHelper;
import it.csi.staris.pdnd.integration.exception.IntegrationException;
import it.csi.staris.pdnd.integration.service.StarissrvService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.pdnd.util.adapter.exception.DtoConversionException;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamento;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamentoIUV;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriPagamento;

/**
 * Helper di pagamento
 * 
 * @author andreafontanelli
 *
 */
@Service()
public class PagamentoHelperHelperImpl extends CommonHelperImpl implements PagamentoHelper {

	
	
	private static final String ERROR_CODE_VALIDAZIONE = "100";
	private static final String ERROR_CODE_CONVERSIONE = "101";
	private static final String ERROR_CODE_GENERICO    = "199";
	
	@Autowired
	private ParametriPagamentoAdapter parametriPagamentoAdapter;

	@Autowired
	private EsitoPagamentoIUVAdapter esitoPagamentoIUVAdapter;

	@Autowired
	private EsitoPagamentoAdapter esitoPagamentoAdapter;

	@Autowired
	@Qualifier("starissrvCxfServiceImpl")
	private StarissrvService starissrvService;

	@Override
	public void afterPropertiesSet() throws Exception {
		final String method = "afterPropertiesSet";
		Tracer.info(LOG, getClass().getName(), method, "bean loaded");
	}

	@Override
	public boolean testResources() throws HelperException {
		final String method = "testResources";
		try {
			return starissrvService.testResources();
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, e.getMessage());
			throw new HelperException(Constants.EXCEPTION_MESSAGE + e);
		}
	}

	
	private EsitoPagamentoDto buildEsitoPagamentoDto (String codice, String errore) {
		EsitoPagamentoDto  esito = new EsitoPagamentoDto();
		esito.setEsito("KO");
		ErroreEsitoDto erroreDto = new ErroreEsitoDto();
		erroreDto.setCodice(codice);
		erroreDto.setDescrizione(errore);
		esito.setErrori(new ArrayList<ErroreEsitoDto>());
		esito.getErrori().add(erroreDto);
		return esito;
	}
	
	private EsitoPagamentoIUVDto buildEsitoPagamentoIUVDto (String codice, String errore) {
		EsitoPagamentoIUVDto  esito = new EsitoPagamentoIUVDto();
		esito.setEsito("KO");
		ErroreEsitoDto erroreDto = new ErroreEsitoDto();
		erroreDto.setCodice(codice);
		erroreDto.setDescrizione(errore);
		esito.setErrori(new ArrayList<ErroreEsitoDto>());
		esito.getErrori().add(erroreDto);
		return esito;
	}
	
	@Override
	public EsitoPagamentoDto pagamentoV1(ParametriPagamentoDto param) throws HelperException {
		final String method = "pagamentoV1";
		EsitoPagamentoDto esito = null;
		try {
			ParametriPagamento  parametriPagamento  = parametriPagamentoAdapter.convertTo(param);
			EsitoPagamento esitoPagamento =  starissrvService.pagamento(parametriPagamento);
			return esitoPagamentoAdapter.convertFrom(esitoPagamento);
		}catch(ValidationException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			esito = buildEsitoPagamentoDto(ERROR_CODE_VALIDAZIONE, e.getMessage());
		}catch(DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			esito = buildEsitoPagamentoDto(ERROR_CODE_CONVERSIONE, e.getMessage());
		}catch(IntegrationException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			esito = buildEsitoPagamentoDto(ERROR_CODE_GENERICO, e.getMessage());
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, e.getMessage());
			esito = buildEsitoPagamentoDto(ERROR_CODE_GENERICO, Constants.EXCEPTION_MESSAGE);
		}
		return esito;
	}

	@Override
	public EsitoPagamentoIUVDto pagamentoIUVV1(ParametriPagamentoDto param) throws HelperException {
		final String method = "pagamentoIUVV1";
		EsitoPagamentoIUVDto esito = null;
		try {
			ParametriPagamento  parametriPagamento  = parametriPagamentoAdapter.convertTo(param);
			EsitoPagamentoIUV esitoPagamento =  starissrvService.pagamentoIUV(parametriPagamento);
			esito =  esitoPagamentoIUVAdapter.convertFrom(esitoPagamento);
		}catch(ValidationException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			esito = buildEsitoPagamentoIUVDto(ERROR_CODE_VALIDAZIONE, e.getMessage());
		}catch(DtoConversionException e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE + e);
			esito = buildEsitoPagamentoIUVDto(ERROR_CODE_CONVERSIONE, e.getMessage());
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, e.getMessage());
			esito = buildEsitoPagamentoIUVDto(ERROR_CODE_GENERICO, Constants.EXCEPTION_MESSAGE);
		}
		return esito;
	}








}
