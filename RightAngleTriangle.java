package AssignmentOne;
import java.util.Scanner;

// Write a program in Java to display the pattern like right angle triangle with a number

public class RightAngleTriangle {
public static Scanner scan;
public static void right_angle_triangle(){
	
}
public static void main(String args[]){
scan = new Scanner(System.in);
System.out.println("Number of rows for the right angle traingle");
int n = scan.nextInt();
System.out.println("Right angle traingle is below:");
for(int i=1,j=1;i<=n; i++,j++){
	for(j=1; j<=i;j++){
	System.out.print(j +" ");
	}
	System.out.println();
	}
}
}
