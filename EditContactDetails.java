package Address_Book;
import java.util.Scanner;

public class EditContactDetails {
	
	Scanner scan = new Scanner(System.in);
	
	public String firstName = "Neeraj";
	public String correctedFirstName;
	public String lastName = "Malhotra";
	public String correctLastName;
	public String address = "Sector 4";
	public String city = "Gurgaon";
	public String state = "Haryana";
	public int zip = 122001;
	public long phoneNumber = 8588801333L;
	public String eMail = "neerajmalhotra0001@gmail.com";
	
	public void editDetails() {
		
		System.out.println("Please enter correct first name");
		correctedFirstName= scan.next();
		
		System.out.println("Please enter correct last name");
		correctLastName= scan.next();
				
	}
	
	public void showContactDetails() {
		
		System.out.println("Contact details are as follows :");
		System.out.println("First name : " + correctedFirstName);
		System.out.println("Last name : " + correctLastName);
		System.out.println("Address : " + address);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Zip code : " + zip);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("E-mail id : " + eMail);
		
	}

	public static void main(String[] args) {
		
		EditContactDetails edit = new EditContactDetails();
		edit.editDetails();
		edit.showContactDetails();
	}
}
