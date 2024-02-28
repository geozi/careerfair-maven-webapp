package service;

import dao.IParticipantDAO;
import dao.ParticipantDAOImpl;
import dao.exceptions.BaseDAOException;
import model.Participant;
import service.dto.ParticipantDTO;
import service.exceptions.BaseServiceException;
import service.exceptions.NoDataProvidedException;
import service.exceptions.NoFirstnameException;
import service.exceptions.ParticipantNotFoundException;

/**
 * The {@link ParticipantServiceImpl} class implements the CRUD wrapper
 * methods as defined in the {@link IParticipantService} interface.
 */
public class ParticipantServiceImpl implements IParticipantService {
	
	private static IParticipantDAO participantDAO = new ParticipantDAOImpl();
	
	


	@Override
	public void insert(ParticipantDTO dto) throws BaseDAOException, BaseServiceException {
		
		try {
			if(dto == null) {
				throw new NoDataProvidedException();
			}
			
			if(dto.getFirstname().isEmpty()) {
				throw new NoFirstnameException();
			}
			
			Participant participant = map(dto);
			participantDAO.insert(participant);
			
		} catch(BaseDAOException | BaseServiceException e) {
			throw e;
		}
		
	}


	@Override
	public void update(ParticipantDTO dto) throws BaseDAOException, BaseServiceException {
		try {
			if(dto == null) {
				throw new NoDataProvidedException();
			}
			
			Participant participant = map(dto);
			participantDAO.update(participant);
			
		} catch( BaseDAOException | BaseServiceException e1) {
			throw e1;
		}
		
	}

	@Override
	public void delete(int id) throws BaseDAOException, BaseServiceException {
		try {
			if(participantDAO.get(id) == null) {
				throw new ParticipantNotFoundException();
			}
			
			participantDAO.delete(id);
			
		} catch (BaseDAOException | BaseServiceException e2) {
			throw e2;
		}
		
	}

	@Override
	public Participant get(int id) throws BaseDAOException, BaseServiceException {
		Participant participant;
		try {
			if(participantDAO.get(id) == null) {
				throw new ParticipantNotFoundException();
			}
			
			participant = participantDAO.get(id);
			
		} catch( BaseDAOException | BaseServiceException e3) {
			throw e3;
		}
		return participant;
	}


	@Override
	public Participant map(ParticipantDTO dto){
		return new Participant(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getMobilePhone(), dto.getEmail());
	}
	

}
