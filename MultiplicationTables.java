package AssignmentOne;
import java.util.Scanner;

//Write a program in Java to display the multiplication table of a given integer

public class MultiplicationTables {
public static Scanner scan;

public void multiplication_table(){
System.out.println("Multiplication table written successfully");
}

public static void main(String args[]){
MultiplicationTables obj = new MultiplicationTables();
scan = new Scanner(System.in);
System.out.println("Multiplication table of integer : ");
int x = scan.nextInt();
for(int i=1; i<=20; i++){
	System.out.println(x+" X " +i+ " == "+x*i);
	}
obj.multiplication_table();
	
}
}
