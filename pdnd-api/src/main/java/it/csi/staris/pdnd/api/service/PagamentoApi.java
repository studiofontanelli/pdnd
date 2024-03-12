/**********************************************
 * CSI PIEMONTE 
 **********************************************/
package it.csi.staris.pdnd.api.service;

import it.csi.staris.pdnd.api.dto.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import it.csi.staris.pdnd.api.dto.ErrorDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoDto;
import it.csi.staris.pdnd.api.dto.EsitoPagamentoIUVDto;
import it.csi.staris.pdnd.api.dto.ParametriPagamentoDto;

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

@Path("/pagamento")


@io.swagger.annotations.Api(description = "the pagamento API")

public interface PagamentoApi  {
   
    @POST
    @Path("/v1/iuv")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "servizio che effettua il calcolo pagamento", response = EsitoPagamentoIUVDto.class, tags={ "pagamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = EsitoPagamentoIUVDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Errore di validazione input", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response pagamentoIUVV1(@ApiParam(value = "request" ) ParametriPagamentoDto body,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
    @POST
    @Path("/v1")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "servizio che effettua il calcolo pagamento", response = EsitoPagamentoDto.class, tags={ "pagamento", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = EsitoPagamentoDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Errore di validazione input", response = ErrorDto.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error", response = ErrorDto.class) })
    public Response pagamentoV1(@ApiParam(value = "request" ) ParametriPagamentoDto body,@Context SecurityContext securityContext, @Context HttpHeaders httpHeaders );
}
