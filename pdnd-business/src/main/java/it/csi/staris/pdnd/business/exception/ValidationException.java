package it.csi.staris.pdnd.business.exception;

import java.util.List;

import it.csi.staris.pdnd.business.dto.ErrorDetailDto;



/**
 * Eccezione gettata in caso di fallita validazione
 * 
 * @author andreafontanelli
 *
 */
public class ValidationException extends HelperException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1857783336963631825L;

	public ValidationException() {
		super();
	}

	public ValidationException(List<ErrorDetailDto> errorDetails) {
		super();
		this.errorDetails = errorDetails;
	}

	public ValidationException(String message, List<ErrorDetailDto> errorDetails) {
		super(message);
		this.errorDetails = errorDetails;

	}


	public ValidationException(String message) {
		super(message);

	}


}