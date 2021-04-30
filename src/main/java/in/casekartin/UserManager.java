package in.casekartin;

import java.util.ArrayList;

class RegistrationDetails {

	public String name;
	public String email;
	public long phoneNumber;
	public String password;
	public String addressLine1;
	@Override

	public String toString() {
		return "\nName = " + name + "\nemail Id = " + email + "\nMobileNumber = " + phoneNumber +"\nPassword ="+password + "\nAddress Line 1 = "
				+ addressLine1;
	}
}

public class UserManager {
	//create the array list for storing user details
	static ArrayList<RegistrationDetails> userDetails = new ArrayList<RegistrationDetails>();

	// after validating name,password & mobile number add the user details to array
	public static void addUserDetail(RegistrationDetails user) {
		if(nameValidation(user.name) && mobileNumberValidation(user.phoneNumber) && passwordValidation(user.password))
		{
			user.name.trim();
			userDetails.add(user);
			System.out.println("User Details added successfully");
		}
		else
		{
			System.out.println("\nInvalid Credentials");
		}
	}
	
	// display the user details
	public static void displayDetails() {
		System.out.println("\n********Display Details********");
		for (RegistrationDetails details : userDetails) {
			System.out.println(details + "\n *********Registered Successfully*********");
		}
	}
	//Name validation
	public static boolean nameValidation(String name)
	{
		if(name.trim().equals("") || name==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	//mobile number validation
	public static boolean mobileNumberValidation(long mobileNumber)
	{
		String mobileNumberStr=String.valueOf(mobileNumber);
		if(mobileNumberStr.length()!=10 || (mobileNumberStr.charAt(0)>='0' && mobileNumberStr.charAt(0)<='5'))
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}
	//password validation
	public static boolean passwordValidation(String password)
	{
		if(password.length()>=8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
