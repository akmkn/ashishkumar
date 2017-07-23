package AssignmentOne;
import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the alphabet. 
Print Vowel of Consonant, depending on the user input. If the user input is not a 
letter (between a and z or A and Z), or is a string of length > 1, print an error message. */

public class PrintVowelsFromString {
	

public static Scanner scan;

public static void print_vowels_from_string(String str){
	if(str == "a"|| str=="A"|| str=="e"|| str=="E"|| str=="i"|| str=="I"|| str=="o"|| str=="O"
			|| str=="u"|| str=="U"){
		  System.out.println("Vowel");
	}	
	else{
		System.out.println("Consonents");
	}	
}
public static void main(String args[]){
	int vowels = 0, digits = 0, blanks = 0; char ch; 
	scan = new Scanner(System.in);
	System.out.println("Enter any one character only from a to Z :");
	String x = scan.nextLine();
	PrintVowelsFromString.print_vowels_from_string(x);
	
	System.out.println("Enter String:");
	String testString = scan.nextLine();
	for(int i = 0; i < testString.length(); i ++){
	  ch = testString.charAt(i);	 
	  if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||   
	      ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
	          vowels ++;
	       else if(Character.isDigit(ch))
	          digits ++;
	     else if(Character.isWhitespace(ch))
	           blanks ++;
	  }
		System.out.println("String length is : "+ testString.length());
	    System.out.println("Vowels : " + vowels);
	    System.out.println("Digits : " + digits);
	    System.out.println("Blanks : " + blanks);
	    
	}
}