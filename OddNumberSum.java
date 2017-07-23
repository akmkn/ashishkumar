package AssignmentOne;
import java.util.Scanner;
public class OddNumberSum {
public static Scanner scan;

public void odd_number_sum(){
	
}
public static void main(String args[]){
int sum = 0;
scan = new Scanner(System.in);
System.out.println("How many first odd numbers sum is to calculate : ");
int x = scan.nextInt();
int a[] = new int[x];

for(int i=0,j=1; i<x; i++,j+=2){	
System.out.println("Odd number are : "+j);
a[i] = j;
sum = sum + j;
}
System.out.println("Sum of all first "+x +" odd number is : " +sum);
}
}
