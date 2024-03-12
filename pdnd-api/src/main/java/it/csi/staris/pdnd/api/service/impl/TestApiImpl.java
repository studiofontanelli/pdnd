package it.csi.staris.pdnd.api.service.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.api.dto.GenericResponse;
import it.csi.staris.pdnd.api.service.TestApi;
import it.csi.staris.pdnd.business.helper.TestResourceHelper;



@Component("testApi")
public class TestApiImpl  extends CommonApiImpl implements TestApi {

	@Autowired
	private TestResourceHelper testResourceHelper;


	@Override
	public Response testResources(SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "testResources";
		GenericResponse response = new GenericResponse();
		boolean testResource = testResourceHelper.testResources();
		if(testResource)
			response.setMessage("TUTTO OK");
		else
			response.setMessage("TEST RESOURCE KO");

		return Response.ok().entity(response).build();
	}


	@Override
	public Response testResourcesV2(SecurityContext securityContext, HttpHeaders httpHeaders) {
		final String method = "testResourcesV2";
		GenericResponse response = new GenericResponse();
		boolean testResource = testResourceHelper.testResources();
		if(testResource)
			response.setMessage("TUTTO OK V2");
		else
			response.setMessage("TEST RESOURCE V2 KO");

		return Response.ok().entity(response).build();
	}



}
