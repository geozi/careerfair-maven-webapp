package service.exceptions;

/**
 * The {@link ParticipantNotAddedException} class is triggered 
 * when there is an error in adding a new Participant record
 * to the database.
 */
public class ParticipantNotAddedException extends BaseServiceException {
	
	private static final long serialVersionUID = 1L;

	public ParticipantNotAddedException() {
		super("Participant record not added.");
	}

}
