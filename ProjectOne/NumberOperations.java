package projectOneProgramingThree;

import java.util.ArrayList;
import java.util.Collections;

public class NumberOperations {

	//creating a getter method for the converted numbers from the text document
	public static ArrayList<Integer> getNumbersAscendingOrder(ArrayList<Integer> ascendingOrder) 
	{
	 //ArrayList<Integer> convertedNumbers = null;	
	 //System.out.println(setNumbersAscendingOrder(convertedNumbers));	
	 return ascendingOrder;
	}
	
	//setting numbers from array in ascending order
	public static void  setNumbersAscendingOrder(ArrayList<Integer> convertedNumbers)
	{
		ArrayList<Integer> ascendingOrder = new ArrayList<Integer>(); 
		
		Collections.sort(convertedNumbers);
		//looping through arrayList and getting individual values and adding them to a new array sorted
		for(int i = 0; i < convertedNumbers.size(); i++)
		 {
			 
			 ascendingOrder.add(i, convertedNumbers.get(i));
			  
		 }
		
				
	}

}
