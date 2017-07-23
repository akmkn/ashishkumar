package Allsoft;

public class methodover {
	
	
	void method(int  a,int  b){
		System.out.println(a+b);
		
		
	}
	void method(int  a,int  b,int c){
		System.out.println(a+b+c);
		
	
	}
	//  bank problm
	
public  static  void   main(String arg[]){
	
	methodover ob=  new  methodover();
	ob.method(2, 4);
	ob.method(4, 6, 7);
}
}