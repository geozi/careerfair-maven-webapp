package model;

/**
 * The {@link Participant} class is the abstract
 * representation of an event participant.
 */
public class Participant {
	private static int total =0;
	private int id;
	private String firstname;
	private String lastname;
	private String mobilePhone;
	private String email;
	
	// Constructors
	
	public Participant() {
		total++;
		this.id = total;
	}
	
	public Participant(String firstname, String lastname, String mobilePhone, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilePhone = mobilePhone;
		this.email = email;
		total++;
		this.id= total;
	}
	
	public Participant(int id, String firstname, String lastname, String mobilePhone, String email) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilePhone = mobilePhone;
		this.email = email;
	}

	// Setters and Getters

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public static void setTotal(int total) {
		Participant.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Object state display
	
	@Override
	public String toString() {
		return "Participant [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", mobilePhone="
				+ mobilePhone + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
}
