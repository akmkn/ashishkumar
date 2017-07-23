package Allsoft;

// Final classes can not be inherited

final public class  Finalclass {
void display(){
	System.out.println("Hello final class");
}
	public static void main(String args[]){
		Finalclass obj = new Finalclass();
		obj.display();
	}
}
//class b extends Finalclass{}