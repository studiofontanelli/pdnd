package it.csi.staris.pdnd.business.helper.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.csi.staris.pdnd.util.Constants;
import it.csi.staris.pdnd.util.DataDictionary;


/**
 * Classe comune a tutti gli Helper
 * @author andreafontanelli
 *
 */

@Component
public class CommonHelperImpl  {

	private static final String LOGGER_PREFIX = Constants.APPLICATION_CODE + ".business";
	protected static final Logger LOG = LoggerFactory.getLogger(LOGGER_PREFIX);

	@Autowired
	private DataDictionary  dataDictionary;

	@Autowired
	private ApplicationContext  applicationContext;

	



}
