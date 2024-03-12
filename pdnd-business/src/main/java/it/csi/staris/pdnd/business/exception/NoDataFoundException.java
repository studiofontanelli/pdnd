package it.csi.staris.pdnd.business.exception;

import java.util.List;

import it.csi.staris.pdnd.business.dto.ErrorDetailDto;



/**
 * Eccezione gettata quando non vengono trovati risultati
 * 
 * @author andreafontanelli
 *
 */
public class NoDataFoundException extends HelperException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1857783336963631825L;

	public NoDataFoundException() {
		super();
	}

	public NoDataFoundException(List<ErrorDetailDto> errorDetails) {
		super();
		this.errorDetails = errorDetails;
	}

	public NoDataFoundException(String message, List<ErrorDetailDto> errorDetails) {
		super(message);
		this.errorDetails = errorDetails;

	}

	public NoDataFoundException(String message) {
		super(message);

	}
}