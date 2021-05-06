package in.casekartin;

import java.util.ArrayList;
import java.util.HashMap;

class RegistrationDetails {

	public RegistrationDetails(String name, String email, long phoneNumber, String password, String addressLine1) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.addressLine1 = addressLine1;
	}
	public String name;
	public String email;
	public long phoneNumber;
	public String password;
	public String addressLine1;
	@Override

	public String toString() {
		return "\nName = " + name + "\nemail Id = " + email + "\nMobileNumber = " + phoneNumber +"\nPassword ="+password + "\nAddress Line1 = "
				+ addressLine1;
	}
}

public class UserManager {
	//create the array list for storing user details
	public static ArrayList<RegistrationDetails> userDetails = new ArrayList<RegistrationDetails>();
	
	static {
//		UserManager user=new UserManager();
//		ArrayList<RegistrationDetails> userDetail=user.userDetails;
		RegistrationDetails user0=new RegistrationDetails("muthu kumari P","mmm@gmail.com",9003306887L,"muthu2k*9","1/2 annai Street,chennai");
		userDetails.add(user0);
	}
	 
	// after validating name,password & mobile number add the user details to array
	public static void addUserDetail(RegistrationDetails user) {
		boolean valid=existingUser(user.phoneNumber);
		if((valid==false)) {
			if(nameValidation(user.name) && mobileNumberValidation(user.phoneNumber) && passwordValidation(user.password))
			{
				user.name.trim();
				userDetails.add(user);
				System.out.println("User Details added successfully");
				System.out.println("\n *********Registered Successfully*********\n");
			}
			else
			{
				System.out.println("\nInvalid Credentials\nPlease Register again");
			}
		}
		else
		{
			System.out.println("Your a existing user");
		}
}
//	@Test
//	pattern checking for mobile number
//	public void whenMatchesTenDigitsNumber_thenCorrect() {
//	    Pattern pattern = Pattern.compile("^\\d{10}$");
//	    Matcher matcher = pattern.matcher("2055550125");
//	    assertTrue(matcher.matches());
	
	public static boolean existingUser(long mobileNumber) {
		// TODO Auto-generated method stub
		String mobileNumberStr=String.valueOf(mobileNumber);
		for (RegistrationDetails details : userDetails) {
			String phoneNumberStr=String.valueOf(details.phoneNumber);
			if(phoneNumberStr.equals(mobileNumberStr))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	// display the user details
	public static void displayDetails() {
		System.out.println("\n********Display Details********");
		for (RegistrationDetails details : userDetails) {
			System.out.println(details.toString());
		}
	}
	// creation of array list for android case types
	public static HashMap<String, String> loginDetails = new HashMap<String, String>();
	static {
		// add the elements in the case Type array list
		loginDetails.put("9003306887", "muthu2k*9");
		loginDetails.put("8077563470","selva2k*9" );
		loginDetails.put("9056332475", "christy2k");
	}
	
	/*
	 * Login verification
	 * mobile number assign as a user id
	 */
	public static boolean loginVerification(String mobileNumber,String passcode) 
	{
				boolean isValid=false;
				if (loginDetails.containsKey(mobileNumber)) {
					String value = loginDetails.get(mobileNumber);
					if (value.equals(passcode)) {
						System.out.println("Login Success");
						isValid = true;
					}
					else
					{
						System.out.println("Incorrect password");
					}
				}
				else
				{
					System.out.println("If you didn't create account Please Register or please enter the registered user id");
				}
		
		return isValid;
	}
	//Name validation
	public static boolean nameValidation(String name)
	{
		if(name.trim().equals("") || name==null)
		{
			System.out.println("Incorrect name");
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
			System.out.println("Incorrect mobile number");
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
			System.out.println("Incorrect password");
			return false;
		}
	}


}
