package in.casekartin;

import java.util.ArrayList;

public class CaseTypes {
	// Display the case models
	public static void displayCaseModels() {
		// Display the phone types
		System.out.println("############ Phone Types ###############");
		for (String type : CaseModels.phoneTypes.keySet()) {
			System.out.println(type);
		}
		// Display the phone models
		for (String type : CaseModels.phoneTypes.keySet()) {
			ArrayList<String> arrayList = CaseModels.phoneTypes.get(type);
			System.out.println("############" + type + "###############");
			for (String string : arrayList) {

				System.out.println(string);
			}
		}
		// Display the case types
		System.out.println("############ Case Types ###############");
		for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
			System.out.println(type + " (Rs. " + CaseModels.androidIphoneCaseTypes.get(type) + "/-)");

		}
	}

	public static boolean caseTypeValidation(String mobileType, String caseType) {
		if (mobileType.equalsIgnoreCase("Feature Phone")) {
			// verify case type available or not
			for (String type : CaseModels.featurePhoneCaseType.keySet())
				if (type.equalsIgnoreCase(caseType)) {
					return true;
				}
			return false;
		} else if ((mobileType.equalsIgnoreCase("Android")) || (mobileType.equalsIgnoreCase("iPhone"))) {
			for (String type : CaseModels.androidIphoneCaseTypes.keySet()) {
				if (type.equalsIgnoreCase(caseType)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	// verify phone model is available or not
	public static boolean phoneModelValidation(String mobileType, String mobileModel) {
		boolean valid = false;
		for (String type : CaseModels.phoneTypes.keySet()) {
			if (type.equals(mobileType)) {
				ArrayList<String> arrayList = CaseModels.phoneTypes.get(type);

				for (String model : arrayList) {
					if (model.equals(mobileModel)) {
						valid = true;
						return valid;
					} else {
						continue;
					}
				}
			} else {
				continue;
			}
		}
		return valid;

	}
	public static boolean mobileModelValidation(String phoneType,String mobileModel)
	{
		ArrayList<String> arrayList = CaseModels.phoneTypes.get(phoneType);
		boolean valid=false;
		for (String model : arrayList) {
			if (model.equals(mobileModel)) {
				valid = true;
				return valid;
			} else {
				continue;
			}
		}
		
		return valid;
		
	}
	// verify of phone type available or not
	public static boolean phoneTypeValidation(String phoneType,String phoneModel) {
		for (String type : CaseModels.phoneTypes.keySet()) {
			if (type.equalsIgnoreCase(phoneType)) {
				if(mobileModelValidation(phoneType,phoneModel))
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	// verify of phone type available or not
	public static boolean phoneTypeValidation(String phoneType) {
		for (String type : CaseModels.phoneTypes.keySet()) {
			if (type.equalsIgnoreCase(phoneType)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	// check user mobile case is available or not
	public static boolean mobileCaseTypeValidation(String mobileType, String mobileModel, String caseType) {
		boolean isPhoneTypeValid = CaseTypes.phoneTypeValidation(mobileType);
		boolean isPhoneModelValid = CaseTypes.phoneModelValidation(mobileType, mobileModel);
		boolean isCaseTypeValid = CaseTypes.caseTypeValidation(mobileType, caseType);
		if (isPhoneTypeValid && isPhoneModelValid && isCaseTypeValid) {
			System.out.println("Your phone case model is available");
			return true;
		} else {
			System.out.println("Your phone case model is not available");
			return false;
		}
	}
}
