package AssignmentOne;
import java.util.Scanner;

// Write a Java program to solve quadratic equations (use if, else if and else)

public class SolveQuadraticEquations {
public static Scanner scan;

public void solve_quadratic_equations(int a, int b, int c){
	System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);	
}
public static void main(String args[]){
	SolveQuadraticEquations obj = new SolveQuadraticEquations();
	scan = new Scanner(System.in);
	System.out.println("Enter a:");
	int num1 = scan.nextInt();
	System.out.println("Enter b:");
	int num2 = scan.nextInt();
	System.out.println("Enter c:");
	int num3 = scan.nextInt();
	obj.solve_quadratic_equations(num1, num2, num3);
	double dis = num2*num2 - 4*num1*num3;
	
	if(dis > 0){
		System.out.println("Roots are real and unequal");
        double root1 = ( - num2 + Math.sqrt(dis))/(2*num1);
        double root2 = (-num2 - Math.sqrt(dis))/(2*num1);
        System.out.println("First root is:"+root1);
        System.out.println("Second root is:"+root2);	
	}
	else if(dis == 0)
    {
        System.out.println("Roots are real and equal");
        double root1 = (-num2+Math.sqrt(dis))/(2*num1);
        System.out.println("Root:"+root1);
    }
	else
    {
        System.out.println("Roots are imaginary");
    }
}
}
