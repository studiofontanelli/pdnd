/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.staris.pdnd.api.service;

import it.csi.staris.pdnd.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.staris.pdnd.api.dto.ErrorDto;
import it.csi.staris.pdnd.api.dto.EsitoCalcoloTassaDto;
import it.csi.staris.pdnd.api.dto.ParametriCalcoloTassaDto;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/calcolo")


@io.swagger.annotations.Api(description = "the calcolo API")

public interface CalcoloApi  {
   
    @POST
    @Path("/v1/calcolo-tassa")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "servizio che effettua il calcolo tassa", response = EsitoCalcoloTassaDto.class, tags={ "calcolo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = EsitoCalcoloTassaDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response calcoloTassaV1(@ApiParam(value = "request" ) ParametriCalcoloTassaDto body,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
