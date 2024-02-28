package dao.exceptions;

/**
 * The {@link ParticipantDeleteDAOException} is triggered
 * when there is an error in deleting a Participant record
 * from the database.
 */
public class ParticipantDeleteDAOException extends BaseDAOException{
	
	private static final long serialVersionUID = 1L;

	public ParticipantDeleteDAOException() {
		super("Error in Participant record deletion.");
	}

}
