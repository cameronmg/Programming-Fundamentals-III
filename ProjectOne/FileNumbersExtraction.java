package projectOneProgramingThree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileNumbersExtraction 
{

	public static void NumbersExctraction()throws IOException 
	{
		File numbersfile = new File("C:/Users/camer/OneDrive/Desktop/numbers.txt");
		//scanning file
		Scanner inputFile = new Scanner(numbersfile);
		int fileNumbers = 0;
		//creating an arrayList of type int to store values from file
		ArrayList<Integer> convertedNumbers = new ArrayList<Integer>();
		//while numbers.txt has another line
		while(inputFile.hasNext())
		{
			//going through each line in the txt file and storing the value in str
			String str = inputFile.nextLine();
			//converting string in file to int
			fileNumbers = Integer.parseInt(str);
			convertedNumbers.add(fileNumbers);
			//System.out.println(fileNumbers);
		}
		inputFile.close();
		
		
	}
	
}
