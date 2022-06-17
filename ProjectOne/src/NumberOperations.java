package projectOneProgramingThree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class NumberOperations {
	
	FileNumbersExtraction extractNumbers = new FileNumbersExtraction();
	ArrayList<Integer> fileNumbers = new ArrayList<Integer>();
	//setting numbers from array in ascending order
	public void GetNumbersAscendingOrder(ArrayList<Integer> ascendingOrder) throws IOException
	{
		//copying array from NumbersExtraction
		fileNumbers = extractNumbers.GetFileNumbers(fileNumbers);
		//setting argument to arrayList
		ascendingOrder = fileNumbers;
		Collections.sort(ascendingOrder);
		System.out.println("Array in ascending order :\n" + ascendingOrder);		
	}
	
	//getting the product of array items
	public void GetArrayProduct(ArrayList<Integer> array) throws IOException
	 {
		array = fileNumbers;
		//creating variable to store values for loop
		long temp = 1;
		 
		for(int i = 0; i < array.size(); i++){
			//multiplying and setting temp to element in array	
			temp *= array.get(i);
		}
		 
		System.out.println("Array product :\n" + temp); 
	 }
	
	public void GetLeastValueInputted(ArrayList<Integer> array) throws IOException
	 {
		array = fileNumbers;
		//finding smallest element in array list with .min method
		System.out.println("The least value inputted was :\n" + Collections.min(array)); 	 
	 }
	 public void GetGreatestValueInputted(ArrayList<Integer> array) throws IOException
	 {
		 array = fileNumbers;
		 //finding max element in array list with .max method
		 System.out.println("The greatest value inputted was :\n" + Collections.max(array)); 		 
	 }
}
