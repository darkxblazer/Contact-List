
import java.util.*;

public class Contact  {
	
	
	private String firstN;
	private String lastN;
	private String zip;
	private String email;
	private String telephone;
	private String notes;
	
	
	/**
	 * Contact list constructor
	 */
	public Contact() {
		super();
	}	
	/**
	 * Reads the input for initial contact
	 */
	
	public void read() {
		
	
		Scanner scanner;
		scanner = new Scanner (System.in);
		System.out.print("Enter First Name:");
		this.firstN = scanner.nextLine();
		System.out.print("Enter Last Name:");
		this.lastN = scanner.nextLine();
		System.out.print("Enter Zip:");
		this.zip = scanner.nextLine();
		scanner = new Scanner (System.in);
		System.out.print("Enter Email Address:");
		this.email = scanner.nextLine();
		System.out.print("Enter Phone Number:");
		this.telephone = scanner.nextLine();
		System.out.print("Notes: ");
		this.notes = scanner.nextLine();
	}		

	public void List() {
		//Force user to enter a value for Last Name field
		Scanner scanner;
		scanner = new Scanner (System.in);
		if ("false".equals(lastN)) {
			System.out.println("You must enter a last name");
			this.lastN = scanner.nextLine();
		}
		else {
			//get list by Last Name
			System.out.println("Thank you for entering a last name");			
			}
	}
	
	
	@Override
	public String toString() {
		return "First Name: " + firstN + "\n"+
				"Last Name: " + lastN + "\n" +
				"Zip: "+ zip + "\n" +
				"Email Address: " + email + "\n"+
				"Telephone: " + telephone+ "\n" +
				"Notes: " + notes;
	}		
	
	 
	
}
