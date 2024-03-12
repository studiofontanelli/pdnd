package it.csi.staris.pdnd.business.helper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import it.csi.staris.pdnd.business.exception.HelperException;
import it.csi.staris.pdnd.business.helper.TestResourceHelper;
import it.csi.staris.pdnd.integration.service.StarissrvService;
import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.Tracer;

/**
 * Helper di test delle risorse
 * 
 * @author andreafontanelli
 *
 */
@Service()
public class TestResourceHelperImpl extends CommonHelperImpl implements TestResourceHelper {

	@Autowired
	//@Qualifier("starissrvServiceImpl")
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

	



	


}
