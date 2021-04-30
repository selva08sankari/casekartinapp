package in.casekartin;

import java.util.ArrayList;

public class CaseTypes {
	//creation of array list for feature phone case types
		static ArrayList<String> featurePhoneCaseType=new ArrayList<String>();
		static {
			//add the element in the feature phones array list
			featurePhoneCaseType.add("SILICONE");
		}

		//creation of array list for android case types
		static  ArrayList<String> androidCaseTypes=new ArrayList<String>();
		static {
		    //add the elements in the case Type array list
	 		androidCaseTypes.add("POLYCARBONATE");
	 		androidCaseTypes.add("LEATHER");
	 		androidCaseTypes.add("SILICONE");

		}
		
		//creation of array list for iPhone model collections 
		static ArrayList<String> iPhoneModels=new ArrayList<String>();
		static {
			//add the iPhone model name to the iPhone array list
			iPhoneModels.add("iPhone 12 Pro");
			iPhoneModels.add("iPhone 11");
			iPhoneModels.add("iPhone XS");
			iPhoneModels.add("iPhone XS");
		}
		
		//creation of array list for android model collections 
		static ArrayList<String> androidModels=new ArrayList<String>();	
		static {
			//add the android model name to the android array list
			androidModels.add("samsung M315");
			androidModels.add("Redme Note10");
			androidModels.add("onePlus 9Pro");
			androidModels.add("realme 7pro");
		}
		
		//creation of array list for feature Phone collections
		static ArrayList<String> featurePhoneModels=new ArrayList<String>();
		static {
			//add the feature phone model name in the array list
			featurePhoneModels.add("jio 12M");
			featurePhoneModels.add("Nokia 216DS");
			featurePhoneModels.add("samsung B110");
			featurePhoneModels.add("micromax X807");

		}
		
		//creation of array list for phone types
		static ArrayList<String> phoneTypes=new ArrayList<String>();
		static {
			//add the element in the array list
		    phoneTypes.add("iPhone");
			phoneTypes.add("Android");
			phoneTypes.add("Feature Phone");
		}

		public static boolean caseTypeValidation(String mobileType,String caseType)
		{
				if(mobileType.equalsIgnoreCase("Feature Phone"))
				{	
				//verify case type available or not
				for(String type : featurePhoneCaseType)
					if(type.equalsIgnoreCase(caseType))
					{
						return true;
					}
				return false;
				}
				else if((mobileType.equalsIgnoreCase("Android")) || (mobileType.equalsIgnoreCase("iPhone")) )
				{
					for(String type : androidCaseTypes)
					{
						if(type.equalsIgnoreCase(caseType))
						{
							return true;
						}
					return false;
					}
				}	
				return false;
		}

		//verify phone model is available or not
		public static boolean phoneModelValidation(String mobileType,String mobileModel)
		{
			//verify Phone model available or not using switch case
			switch(mobileType)
			{
			case  "iPhone":
			{
				
				for(String type : iPhoneModels) {
					if(type.equalsIgnoreCase(mobileModel))
					{
						return true;
						
					}
				}
				return false;
			}
			case "Android":
			{
				for(String type : androidModels) {
					if(type.equalsIgnoreCase(mobileModel))
					{
						return true;
					}
				}
				return false;
			}
			default:
			{
				for(String type : featurePhoneModels) {
					if(type.equalsIgnoreCase(mobileModel))
					{
						return true;
					}
				}
				return false;
			}
			}
		}

		//verify of phone type available or not
		public static boolean phoneTypeValidation(String phoneType)
		{	
			for(String type : phoneTypes)
			{
				if(type.equalsIgnoreCase(phoneType))
				{
					return true;
				}
			}
			return false;
		}

		//check user mobile case is available or not
		public static boolean mobileCaseTypeValidation(String mobileType,String mobileModel,String caseType)
		{
			boolean isPhoneTypeValid=CaseTypes.phoneTypeValidation(mobileType);
			boolean isPhoneModelValid=CaseTypes.phoneModelValidation(mobileType,mobileModel);
			boolean isCaseTypeValid=CaseTypes.caseTypeValidation(mobileType,caseType);
			if(isPhoneTypeValid && isPhoneModelValid && isCaseTypeValid)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		

}
