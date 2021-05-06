package in.casekartin;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLoginTest {
	//Test case for login verification with valid input
	
	@Test
	public void testCase4()
	{
		System.out.println("\n----------login details with valid input------------");
		boolean valid=UserManager.loginVerification("9003306887","muthu2k*9");
		assertEquals(true,valid);
	}
	
	//Test case for login verification with Invalid input
	@Test
	public void testCase5()
	{
		System.out.println("\n-----------login details with Invalid input---------");
		boolean valid=UserManager.loginVerification("9999999934","christy2k*");
		assertEquals(false,valid);
	}

}
