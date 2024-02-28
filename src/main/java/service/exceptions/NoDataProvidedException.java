package service.exceptions;

/**
 * The {@link NoDataProvidedException} class is triggered when
 * no data have been passed from the Registration form to the
 * controller.
 */
public class NoDataProvidedException extends BaseServiceException {
	
	private static final long serialVersionUID = 1L;

	public NoDataProvidedException() {
		super("No data provided in the form.");
	}

}
