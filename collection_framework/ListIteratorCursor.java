package collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorCursor {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		l1.add("JIMMY");
		l1.add(1234);
		l1.add('M');
		l1.add("CAT");
		l1.add(2210824);
		
		
		System.out.println(l1);
		System.out.println("========================================");
		
		ListIterator  l2 =  l1.listIterator();
		
		while (l2.hasNext()) {
			System.out.println(l2.next());
			
		}
	}
}
