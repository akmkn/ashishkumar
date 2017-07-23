package AssignmentOne;
import java.util.Scanner;

// Write a program in Java to display the pattern like a diamond

public class DiamondWithStars {
	public static Scanner scan;
		public static void main(String args[]){
			int i, j, space = 1;
			scan = new Scanner(System.in);
			System.out.println("Input number of rows for half of diamond");
			int rows = scan.nextInt();
			space = rows - 1;
			 
			for (i = 1; i <= rows; i++) 
	        {
	            for (j = 1; j <= space; j++) 
	            {
	                System.out.print(" ");
	            }
	            space--;
	            for (j = 1; j <= 2 * i - 1; j++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("");
	        }
	        space = 1;
	        for (i = 1; i <= rows - 1; i++) 
	        {
	            for (j = 1; j <= space; j++) 
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for (j = 1; j <= 2 * (rows - i) - 1; j++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	    }
	}

