package oops_abstraction_constructor;

public class Home_Loan  extends Loan{
	
	String name;
	int age;
	
	public Home_Loan() {
		// TODO Auto-generated constructor stub
	}
	
	
	Home_Loan(int loan_number,int roi,String name, int age){
		super(loan_number,roi);
		this.name=name;
		this.age=age;
		
	}

	
	@Override
	public void getEmi() {
		
		System.out.println("Monthly emi of your Personal Loan is  .\"");
		
	}

}
