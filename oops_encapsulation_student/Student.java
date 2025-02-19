package oops_encapsulation_student;

public class Student {
	
	
	private String name ;
	private int roll_no;
	private int age;
	
	
	public Student() {
	} 
	
	public void setName(String name) {
		
	this.name=name;
	
	}
	public void setRollNo(int roll_no) {
		
		this.roll_no=roll_no;
		
	}
	public void setAge(int age) {
		this.age=age;
				
	}
	
	public String getName() {
		
		return name;
	}
	public int getRollNo() {
		return roll_no;
	}
	
	public int getAge() {
		return age;
	}
}
