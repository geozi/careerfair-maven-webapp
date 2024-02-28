package service;

import dao.exceptions.BaseDAOException;
import model.Participant;
import service.dto.ParticipantDTO;
import service.exceptions.BaseServiceException;

/**
 * The {@link IParticipantService} interface contains the Service-layer
 * definitions of the CRUD wrapper methods.
 */
public interface IParticipantService {
	void insert(ParticipantDTO dto) throws BaseDAOException, BaseServiceException;
	void update(ParticipantDTO dto) throws BaseDAOException, BaseServiceException;
	void delete(int id) throws  BaseDAOException, BaseServiceException;
	Participant get(int id) throws BaseDAOException, BaseServiceException;
	Participant map(ParticipantDTO dto);
}
