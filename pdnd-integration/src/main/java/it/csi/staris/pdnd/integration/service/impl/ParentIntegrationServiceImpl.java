package it.csi.staris.pdnd.integration.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import it.csi.staris.pdnd.integration.exception.IntegrationException;
import it.csi.staris.pdnd.util.Constants;

public abstract class ParentIntegrationServiceImpl {

	protected static final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_PREFIX);

	@Autowired
	protected ApplicationContext applicationContext;
	
	
	
	
	
	
}
