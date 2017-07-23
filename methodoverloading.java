import java.util.Scanner; 
public class methodoverloading { 
	public static Scanner scan; 
	public void addition(int a, int b){
		System.out.println("SUM of TWO numbers is:");
		int SUM = a+b;
		System.out.println(SUM);
		} 
	public void addition(int x, int y, int z){
		System.out.println("SUM of THREE numbers is:");
		int sum = x+y+z; 
		System.out.println(sum); 
		}
	
	public static void main(String args []){
		methodoverloading obj = new methodoverloading();
		scan = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a = scan.nextInt();
		System.out.println("Please enter 2nd number");
		int b = scan.nextInt();
		obj.addition(a,b);
		System.out.println("##############################");
		System.out.println("Now SUM OF three numbers");
		System.out.println("Please enter 1st number");
		int x = scan.nextInt();
		System.out.println("Please enter 2nd number");
		int y = scan.nextInt();
		System.out.println("Please enter 3rd number");
		int z= scan.nextInt();
		obj.addition(x,y,z);
		}
	
} 