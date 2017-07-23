package Allsoft;

public class EncapsulationSetGet {
	private int id;
	private String name;
	public int getid(){
		return id; }
	public int setid(int id){
	return this.id= id;
	}
	public String getname(){
		return name;
	}
	public String setname(String name){
		return this.name =name;
	}
	
public static void main(String args[]){
EncapsulationSetGet obj = new EncapsulationSetGet();
obj.setid(25);
obj.setname("Ashish");
System.out.print(obj.getid() +" " +obj.getname());
	}
}
