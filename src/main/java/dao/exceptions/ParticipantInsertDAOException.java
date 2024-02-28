package dao.exceptions;

/**
 * The {@link ParticipantInsertDAOException} is triggered
 * when there is an error in inserting a new Participant record
 * to the database.
 */
public class ParticipantInsertDAOException extends BaseDAOException {
	
	private static final long serialVersionUID = 1L;

	public ParticipantInsertDAOException() {
		super("Error in Participant record addition.");
	}
}
