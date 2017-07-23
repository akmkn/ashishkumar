package AssignmentOne;
import java.util.Scanner;
public class GreatestNumberAmongThree {
public static Scanner scan;

// Take three numbers from the user and print the greatest number 

public void greatest_number_among_three(long a, long b, long c){
	System.out.println("Greatest Number found");
}

public static void main(String args[]){
	GreatestNumberAmongThree obj = new GreatestNumberAmongThree();
	scan = new Scanner(System.in);
	System.out.println("Enter three number to find greastest number");
	System.out.println("Enter first number:");
	long num1 = scan.nextLong();
	System.out.println("Enter 2nd number:");
	long num2 = scan.nextLong();
	System.out.println("Enter 3rd number:");
	long num3 = scan.nextLong();
	
	if ( num1 > num2 && num1 > num3 )
        System.out.println("First number is largest: " +num1);
     else if ( num2 > num1 && num2 > num3 )
        System.out.println("Second number is largest: " +num2);
     else if ( num3 > num1 && num3 > num2 )
        System.out.println("Third number is largest: " +num3);
     else   
        System.out.println("Entered numbers are not distinct.");
	obj.greatest_number_among_three(num1, num2, num3);
}
}
