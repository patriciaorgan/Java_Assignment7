package Assignment7;
import java.util.*;//importing the Util package for the use of the Scanner Class

public class SentenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variable to store sentence
		String sentence = new String();
		
		//create an instance of the Scanner class to use for the input form the user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a sentence: ");
		sentence = input.nextLine();
		input.close();
		
		//output the sentence in Uppercase  and lowercase using the String Class method
		System.out.println("\n\nConvert Result:\n"+ sentence.toUpperCase()+"\n" 
												+ sentence.toLowerCase());
		
		//create a StringTokeniser object with the sentence
		StringTokenizer tokens = new StringTokenizer(sentence);
		
		//use the hasMoreTokens method of this Class to loop through and print
		while(tokens.hasMoreTokens())
			System.out.println(tokens.nextToken());
		}
}
