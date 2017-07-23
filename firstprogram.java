package Allsoft;
public class firstprogram {

static class A{
		int a,b;
		void display(int x, int y){
			a=x;
			b=y;
		}
	void Show(){
		System.out.println("value of a+b is: " + (a+b));
		System.out.println("value of a-b is: " + (a-b));
		System.out.println("value of aXb is: " + (a*b));
		System.out.println("value of a/b is: " + (a/b));
		System.out.println("value of a%b is: " + (a%b));
	}	
		
	}
	
public static void main(String args[]){
		A obj = new A();
		obj.display(40,20);
		obj.Show();
		
	}
}
