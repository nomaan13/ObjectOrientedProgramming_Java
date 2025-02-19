package method_chaining;

public class MethodChaining {
	
	private int id ;
	private String name;
	private long sal;
	private String comp;
	
	public MethodChaining() {
	}
	
	public MethodChaining getId(int id) {
		this.id=id;
		return this;
		
	}
	public MethodChaining getName(String name) {
		this.name = name;
		return this;
		
	}
	public MethodChaining getSalary(long sal) {
		this.sal=sal;
		return this;
	}
	public MethodChaining getCompany(String comp) {
		this.comp= comp;
		return this;
		
	}
	
	@Override
	public String toString() {
		return "Id is :"+id+"\nName is :"+name+"\nSalary is :"+sal+"\nCompamy name is :"+comp ;
	}

	public static void main(String[] args) {
		MethodChaining m1 = new MethodChaining();
		
		m1.getId(103).getName("Jack").getSalary(25000).getCompany("HCL");
		System.out.println(m1);
	}
}
