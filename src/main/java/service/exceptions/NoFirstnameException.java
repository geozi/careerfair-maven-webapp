package service.exceptions;

/**
 * The {@link NoFirstnameException} class is triggered when
 * the Firstname form field is empty.
 */
public class NoFirstnameException extends BaseServiceException {
	
	private static final long serialVersionUID = 1L;

	public NoFirstnameException() {
		super("Firstname field is empty.");
	}

}
