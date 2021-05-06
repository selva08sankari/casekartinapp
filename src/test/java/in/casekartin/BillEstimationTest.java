package in.casekartin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class BillEstimationTest {

	/*
	 * Test case 1 
	 * number of cases should be in positive integer
	 * giving a positive number for number of cases
	 *  check number of cases is valid or not
	 */
	@Test
	public void testCase1()
	{
		int numberOfCases=3;
		
		//checking number of case is positive or not
		boolean valid=BillEstimation.numberOfCaseValidation(numberOfCases);
		assertTrue(valid);
	}

	/*
	 * number of cases should be in positive integer
	 * giving a negative number for number of cases 
	 * To check number of cases is valid or not
	 */
	
	@Test
	public void testCase2()
	{
		int numberOfCases=-1;
		
		//checking number of case is positive or not
		boolean valid=BillEstimation.numberOfCaseValidation(numberOfCases);
		assertFalse(valid);
		
	}
	/*
	 * Test case 3
	 * Bill Estimation
	 */
	
	@Test
	public void testCase3()
	{
		String caseType="silicone";
		int numberOfCases=10;
		float amount=BillEstimation.fareCalculation(caseType,numberOfCases);
		System.out.println("Bill amount"+amount);
		Assert.assertEquals(5000.1f,amount,0.2f);   
		/*
		 * Assert.assertEquals(expected, actual, delta) delta is how long the actual
		 * value differs from expected
		 */
	}

}
