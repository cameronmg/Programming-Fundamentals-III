import java.io.IOException;

public class RunnerClass {

	public static void main(String[] args) throws IOException
	{
		String sentence = "";
		
		UserInput inputText = new UserInput();
		WordOperations check = new WordOperations();
		System.out.println("Running SpellChecker...");
		//sentence = input.nextLine();
		sentence = inputText.input(sentence);
		//calling spellcheck function
		check.SpellCheck(sentence);
	}

}
