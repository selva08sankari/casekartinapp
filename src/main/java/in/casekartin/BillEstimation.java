package in.casekartin;

import java.util.HashMap;
import java.util.Set;

public class BillEstimation {
	public static float fareCalculation(String caseType,int numberOfCases)
	{
		//creation of hash map 
		HashMap<String,Float> caseTypes=new HashMap<String,Float>();
		
		//add the element in the hash map
		caseTypes.put("SILICONE",200.0f);
		caseTypes.put("LEATHER",500.0f);
		caseTypes.put("POLYCARBONATE",300.0f);
		
		float amount=0;
		Set <String> keySet=caseTypes.keySet();

		for(String type : keySet)
		{
			if(numberOfCaseValidation(numberOfCases))
			{
				float value= caseTypes.get(type);
				if(numberOfCases==1)
				{
					amount=(float)value*numberOfCases;
				}
				else
				{
					amount=(float)value*numberOfCases;
					//4% discount for buying more than one number of case
					amount=amount+(numberOfCases*4)/100;
				}
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
