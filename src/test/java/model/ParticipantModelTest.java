package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipantModelTest {

	private static Participant participant;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		participant = new Participant();
	}

	@BeforeEach
	void setUp() throws Exception {
		participant.setFirstname("Wayne");
		participant.setLastname("Baxter");
		participant.setEmail("wayne@myemail.com");
		participant.setMobilePhone("6900000001");
	}

	@AfterEach
	void tearDown() throws Exception {
		participant.setFirstname(null);
		participant.setLastname(null);
		participant.setEmail(null);
		participant.setMobilePhone(null);
	}
	
	@Test
	void getId() {
		assertEquals(1, participant.getId());
	}

	@Test
	void getFirstname() {
		assertNotNull(participant.getFirstname());
	}
	
	@Test
	void getLastname() {
		assertNotNull(participant.getLastname());
	}
	
	@Test 
	void getEmail() {
		assertNotNull(participant.getEmail());
	}
	
	@Test
	void getMobilePhone() {
		assertNotNull(participant.getMobilePhone());
	}
	
	@Test
	void getTotal() {
		assertEquals(1, Participant.getTotal());
	}
}
