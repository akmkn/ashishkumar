package AssignmentOne;
import java.util.Scanner;

//. Write a program in Java to display the cube of the number upto given an integer

public class CubeOfnNumber {
public static Scanner scan;

public void cube_of_n_numbers(){
System.out.println("Cube of number is calculated successfully");	
}

public static void main(String args[]){
	CubeOfnNumber obj = new CubeOfnNumber();
scan = new Scanner(System.in);
System.out.println("Cube of how many first n naturals is to calcute : ");
int n = scan.nextInt();
for(int i=1; i<=n; i++){
int cube =	i*i*i;
System.out.println("Number is : "+i+"cube is : "+ cube);
}
obj.cube_of_n_numbers();
}
}
