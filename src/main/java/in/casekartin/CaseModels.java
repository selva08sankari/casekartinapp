package in.casekartin;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;


public class CaseModels {

	// creation of array list for feature phone case types
	public static HashMap<String, Float> featurePhoneCaseType = new HashMap<String, Float>();
	static {
		// add the element in the feature phones array list
		featurePhoneCaseType.put("SILICONE", 200.0f);
	}

	// creation of array list for android case types
	public static HashMap<String, Float> androidIphoneCaseTypes = new HashMap<String, Float>();
	static {
		// add the elements in the case Type array list
		androidIphoneCaseTypes.put("POLYCARBONATE", 300.0f);
		androidIphoneCaseTypes.put("LEATHER", 500.0f);
		androidIphoneCaseTypes.put("SILICONE", 200.0f);
	}

	/*
	 * // creation of hash map for phone types as a value and add the iPhone list as
	 * a key in hash map public static
	 */

	public static HashMap<String, ArrayList<String>> phoneTypes = new HashMap<String, ArrayList<String>>();
	static {
		// creation of array list for iPhone model collections
		ArrayList<String> iPhoneModels = new ArrayList<String>();

		// add the iPhone model name to the iPhone array list
		iPhoneModels.add("iPhone 12 Pro");
		iPhoneModels.add("iPhone 11");
		iPhoneModels.add("iPhone XS");
		iPhoneModels.add("iPhone 12");

		// creation of array list for android model collections
		ArrayList<String> androidModels = new ArrayList<String>();

		// add the android model name to the android array list
		androidModels.add("samsung M315");
		androidModels.add("Redmi Note10");
		androidModels.add("onePlus 9Pro");
		androidModels.add("realme 7pro");

		// creation of array list for feature Phone collections
		ArrayList<String> featurePhoneModels = new ArrayList<String>();

		// add the feature phone model name in the array list
		featurePhoneModels.add("jio 12M");
		featurePhoneModels.add("Nokia 216DS");
		featurePhoneModels.add("samsung B110");
		featurePhoneModels.add("micromax X807");

		// Add the phone type and phone models array list to hash map
		phoneTypes.put("iPhone", iPhoneModels);
		phoneTypes.put("android", androidModels);
		phoneTypes.put("featurephone", androidModels);

	}

	public static HashMap<String, ArrayList<String>> getAllPhones() {
		return CaseModels.phoneTypes;
	}

	// method for adding mobile model
	public static void addMobileModel(String mobileType, String mobileModel) {

		ArrayList<String> models = getAllPhones().get(mobileType);

		if (models != null) {
			models.add(mobileModel);
			phoneTypes.put(mobileType, models);
		}
		// if phone type is not in the hash map add the phone type to hash map
		// And create new array list for phone model
		else {
			models = new ArrayList<String>();
			models.add(mobileModel);
			phoneTypes.put(mobileType, models);
		}

	}

	// method for adding case Type
	public static void addPhoneCaseType(String phoneType, String caseType, Float rupees) {
		switch (phoneType) {
		case "featurephone": {
			featurePhoneCaseType.put(caseType, rupees);
			break;
		}
		default:
			androidIphoneCaseTypes.put(caseType, rupees);
			break;
		}
	}

	public static void removeMobileModel(String mobileType, String mobileModel) {

		ArrayList<String> models = getAllPhones().get(mobileType);

		if (models != null) {
			models.remove(mobileModel);
		}
		else
		{
			System.out.println("\nInvalid modelModel Name");
		}
	}

	// method for removing phone Type
	public static void removePhoneTypes(String mobileType) {
		phoneTypes.remove(mobileType);
	}

	// method for removing case Type
	public static void removePhoneCaseType(String phoneType, String caseType) {
		
		switch (phoneType) {
		case "featurephone": {
			featurePhoneCaseType.remove(caseType);
			break;
		}
		case "android":
			androidIphoneCaseTypes.remove(caseType);
			break;
		case "iPhone":
			androidIphoneCaseTypes.remove(caseType);
			break;
		default:
			System.out.println("\nInvalid case Type Name");
		}
	}

}
