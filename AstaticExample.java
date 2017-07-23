
public class AstaticExample {
int rollno;
String name;
static String company = "Allsoft";
AstaticExample(int a, String b){
	rollno = a;
	 name = b ;
}
static void abc(){
	
	company= "ibm";
	System.out.println("Himachal Paresh");
	
}
 void display(){
	 
	 System.out.println( rollno + "   "+ name+company);
 }

	public static void main(String ar[]){
		AstaticExample obj = new AstaticExample(0016, "ashish");
		
		obj.display();
	}
}
