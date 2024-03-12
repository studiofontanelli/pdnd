package it.csi.staris.pdnd.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.csi.staris.pdnd.integration.exception.IntegrationException;
import it.csi.staris.pdnd.integration.service.StarissrvService;
import it.csi.staris.pdnd.integration.service.starissrv.stub.Serviziorissrv;
import it.csi.staris.pdnd.integration.service.starissrv.stub.ServiziorissrvSrvServiceLocator;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Environment;
import it.csi.staris.pdnd.util.Tracer;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamento;
import it.csi.staris.starissrv.dto.serviziorissrv.EsitoPagamentoIUV;
import it.csi.staris.starissrv.dto.serviziorissrv.ParametriPagamento;



@Service("starissrvServiceImpl")
public class StarissrvServiceImpl extends ParentIntegrationServiceImpl implements StarissrvService {

	
	@Autowired
	private Environment environment;

	private Serviziorissrv serviziorissrv;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		final String method = "afterPropertiesSet";
		try {			
			
			Tracer.info(LOG, getClass().getName(), method, " endpoint= " + environment.getStarissrvEndpoint());
			ServiziorissrvSrvServiceLocator serviceLocator = new ServiziorissrvSrvServiceLocator();
			serviceLocator.setServiziorissrvSrvPortEndpointAddress(environment.getStarissrvEndpoint());
			serviziorissrv = serviceLocator.getServiziorissrvSrvPort();
			
			//testResources();
			
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
			
		}finally {
			Tracer.info(LOG, getClass().getName(), method, "TEST RESOURCES = " + test);
		}
		return test;
	}

	@Override
	public it.csi.staris.starissrv.dto.serviziorissrv.EsitoCalcoloTassa calcoloTassa(it.csi.staris.starissrv.dto.serviziorissrv.ParametriCalcoloTassa param) throws IntegrationException {
		throw new IntegrationException("NOT IMPLEMENTED YET");
	}

	@Override
	public EsitoPagamento pagamento(ParametriPagamento param) throws IntegrationException {
		throw new IntegrationException("NOT IMPLEMENTED YET");
	}

	@Override
	public EsitoPagamentoIUV pagamentoIUV(ParametriPagamento param) throws IntegrationException {
		throw new IntegrationException("NOT IMPLEMENTED YET");
	}


	

	


	
}
