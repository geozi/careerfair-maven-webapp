package dao.exceptions;


/**
 * The {@link ParticipantGetDAOException} is triggered
 * when there is an error in getting a Participant record
 * from the database.
 */
public class ParticipantGetDAOException extends BaseDAOException {
	
	private static final long serialVersionUID = 1L;

	public ParticipantGetDAOException() {
		super("Error in Participant record retrieval.");
	}

}
