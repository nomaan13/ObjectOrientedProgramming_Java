package copy_constructor;

public class Employ {
	
	int id;
	String name;
	String comp;
	
	public Employ() {
		// no argument constructor
	}
	
	Employ(int id , String name){
		this.id=id;
		this.name=name;
		
		System.out.println("Id is : " +id+"\nName is: " +name);
	}
	
	Employ(Employ emp,String comp){
		this.id = emp.id;
		this.name = emp.name;
		this.comp = comp;
		System.out.println("Id is : " +id+"\nName is: " +name+"\nCompany is :" + comp);
	}
	

}
