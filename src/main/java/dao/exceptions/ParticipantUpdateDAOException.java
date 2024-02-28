package dao.exceptions;

/**
 * The {@link ParticipantUpdateDAOException} is triggered
 * when there is an error in updating a Participant record
 * in the database.
 */
public class ParticipantUpdateDAOException extends BaseDAOException {
	
	private static final long serialVersionUID = 1L;

	public ParticipantUpdateDAOException() {
		super("Error in Participant record update.");
	}

}
