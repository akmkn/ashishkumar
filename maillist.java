package Collection;
import java.util.*;
class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	Address (String n, String s, String c, String st, String cd){
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
		
	}
	public String toString(){
		return name + "\n" + street+"\n" + city + " " +state + " " + code;
	}
}
public class maillist {
	
	public static void main(String srgs[]){
		LinkedList<Address> al = new LinkedList<Address>();
		al.add(new Address("Ashish Kumar","vpo rehan","Nurpur","Himachal Pardesh","176022"));
		
		for(Address element :al)
	System.out.println(element + "\n");
	}
}
