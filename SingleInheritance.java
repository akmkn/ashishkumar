package Allsoft;

public class SingleInheritance {
	void show(){
		System.out.println("Hello, how are you. I am in base class.");
	}	
	public static void main(String args[]){
		B obj = new B();
		obj.display();
		obj.show();
		
		}
}	
class B extends SingleInheritance{
	void display(){
		System.out.println("Hello, how are you. I am in derived class.");
	}	
}
