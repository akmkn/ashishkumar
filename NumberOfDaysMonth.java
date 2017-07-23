package AssignmentOne;
import java.util.Scanner;

// Write a Java program to find the number of days in a month

public class NumberOfDaysMonth {
public static Scanner scan;

public void number_of_days_month(int a, int b){
	System.out.println("Number of days founds are correct");
}

public static void main(String args[]){
NumberOfDaysMonth obj = new NumberOfDaysMonth();	
scan = new Scanner(System.in);
System.out.println("Enter month MM:");
int mm = scan.nextInt();
System.out.println("Enter year YYYY:");
int yy = scan.nextInt();

if ( mm == 2){ 
	if((yy % 4 == 0)){
		System.out.println("Number of days are equal to 29.");
	}
	else{
		System.out.println("Number of days are equal to 28.");		
	}
			}
else if (mm == 1 || mm == 3 || mm== 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12){
	System.out.println("Number of days are equal to 31.");
}
else{
	System.out.println("Number of days are equal to 30.");	
	}
obj.number_of_days_month(mm, yy);
		}
}