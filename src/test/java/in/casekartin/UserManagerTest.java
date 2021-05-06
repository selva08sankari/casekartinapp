package in.casekartin;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class UserManagerTest {
	public static ArrayList<RegistrationDetails> userDetails = new ArrayList<RegistrationDetails>();
	
	/*
	 * Registration verification process
	 * Test case 1 
	 * user details with wrong input
	 */
	@Test
	public void testCase1()
	{
		RegistrationDetails user1=new RegistrationDetails("       ","sss@gmail.com",8077563470L,"","1/2 abs Street,chennai");
		System.out.println("\n-----------User details with Invalid input-----------");

		userDetails.add(user1);
		
		//validation of name
		boolean valid=UserManager.nameValidation(user1.name);
		assertEquals(false,valid);
		
		//validation of mobile number
		valid=UserManager.mobileNumberValidation(user1.phoneNumber);
		assertEquals(true,valid);
		
		//validation of password
		valid=UserManager.passwordValidation(user1.password);
		assertEquals(false,valid);
		
		//if validation pass add the user details
        UserManager.addUserDetail(user1);
        
        //display user details
        UserManager.displayDetails();
		
	}
	/*
	 * Registration verification process
	 * Test case 2 
	 * second user details with correct input
	 */     
	@Test
	public void testCase2()
	{
        System.out.println("\n-------User details with valid input---------");
        RegistrationDetails user2=new RegistrationDetails("Christina Magdalin J","ccc@gmail.com",9056332475L,"christy2k","2 abs Street,chennai");
		
		//validation of name
		boolean valid=UserManager.nameValidation(user2.name);
		assertEquals(true,valid);
		
		//validation of mobile number
		valid=UserManager.mobileNumberValidation(user2.phoneNumber);
		assertEquals(true,valid);

		//validation of password
		valid=UserManager.passwordValidation(user2.password);
		assertEquals(true,valid);
		
		//if validation pass add the user details
        UserManager.addUserDetail(user2);
        
       //display user details
        UserManager.displayDetails();

	}
	//Registered user as a input
	@Test
	public void testCase3()
	{
		System.out.println("\n---------Existing user as a input---------");
		RegistrationDetails user3=new RegistrationDetails("muthu kumari P","mmm@gmail.com",9003306887L,"muthu2k*9","1/2 annai Street,chennai");
		
		//Checking existing user or not
		boolean isValid=UserManager.existingUser(user3.phoneNumber);
		assertEquals(true,isValid);
		
		//if validation pass add the user details
        UserManager.addUserDetail(user3);
	}


}
