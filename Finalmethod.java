package Allsoft;

// Final method can not be over-ridden

public class Finalmethod {

	final public void display(){
		System.out.println("Hello");
	}
	public static void main(String args[]){
		Finalmethod obj = new Finalmethod();
		obj.display();
	}
}

class finalmethodinheritance extends Finalmethod{
	//void display(){ System.out.println("hello final methos");} 
}
