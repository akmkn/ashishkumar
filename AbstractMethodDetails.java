package Allsoft;

// Abstact class example with abstract methods

abstract   class   AbstractClassExample {
abstract void display();

abstract void hello();	
/*
}*/
}
public class  AbstractMethodDetails extends AbstractClassExample{
	 void display(){
		System.out.println("Hello");
	}
 void hello(){
		System.out.println("hi");
	}
 public static void main(String args[]){
	 AbstractMethodDetails obj = new AbstractMethodDetails();	//upcasting 
		obj.display();
		obj.hello();
}
}
