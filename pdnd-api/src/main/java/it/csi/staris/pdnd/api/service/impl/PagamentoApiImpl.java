package it.csi.staris.pdnd.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.ParametriPagamentoDto;
import it.csi.staris.pdnd.api.service.PagamentoApi;
import it.csi.staris.pdnd.business.helper.PagamentoHelper;



@Component()
public class PagamentoApiImpl  extends CommonApiImpl implements PagamentoApi {

	@Autowired
	private PagamentoHelper pagamentoHelper;

	@Override
	public Response pagamentoIUVV1(ParametriPagamentoDto body, SecurityContext securityContext,HttpHeaders httpHeaders) {
		return Response.ok().entity(pagamentoHelper.pagamentoIUVV1(body)).build();
	}

	@Override
	public Response pagamentoV1(ParametriPagamentoDto body, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.ok().entity(pagamentoHelper.pagamentoV1(body)).build();
	}



}
