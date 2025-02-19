package oops_abstraction_constructor;

public abstract class Loan {

	int loan_number;
	int roi;
	
	Loan(){}
	
	Loan(int loan_number,int roi){
		this.loan_number = loan_number;
		this.roi=roi;
	}
	
	//Abstract method
	
	public abstract void getEmi();
	
	
	
}
