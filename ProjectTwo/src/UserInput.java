import java.io.IOException;
import java.util.Scanner;

public class UserInput {
	
	Scanner input = new Scanner(System.in);
	String inputText = "";
	
	public String input(String word) throws IOException
	{
		//main program 	
		inputText = input.nextLine();	
		inputText.toLowerCase();
		word = inputText;		
		//testing purposes
		//System.out.println(word);
		return word;	
	}

}
