package AssignmentOne;
import java.util.Scanner;

//Write a program in Java to display n terms of natural numbers and their sum

public class NaturalNumberAndSum {
public static Scanner scan;

public void n_natural_number_sum(int n, long sum){
	
}
public static void main(String args[]){
	long sum = 0;
scan = new Scanner(System.in);
System.out.println("How many 'n' natural number :");
int x = scan.nextInt();
System.out.println("First "+x+" " +"natural numbers are :" );
for (int i = 1; i <= x; i++){	
System.out.println(i);
}
for (int i = 1; i <= x; i++){
    sum = sum +i;
}
System.out.println("Sum of first "+x+" natural numbers is :"+" "+sum);
	}
}
