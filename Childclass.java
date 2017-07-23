package Allsoft;

 class Parentclass {
public void xyz(){
	System.out.println("Hello parent calss");
}

}
public class Childclass extends Parentclass{
	public void xyz(){
		System.out.println("Hello child calss");	
	}
	public void a(){}
	public static void main(String args[]){
		Parentclass obj = new Childclass();
		obj.xyz();
	}
}
