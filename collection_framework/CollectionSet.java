package collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
	int id;
	String name;
	double sal;
	char gender;
	
	public CollectionSet() {	}
	
	CollectionSet(int id, String name,double sal, char gender){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.gender=gender;
	}

	@Override
	public String toString() {
		
		return "Id : " + id + "\nName :" + name + "\nSalary : " + sal +"\nGender: " + gender ;
	}
	

	public static void main(String[] args) {
		
		CollectionSet cs = new CollectionSet();
		cs.id=102;
		cs.name="Jack";
		cs.sal=2500.56;
		cs.gender='M';
		
		CollectionSet cs2 = new CollectionSet(103,"RObb",2000.900,'M');
		CollectionSet cs3 = new CollectionSet(104,"Zoya",2800.120,'F');
		CollectionSet cs4 = new CollectionSet(106,"Jlo",3900.560,'F');
		CollectionSet cs5 = new CollectionSet(109,"MJ",4000.60,'M');
		
		
		Set<CollectionSet> s1 = new HashSet<CollectionSet>();
		s1.add(cs);
		s1.add(cs2);
		s1.add(cs3);
		s1.add(cs4);
		s1.add(cs5);	
		
		
		System.out.println(cs  + "\n==========\n"+ cs2 +"\n==========\n" + cs3 +"\n==========\n" + cs4+ "\n==========\n"+cs5);
		System.out.println("__________________________________________________________________________________-");
		
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(56);
		s2.add(89);
		s2.add(null);
		s2.add(null);//MULTIPLE NULL VALUES ARE NOT ALLOWED WITH SET
		s2.add(78);
		s2.add(89);//TRYING TO ADD DUPLICATE VALUE BUT IN OPUTPUT IT WILL NOT ADD THIS VALUE
		
		System.out.println(s2);
		System.out.println("__________________________________________________________________________________-");
		
		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(56);
		s3.add(89);
		s3.add(null);
		s3.add(null);//MULTIPLE NULL VALUES ARE NOT ALLOWED WITH SET
		s3.add(78);
		s3.add(89);//TRYING TO ADD DUPLICATE VALUE BUT IN OPUTPUT IT WILL NOT ADD THIS VALUE
		
		System.out.println(s3);
		System.out.println("__________________________________________________________________________________-");
		
		
		Set<Integer> s4 = new TreeSet<>();
		s4.add(56);
		s4.add(200);
		s4.add(300);
		s4.add(100);	
		s4.add(1);
		s4.add(200);//DUPLICATE VALUES NOT ALLOWED IN TREESET 
	
		System.out.println(s4);

		
		
		
	}
}
