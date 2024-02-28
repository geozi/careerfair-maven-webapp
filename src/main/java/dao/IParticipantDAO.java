package dao;

import dao.exceptions.BaseDAOException;
import model.Participant;

/**
 * The {@link IParticipantDAO} interface provides 
 * the CRUD method definitions used by the DAO-layer classes.
 */
public interface IParticipantDAO {
	
	void insert(Participant participant) throws BaseDAOException;
	void update(Participant participant) throws BaseDAOException;
	void delete(int id) throws BaseDAOException;
	Participant get(int id) throws BaseDAOException;
}
