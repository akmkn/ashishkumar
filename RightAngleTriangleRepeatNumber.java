package AssignmentOne;
import java.util.Scanner;

/* Write a program in Java to make such a pattern like right 
angle triangle with a number which will repeat a number in a row */

public class RightAngleTriangleRepeatNumber {
public static Scanner scan;
public void right_angle_repeat_number(){
	
}
public static void main(String args[]){
scan = new Scanner(System.in);
System.out.println("Enter how many rows should be there for right angle traingle");
int n = scan.nextInt();
for(int i=1; i<=n; i++){
	for(int j=1; j<=i; j++){		
	System.out.print(i +" ");	
}
System.out.println();
}

}
}
