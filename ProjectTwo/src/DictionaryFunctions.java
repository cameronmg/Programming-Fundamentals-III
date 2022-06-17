import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryFunctions {
	
	File dictionaryFileOfWords = new File("mostcommonenglishwords.txt");
	UserInput input = new UserInput();
	String inputText = "";
	int hashtableSIZE = 2000;
	//defining hashtable
	Hashtable<Integer, String> dictionaryTable = new Hashtable<>(hashtableSIZE);
	//creating haskKey to store values in hashtable
	
	
	public Hashtable<Integer, String> DictionaryClass(Hashtable<Integer, String> dictionary) throws IOException
	{
		Scanner dictionaryFile = new Scanner(dictionaryFileOfWords);
		String word = "";
		
		//adding words from dictionary into hashtable
		while (dictionaryFile.hasNext())
		{
			dictionary = dictionaryTable;
			word = dictionaryFile.nextLine();
			
			int hashValue = 0;
			//adding up ASCII values of word
			for( int j = 0; j < word.length(); j++ )
			{
				hashValue += word.charAt(j);
			}
			//creating hashkey from added up ASCII value and hashtablesize
			//this allows me to store string inside of a hashtable
			int hashKey = hashValue % hashtableSIZE;
			
			//prevents collisions from happening inside hashtable
			if(dictionaryTable.containsKey(hashKey) == true)
			{
				while(dictionaryTable.containsKey(hashKey) == true)
				{
					hashKey = (hashKey + 1) % hashtableSIZE;
				}
			}
			//adding word inside hashtable
			dictionaryTable.put(hashKey, word);		
		}
		dictionaryFile.close();
		
		return dictionary;//return hashtable
		
	}

}
