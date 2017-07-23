package AssignmentOne;
import java.util.Scanner;

// Write a program in Java to input 5 numbers from keyboard and find their sum and average

public class SumAndAverage {
public static Scanner scan;

public void sum_average(){
System.out.println("Sum and average of number is calculated coreclty");	
}	

public static void main(String args[]){
	SumAndAverage obj = new SumAndAverage();
	long sum = 0; long avg;
	scan = new Scanner(System.in);
	System.out.println("Sum and average of how many integers are needs to calculate : ");
	int n = scan.nextInt();
	int a[] = new int[n];
	System.out.println("Enter "+n+" " +"numbers");
	for(int i=0; i<n; i++){
	a[i] = scan.nextInt();
	sum = sum +a[i];
	}
	System.out.println("Sum of "+n+"number is : "+sum);
	avg = (sum / n );
	System.out.println("Average of "+n+"numbers is : "+avg);
	obj.sum_average();
}
}