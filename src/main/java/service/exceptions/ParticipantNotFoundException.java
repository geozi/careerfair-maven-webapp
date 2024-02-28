package service.exceptions;

/**
 * The {@link ParticipantNotFoundException} class is triggered when 
 * a Participant record is not found in the database for either one
 * of the following three operations: update, delete, get.
 */
public class ParticipantNotFoundException extends BaseServiceException {
	
	private static final long serialVersionUID = 1L;

	public ParticipantNotFoundException() {
		super("Participant record not found.");
	};

}
