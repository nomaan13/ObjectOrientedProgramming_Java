package singleton_class;

import java.util.Scanner;

public class SingletonClass {

	String name;
	int id;
	
	
	private SingletonClass(String name , int id) {
		this.name = name;
		this.id= id;
		
	}
	
	static SingletonClass s =null;
	
	public static SingletonClass getInstance() {
		if (s ==null) {
			s= new SingletonClass("Nomaan ", 13);
			System.out.println(s);
			
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		SingletonClass sc =		SingletonClass.getInstance();
		
		System.out.println(sc);
		
	}
}
