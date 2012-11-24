
public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String zip;
	private String phoneNumber;
	private String notes;
	
	/**
	 * Constructor for a contact
	 */
	public Contact(String fName, String lName, String email, String zip, String number, String notes) {
		super();
		this.firstName = fName;
		this.lastName = lName;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = number;
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		return "First Name: " + firstName + "\n"+
				"Last Name: " + lastName + "\n" +
				"Zip: "+ zip + "\n" +
				"Email Address: " + email + "\n"+
				"Telephone: " + phoneNumber+ "\n" +
				"Notes: " + notes;
	}	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return zip;
	}

	public void setStreetAddress(String streetAddress) {
		this.zip = streetAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
