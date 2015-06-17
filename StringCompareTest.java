package Assignment7; //this is the folder I have held this file
import java.util.Scanner;//import the Scanner class
import myUtil.StringCompare; //import the Class I created and stored in package called myUtil

public class StringCompareTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//create an instance of the object StringCompare
		StringCompare strings = new StringCompare();
		
		//create an instance of the Scanner class to use for the input form the user
		Scanner input = new Scanner(System.in);
		
		//ask the user for the 2 string and store them concurrently with 
		//the setter methods form String Compare Class
		System.out.print("Please enter first string: ");
		strings.setString1(input.next());
		System.out.print("Please enter second string: ");
		strings.setString2(input.next());
	
		
		//print out the result of the comparison by calling the compare method
		//will need to call the getter methods also to show these in output
		
		System.out.print("Strings "+ strings.getString1()+ " & " 
									+ strings.getString2()+ " "
									+ strings.compare());
		
		
		input.close();//closing Scanner object for clean code

	}

}
