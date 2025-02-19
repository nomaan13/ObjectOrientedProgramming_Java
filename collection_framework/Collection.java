package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(500);
		al.add("Nomi");
		al.add('N');
		
		
		System.out.println(al);
		
		Iterator itr =al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
				
				
				
				
				
				
				;
		}
}
