package it.csi.staris.pdnd.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("environment")
public class Environment {



	
	@Value("${xsrf.validation.disabled}")
	private Boolean xsrfValidationDisabled;
	
	@Value("${starissrv.service.endpoint.url}")
	private String starissrvEndpoint;


	public Boolean getXsrfValidationDisabled() {
		return xsrfValidationDisabled;
	}

	public void setXsrfValidationDisabled(Boolean xsrfValidationDisabled) {
		this.xsrfValidationDisabled = xsrfValidationDisabled;
	}

	public String getStarissrvEndpoint() {
		return starissrvEndpoint;
	}

	public void setStarissrvEndpoint(String starissrvEndpoint) {
		this.starissrvEndpoint = starissrvEndpoint;
	}
	

}
