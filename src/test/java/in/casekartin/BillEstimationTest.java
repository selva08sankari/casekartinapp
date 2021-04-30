package in.casekartin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BillEstimationTest {

	//Test case 1
	@Test
	public void TestCase1()
	{
		String caseType="POLYCARBONATE";
		int numberOfCases=2;
		
		//checking number of case is positive or not
		boolean valid=BillEstimation.numberOfCaseValidation(numberOfCases);
		assertEquals(true,valid);
		
		float amount=BillEstimation.fareCalculation(caseType,numberOfCases);
		System.out.println("Final amount is : "+amount);
	}

	//Test case 2
	@Test
	public void TestCase2()
	{
		String caseType="LEATHER";
		int numberOfCases=-1;
		
		//checking number of case is positive or not
		boolean valid=BillEstimation.numberOfCaseValidation(numberOfCases);
		assertEquals(false,valid);
		
		float amount=BillEstimation.fareCalculation(caseType,numberOfCases);
		System.out.println("Final amount is : "+amount);
		
	}
	
	
	//Test case 3
	@Test
	public void TestCase3()
	{
		String caseType="silicone";
		int numberOfCases=3;
		
		//checking number of case is positive or not
		boolean valid=BillEstimation.numberOfCaseValidation(numberOfCases);
		assertEquals(true,valid);
		
		float amount=BillEstimation.fareCalculation(caseType,numberOfCases);
		System.out.println("Final amount is : "+amount);
	}
	
}
