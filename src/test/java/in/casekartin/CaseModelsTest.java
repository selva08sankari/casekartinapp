package in.casekartin;

import java.util.ArrayList;

import org.junit.Test;

public class CaseModelsTest {

	/*
	 * //test case for display phone models
	 * 
	 * @Test public void test1() iphone,android,feature phone
	 */
	@Test
	public void testCase1() {
		System.out.println(CaseModels.getAllPhones());
	}
	@Test
	public void test()
	{
		ArrayList<String> models = CaseModels.getAllPhones().get("featurephone");
		for (String type :models) {
			System.out.println(type);

		}
	}

	// test case for add the mobile Type to the hash map
	// iPhone,android,feature phone,ipad
	@Test
	public void testCase2() {
		System.out.println("\n***********before the addition of phone type **********");
		System.out.println("\n" + CaseModels.getAllPhones());
		String phoneType = "iPad";
		String mobileModel = "Apple iPad Pro 11 2020";
		CaseModels.addMobileModel(phoneType, mobileModel);
		System.out.println("\n**********after the addition of phone type ***********");
		System.out.println("\n" + CaseModels.getAllPhones());
	}

	// test case for add the mobile model to the hash map
	@Test
	public void testCase3() {
		System.out.println("\n***********before the addition of mobile model **********");
		System.out.println("\n" + CaseModels.getAllPhones());
		String phoneType = "android";
		String mobileModel = "OnePlus Nord 5G";
		CaseModels.addMobileModel(phoneType, mobileModel);
		System.out.println("\n**********after the addition of mobile model ***********");
		System.out.println("\n" + CaseModels.getAllPhones());
	}

	// test case for add the case type to the hash map
	@Test
	public void testCase4() {
		System.out.println("*********before the addition of Case Types **********");
		for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
			System.out.println(type + " (Rs. " + CaseModels.androidIphoneCaseTypes.get(type) + "/-)");
		}
		String phoneType = "iPhone";
		String caseType = "Wallet";
		float rupees = 350.0f;
		CaseModels.addPhoneCaseType(phoneType, caseType, rupees);
		System.out.println("\n*********after the addition of Case Types ********");
		for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
			System.out.println(type + " (Rs. " + CaseModels.androidIphoneCaseTypes.get(type) + "/-)");
		}
	}

	// test case for remove the mobile model from the hash map
	@Test
	public void testCase5() {
		System.out.println("\n***********before the removal of mobile model **********");
		System.out.println(CaseModels.getAllPhones());
		String phoneType = "iPhone";
		String mobileModel = "iPhone 12";
		CaseModels.removeMobileModel(phoneType, mobileModel);
		System.out.println("\n***********after the removal of mobile model **********");
		System.out.println(CaseModels.getAllPhones());
	}
	
	// test case for remove the mobile type from the hash map
	@Test
	public void testCase6() {
		System.out.println("\n***********before the removal of mobile Type **********");
		System.out.println(CaseModels.getAllPhones());
		String phoneType = "iPhone";
		CaseModels. removePhoneTypes(phoneType);
		System.out.println("\n***********after the removal of mobile Type **********");
		System.out.println(CaseModels.getAllPhones());
	}
	//// test case for remove the case type from the hash map
	@Test
	public void testCase7() {
		System.out.println("\n***********before the removal of case Type **********");
		for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
			System.out.println(type + " (Rs. " + CaseModels.androidIphoneCaseTypes.get(type) + "/-)");
		}
		String phoneType = "iPhone";
		String caseType="LEATHER";
		CaseModels.removePhoneCaseType(phoneType,caseType);
		System.out.println("\n***********after the removal of case Type **********");
		for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
			System.out.println(type + " (Rs. " + CaseModels.androidIphoneCaseTypes.get(type) + "/-)");
		}
	}
	@Test
	public void testCase8()
	{
		System.out.println("\n***********before the removal of mobile model **********");
		System.out.println(CaseModels.getAllPhones());
		String phoneType = "iPhone";
		String mobileModel = "iPhone XR";
		CaseModels.removeMobileModel(phoneType, mobileModel);
		System.out.println("\n***********after the removal of mobile model **********");
		System.out.println(CaseModels.getAllPhones());
	}
}
