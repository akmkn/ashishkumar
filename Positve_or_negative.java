package AssignmentOne;
import java.util.Scanner;

/*Write a Java program to get a number from the user and print
whether it is positive or negative. */
public class Positve_or_negative {
	public static Scanner scan;
	
	public void positiveOnegative(long x){
		
		if(x>0){
			System.out.println("Number is positive:" +x);
		}
		else{
			System.out.println("Number is negative:"+ x);
		}

	}
	public static void main(String args[]){
		Positve_or_negative obj = new Positve_or_negative();
		scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		Long number = scan.nextLong();
		obj.positiveOnegative(number);				
	}
}
