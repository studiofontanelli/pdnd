package it.csi.staris.pdnd.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import it.csi.staris.pdnd.integration.exception.IntegrationException;
import it.csi.staris.pdnd.integration.service.StarissrvService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Environment;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamento;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamentoIUV;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriCalcoloTassa;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriPagamento;
import it.csi.staris.starissrv.exception.serviziorissrv.ErroreImprevistoException;
import it.csi.staris.starissrv.interfacews.serviziorissrv.ServiziorissrvSrv;



@Service("starissrvCxfServiceImpl")
public class StarissrvCxfServiceImpl extends ParentIntegrationServiceImpl implements StarissrvService {

	
	//@Autowired
	private Environment environment;
	
	@Autowired
	private ApplicationContext applicationContext;

	//@Resource
	//@Qualifier("serviziorissrvSrvCxf")
	private ServiziorissrvSrv getServiziorissrSrvCxf() {
		return (ServiziorissrvSrv)applicationContext.getBean("serviziorissrvSrvCxf");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		final String method = "afterPropertiesSet";
		try {			
			
			
			environment = (Environment)applicationContext.getBean("environment");
			
			Tracer.info(LOG, getClass().getName(), method, " endpoint= " + environment.getStarissrvEndpoint());
			
			
			Tracer.info(LOG, getClass().getName(), method, " serviziorissrSrvCxf= " + getServiziorissrSrvCxf());
			
			
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			throw e;
		}
	}
	
	@Override
	public boolean testResources() throws IntegrationException {
		final String method = "testResources";
		boolean test =false;
		try {			
			
			test = true;
			
			
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			Tracer.error(LOG, getClass().getName(), method, "Message: "  + e.getMessage());
			Tracer.error(LOG, getClass().getName(), method, "CAUSE "  + e.getCause());
			test = false;
		}finally {
			Tracer.info(LOG, getClass().getName(), method, "TEST RESOURCES = " + test);
		}
		return test;
	}

	@Override
	public EsitoCalcoloTassa calcoloTassa(ParametriCalcoloTassa param) throws IntegrationException {
		final String method = "calcoloTassa";
		try {
			return getServiziorissrSrvCxf().calcoloTassa(param);
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, Constants.EXCEPTION_MESSAGE  + e);
			Tracer.error(LOG, getClass().getName(), method, "Message: "  + e.getMessage());
			Tracer.error(LOG, getClass().getName(), method, "CAUSE "  + e.getCause());
			throw new IntegrationException("Si e' verificato un errore nel calcolo tassa");
		}
	}

	@Override
	public EsitoPagamento pagamento(ParametriPagamento param) throws IntegrationException {
		final String method = "pagamento";
		try {
			return getServiziorissrSrvCxf().pagamento(param);
		}catch(ErroreImprevistoException e) {
			Tracer.error(LOG, getClass().getName(), method, "Errore Imprevisto Exception "  + e);
			throw new IntegrationException(Constants.EXCEPTION_MESSAGE + ": " + e.getMessage());
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  + e);
			throw new IntegrationException(Constants.EXCEPTION_MESSAGE + ": " + e.getMessage());
		}
	}

	@Override
	public EsitoPagamentoIUV pagamentoIUV(ParametriPagamento param) throws IntegrationException {
		final String method = "pagamentoIUV";
		try {
			return getServiziorissrSrvCxf().pagamentoIUV(param);
		}catch(ErroreImprevistoException e) {
			Tracer.error(LOG, getClass().getName(), method, "Errore Imprevisto Exception "  + e);
			throw new IntegrationException(Constants.EXCEPTION_MESSAGE + ": " + e.getMessage());
		}catch(Exception e) {
			Tracer.error(LOG, getClass().getName(), method, "Exception "  + e);
			throw new IntegrationException(Constants.EXCEPTION_MESSAGE + ": " + e.getMessage());
		}
	}


	

	


	
}
