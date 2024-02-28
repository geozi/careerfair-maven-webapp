package dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.db.Database;
import dao.exceptions.BaseDAOException;
import model.Participant;

class ParticipantDAOTest {

	private static IParticipantDAO participantDAO;
	private static HashMap<Integer, Participant> participants;

	@BeforeAll
	static void setUpBeforeClass() throws BaseDAOException {
		participantDAO = new ParticipantDAOImpl();
		participants = Database.getInstance();
	}

	@BeforeEach
	void setUp() throws Exception {
		
		Participant p1 = new Participant();
		Participant p2 = new Participant();
		Participant p3 = new Participant();
		Participant p4 = new Participant();
		

		p1.setFirstname("Carl");
		p1.setLastname("Shelton");
		p1.setMobilePhone("6900000001");
		p1.setEmail("car@random.org");
		participants.put(p1.getId(), p1);
		

		p2.setFirstname("Cade");
		p2.setLastname("Monroe");
		p2.setMobilePhone("6900000002");
		p2.setEmail("cade@myemail.com");
		participants.put(p2.getId(), p2);
		
		p3.setFirstname("Curtis");
		p3.setLastname("Booth");
		p3.setMobilePhone("6900000003");
		p3.setEmail("booth@company.org");
		participants.put(p3.getId(), p3);

		p4.setFirstname("Troy");
		p4.setLastname("Powers");
		p4.setMobilePhone("6900000004");
		p4.setEmail("troy@myemail.com");
		participants.put(p4.getId(), p4);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		participants.clear();
		Participant.setTotal(0);
	}

	@Test
	void daoInsertOp() throws BaseDAOException {
		Participant p5 = new Participant();
		
		p5.setFirstname("Zariyah");
		p5.setLastname("Moody");
		p5.setMobilePhone("6900000005");
		p5.setEmail("zar@random.com");
		participantDAO.insert(p5);
		
		assertEquals(5, participants.size());
	}
	
	@Test
	void daoUpdateOp() throws BaseDAOException {
		Participant p1 = new Participant();
		
		p1.setId(4);
		p1.setFirstname("Emilio");
		p1.setLastname("Mays");
		p1.setMobilePhone("6900000006");
		p1.setEmail("may@emilio.com");
		
		participantDAO.update(p1);
		
		assertEquals(4, participants.size());
	}
	
	@Test
	void daoDeleteOp() throws BaseDAOException {
		
		participantDAO.delete(4);
		assertEquals(3, participants.size());
		
		participantDAO.delete(3);
		assertEquals(2, participants.size());
		
		participantDAO.delete(2);
		assertEquals(1, participants.size());
		
		participantDAO.delete(1);
		assertEquals(0, participants.size());

	}
	
	@Test 
	void daoGetOp() throws BaseDAOException {
		assertNotNull(participantDAO.get(3));
	}

}
