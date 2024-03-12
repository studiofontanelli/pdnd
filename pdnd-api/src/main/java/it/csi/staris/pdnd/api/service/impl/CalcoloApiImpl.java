package it.csi.staris.pdnd.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;
import it.csi.staris.pdnd.api.service.CalcoloApi;
import it.csi.staris.pdnd.business.helper.CalcoloHelper;



@Component()
public class CalcoloApiImpl  extends CommonApiImpl implements CalcoloApi {

	@Autowired
	private CalcoloHelper calcoloHelper;

	@Override
	public Response calcoloTassaV1(ParametriCalcoloTassaDto body, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.ok().entity(calcoloHelper.calcoloTassaV1(body)).build();
	}



}
