package in.casekartin;

import java.util.HashMap;
import java.util.Set;

public class BillEstimation {
	public static float fareCalculation(String caseType,int numberOfCases)
	{
		//creation array list
		HashMap<String,Integer> caseTypes=new HashMap<String,Integer>();
		
		//add the element in the hash map
		caseTypes.put("SILICONE",200);
		caseTypes.put("LEATHER",500);
		caseTypes.put("POLYCARBONATE",300);
		
		float amount=0;
		Set <String> keySet=caseTypes.keySet();

		for(String type : keySet)
		{
			if(numberOfCaseValidation(numberOfCases))
			{
				int value= caseTypes.get(type);
				amount=(float)value*numberOfCases;
				//4% discount for buying more than one number of case
				amount+=(numberOfCases*4)/100;
				return amount;
			}
			else
			{
				return amount;
			}
		}
	return amount;
	}
	//checking number of case is valid or not
	public static boolean numberOfCaseValidation(int numberOfCases)
	{
		if(numberOfCases >0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


}
