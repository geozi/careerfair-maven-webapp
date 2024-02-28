package dao;

import java.util.HashMap;

import dao.db.Database;
import dao.exceptions.BaseDAOException;
import dao.exceptions.ParticipantDeleteDAOException;
import dao.exceptions.ParticipantGetDAOException;
import dao.exceptions.ParticipantInsertDAOException;
import dao.exceptions.ParticipantUpdateDAOException;
import model.Participant;

/**
 * The {@link ParticipantDAOImpl} class implements the 
 * CRUD methods as defined in the {@link IParticipantDAO}
 * interface.
 */
public class ParticipantDAOImpl implements IParticipantDAO{
	
	private HashMap<Integer, Participant> participants = Database.getInstance();

	@Override
	public void insert(Participant participant) throws BaseDAOException {
		
		int prevSize = participants.size();
		
		int id = participant.getId();
		String firstname = participant.getFirstname();
		String lastname = participant.getLastname();
		String mobilePhone = participant.getMobilePhone();
		String email = participant.getEmail();
		participants.put(id, new Participant(firstname, lastname, mobilePhone, email));
		
		try {
			if(participants.size() == prevSize) {
				throw new ParticipantInsertDAOException();
			}
		} catch (ParticipantInsertDAOException e) {
			throw e;
		}
		
	}

	@Override
	public void update(Participant participant) throws BaseDAOException {
		try {
			
			if(participants.get(participant.getId()) == null) {
				throw new ParticipantUpdateDAOException();
			}
			
			int id = participant.getId();
			String firstname = participant.getFirstname();
			String lastname = participant.getLastname();
			String mobilePhone = participant.getMobilePhone();
			String email = participant.getEmail();
			
			participants.put(id, new Participant(firstname, lastname, mobilePhone, email));
			
			
		} catch(ParticipantUpdateDAOException e) {
			throw e;
		}
		
	}

	@Override
	public void delete(int id) throws BaseDAOException {
		
		try {
			if(participants.get(id) == null) {
				throw new ParticipantDeleteDAOException();
			}
			
			participants.remove(id);
			
		} catch (ParticipantDeleteDAOException e) {
			throw e;
		}
		
	}

	@Override
	public Participant get(int id) throws BaseDAOException {
		Participant participant;
		
		try {
			if(participants.get(id) == null) {
				throw new ParticipantGetDAOException();
			} 
			
			participant = participants.get(id);
			
		} catch (ParticipantGetDAOException e) {
			throw e;
		}
		return participant;
	}
	
	

}
