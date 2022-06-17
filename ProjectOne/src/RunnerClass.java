package projectOneProgramingThree;

import java.io.IOException;
import java.util.ArrayList;

public class RunnerClass {

	public static void main(String[] args) throws IOException 
	{
		//creating arraylist object
		NumberOperations arrayOperations = new NumberOperations();
		ArrayList<Integer> array = new ArrayList<Integer>();
		//calling methods from number operations
		arrayOperations.GetNumbersAscendingOrder(array);
		arrayOperations.GetArrayProduct(array);
		arrayOperations.GetLeastValueInputted(array);
		arrayOperations.GetGreatestValueInputted(array);
				
	}
	
	

}
