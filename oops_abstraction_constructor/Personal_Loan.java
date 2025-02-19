package oops_abstraction_constructor;

public  class Personal_Loan extends Loan {
	
	String  name;
	int age;
	
	public Personal_Loan() {
		// TODO Auto-generated constructor stub
	}
	
	Personal_Loan(int loan_number,int roi,String name, int age){
		super(loan_number,roi);
		this.name=name;
		this.age=age;
		
	}
	
	
	@Override
	public void getEmi() {
		
		System.out.println("Monthly emi of your Personal Loan is  .");
		
	}

	
	public void display() {
		System.out.println("Your loan_number is :" + 		super.loan_number);
		System.out.println("Your rate of intrest is : "+ 	super.roi);
		System.out.println("Name of the applicant is : "+   this.name);
		System.out.println("Age of the applicant is : "+ 	this.age);
		
	}
}
