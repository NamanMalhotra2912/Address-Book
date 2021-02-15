package Address_Book;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNewContact {
	
	Scanner scan = new Scanner (System.in);

	public String firstName = "Neeraj";
	public String lastName = "Malhotra";
	public String address = "Sector 4";
	public String city = "Gurgaon";
	public String state = "Haryana";
	public int zip = 122001;
	public long phoneNumber = 8588801333L;
	
	public String eMail = "neerajmalhotra0001@gmail.com";
	
	public void showContact() {
		
		System.out.println("Contact details are as follows :");
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Address : " + address);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Zip code : " + zip);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("E-mail id : " + eMail);
		
	}

	public void createNewContact() {
		System.out.println("Enter your first name");
		String firstName = scan.next();
		
		System.out.println("Enter your last name");
		String lastName = scan.next();
		
		System.out.println("Enter your Address");
		String address = scan.next();
		
		System.out.println("Enter City");
		String city = scan.next();
		
		System.out.println("Enter State");
		String state = scan.next();
		
		System.out.println("Enter Zip Code");
		BigInteger zip = scan.nextBigInteger();
		
		System.out.println("Enter your phone number");
		long phoneNumber = scan.nextLong();
		
		System.out.println("Enter your Email-Id");
		String eMail = scan.next();
		
		
		System.out.println("First name : "+firstName);
		System.out.println("Last name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Zip Code : "+zip);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("E-mail Id : "+eMail);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");

		AddNewContact add = new AddNewContact();
		add.createNewContact();

	}
		
}