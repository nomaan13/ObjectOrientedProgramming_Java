package oops_encapsulation;

public class Employ {
	
	private String name;
	 private int roll_no;
	 
	 
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getRoll_no() {
		return roll_no;
	}
	
	
	public void setRoll_no(int roll_no) {
		if (roll_no>0) {
			
			this.roll_no = roll_no;
			
		}
		else {
			
		}
		
	}
	
	


}
