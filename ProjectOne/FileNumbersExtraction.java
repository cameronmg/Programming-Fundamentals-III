package projectOneProgramingThree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FileNumbersExtraction 
{
	//creating an arrayList of type int to store values from file
	ArrayList<Integer> convertedNumbers = new ArrayList<Integer>();

	public ArrayList<Integer> GetFileNumbers(ArrayList<Integer> array)throws IOException 
	{
		File numbersfile = new File("number.txt");
		//scanning file
		Scanner inputFile = new Scanner(numbersfile);
		int fileNumbers = 0;
		//while numbers.txt has another line
		while(inputFile.hasNext())
		{
			//when the input is valid scan each line convert string into num and add num into array
			try {
				
				String str = inputFile.nextLine();
				fileNumbers = Integer.parseInt(str);
				//input validation for number 100 to -100
				if(fileNumbers <= 100 && fileNumbers >=-100) 		
					convertedNumbers.add(fileNumbers);
				
				else {
					inputFile.close();
					System.out.println("Please enter a number from -100 to 100.");
				}
			}
			//catch exception when the input is not valid
			catch (NumberFormatException number){
				
				System.out.println("Input on line " + fileNumbers + " is not a valid number.");
				inputFile.close();
			}
				
		}
		inputFile.close();
		
		return array = convertedNumbers;
	 }
	 
	
}
