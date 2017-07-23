package AssignmentOne;
import java.util.Scanner;

/* Write a program in Java to make such a pattern like right angle triangle 
with number increased by 1 */

public class RightAngleTriangleIncreaseNumber {
public static Scanner scan;
public static void main(String args[]){
	scan = new Scanner(System.in);
	System.out.println("Enter rows for right angle traingle");
	int n = scan.nextInt();
	System.out.println("Triangle is written Below");
	int k=1;
	for(int i=1; i<=n; i++){
		for(int j=1; j<=i; j++){
			System.out.print( k++ +" " );
		}	
		System.out.println();
	}	
	
}
}
