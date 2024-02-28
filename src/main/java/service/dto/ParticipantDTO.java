package service.dto;

/**
 * The {@link ParticipantDTO} class is the
 * DTO equivalent of the {@link Participant} model
 * class.
 */
public class ParticipantDTO {
	private int id;
	private String firstname;
	private String lastname;
	private String mobilePhone;
	private String email;
	
	// Constructors
	
	public ParticipantDTO() {}
	
	public ParticipantDTO(String firstname, String lastname, String mobilePhone, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilePhone = mobilePhone;
		this.email = email;
	}
	
	public ParticipantDTO(int id, String firstname, String lastname, String mobilePhone, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilePhone = mobilePhone;
		this.email = email;
	}

	// Getters and Setters

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
