package dao.db;

/**
 * The {@link Database} class is an in-memory representation of a database. 
 * It uses the Singleton pattern (lazy initialization).
 */
import java.util.HashMap;

import model.Participant;

public class Database {
	private static HashMap<Integer, Participant> instance;
	
	private Database()  {
		instance = new HashMap<>();
	}
	
	public static HashMap<Integer, Participant> getInstance() {
		if(instance == null) {
			instance = new HashMap<>();
		}
		
		return instance;
	}
}
