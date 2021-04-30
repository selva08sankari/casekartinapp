package in.casekartin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserManagerTest {
	/*
	 * Registration verification process
	 * Test case 1 
	 * First user details with wrong input
	 */
	@Test
	public void testCase1()
	{
		System.out.println("\n--User details with wrong input--");
		RegistrationDetails user1=new RegistrationDetails();
		user1.name="      a       ";
		user1.email="sss@gmail.com";
		user1.phoneNumber=9999999936L;
		user1.password="selva2k*9";
		user1.addressLine1="1/2 abs Street,chennai";
		
		//validation of name
		boolean valid=UserManager.nameValidation(user1.name);
		assertEquals(true,valid);
		
		//validation of mobile number
		valid=UserManager.mobileNumberValidation(user1.phoneNumber);
		assertEquals(true,valid);
		
		//validation of password
		valid=UserManager.passwordValidation(user1.password);
		assertEquals(true,valid);
		
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
        System.out.println("\n--User details with correct input--");
		RegistrationDetails user2=new RegistrationDetails();
		user2.name="Christina Magdalin J";
		user2.email="ccc@gmail.com";
		user2.phoneNumber=9999999935L;
		user2.password="christy2k";
		user2.addressLine1="2 abs Street,chennai";
		
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

}
