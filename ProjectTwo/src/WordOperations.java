import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class WordOperations {
	
	UserInput findInput = new UserInput();
	
	DictionaryFunctions findDictionary = new DictionaryFunctions();
	int hashtableSIZE = 59000;
	Hashtable<Integer, String> dictionaryTable = new Hashtable<>(hashtableSIZE);
	ArrayList<String> wordsSpelledWrong = new ArrayList<String>();
	//possible word user is trying to spell
	ArrayList<String> possibleWord = new ArrayList<String>();
	String word = "";

	public void SpellCheck(String input) throws IOException 
	{
		word = findInput.input(word);
		//setting input argument equal to users input
		input = word;
		
		dictionaryTable = findDictionary.DictionaryClass(dictionaryTable);
		//checking if dictionary contains users inputted word
		if(dictionaryTable.contains(input))
		{
			System.out.println(input + " was found in the dictionary!\n");
		}
		else
		{
			//when word is spelled wrong preform all operations on input
			System.out.println(input + " was not found in the dictionary!\n");
			wordsSpelledWrong.add(input);
			swapAdjacentCharacters(input);
			insertSingleCharacterBetweenLetters(input);
			replaceSingleCharacter(input);
			deleteSingleCharacter(input);
			suggest();
		}
			
	}
	
	//swap adjacent characters in word and add possible words to arraylist
	public void swapAdjacentCharacters(String input)
	{
		char[] word = input.toCharArray();
		String newWord;
		//looping through input
		for(int i = 0; i < word.length-1; i++)
		{
			char temp = word[i];
			//swap adjacent letters
			word[i] = word[i + 1];
			word[i + 1] = temp;
			//converting newWord from array of chars
			newWord = String.copyValueOf(word);
			//swap adjacent letter back
			//testing purposes
			//System.out.println(newWord);
			//swap adjacent letter back
			word[i+1] = word[i];
			word[i] = temp;
			
			if(dictionaryTable.contains(newWord) && !possibleWord.contains(newWord))
			{
				possibleWord.add(newWord);
				
			}
			newWord = "";
				
		}
		//testing purposes
		//System.out.println("\nWords found in possibilties list is " + possibleWord.get(0));
	}
	//insert single character between adjacent characters
	public void insertSingleCharacterBetweenLetters(String input)
	{
		char[] word = input.toCharArray();
		char[] orginialWord;
		String newWord;
		char temp;
		int indexPosition;
		
		//loop to iterate through word
		for(int i = 0; i < word.length-1; i++)
		{
			//set values for input 
			word = input.toCharArray();
			orginialWord = word;
			word = new char[input.length()+1];
			//resize array
			for(int l = 0; l < orginialWord.length; l++)
				 word[l] = orginialWord[l];
			
			indexPosition = i;
			//rearranging chars in array to inert char at specified index
			for(int j = word.length-1; j > indexPosition; j--)
			{
				word[j] = word[j-1];
			}
			//looping through alphabet and inserting chars into input
			for(char alphabet = 'a'; alphabet <= 'z'; alphabet++)
			{
				temp = alphabet;
				//setting value at specified index to alphabet letter
				word[indexPosition] = temp;
				newWord = String.copyValueOf(word);
				//testing purposes
				//System.out.println(newWord);
				//checking if hashtable contains rearranged word
				if(dictionaryTable.contains(newWord) && !possibleWord.contains(newWord))
				{
					possibleWord.add(newWord);
					//System.out.println(newWord);
				}
				//resetting values of rearranged word
				newWord = "";
			}
		}
		
	}
	//@SuppressWarnings("null")
	//method to delete single character
	public void deleteSingleCharacter(String input)
	{
		String originalInput = input;
		
		//String newWord = input;
		//char temp;
		//looping through input and deleting a single char
		for(int i = 0; i <= originalInput.length()-1; i++)
		{
			//making input mutatable
			StringBuilder builder = new StringBuilder(originalInput);
			builder.deleteCharAt(i);
			originalInput = builder.toString();
					
			//System.out.println(input);
			
			if(dictionaryTable.contains(originalInput) && !possibleWord.contains(originalInput))
			{
				possibleWord.add(originalInput);
				//System.out.println(originalInput);
			}
			
			originalInput = input;
			//newWord = "";
		}
		
	}
	
	//replacing single character
	public void replaceSingleCharacter(String input)
	{
		char[] word = input.toCharArray();
		String newWord;
		char temp;
		//looping through input
		for(int i = 0; i < word.length-1; i++)
		{
			
			for(char alphabet = 'a'; alphabet <= 'z'; alphabet++)
			{
				temp = alphabet;
				word[i] = temp;
				
				newWord = String.copyValueOf(word);
				//System.out.println(newWord);
				if(dictionaryTable.contains(newWord) && !possibleWord.contains(newWord))
				{
					possibleWord.add(newWord);
					//System.out.println(newWord);
				}
				
				newWord = "";
				word = input.toCharArray();
				
			}
			
		}
		
	}
	
	//suggesting possible words user is trying spell
	public void suggest()
	{
		if(!possibleWord.isEmpty()) 
		{
			System.out.println("Were you trying to spell: \n" );
			for(int i = 0; i < possibleWord.size(); i++ )
			{
				System.out.println(possibleWord.get(i));
			}
		}
		
	}

}
