package Allsoft;

public class stringhandle {

public static void main(String args[]){
	String b = " Hello, how are you!";
	StringBuffer obuffer= new StringBuffer("ashish kumar dhiman");
	StringBuilder obuilder = new StringBuilder("ashish dhiman nirmohi");
	// String b = "Hello "; 
	obuffer.append(b);
	obuilder.append(b);
	System.out.println(obuffer);
	System.out.println(obuilder);
	/*String a = "       hfhf";
	String b = "             hfHF"; 
	char v[]={'g','a'};
	
	String  h= new String(v);
	System.out.println(h);
	
	
	//   check 
	/*System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.compareTo(b));
	System.out.println(a==b);
	String  d=a.concat(b);
	System.out.println(a+b);*/
	//System.out.println(a.trim());	
}
}
