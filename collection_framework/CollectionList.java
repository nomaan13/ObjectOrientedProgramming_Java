package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();

		li.add(123);
		li.add(80);
		li.add(45);
		li.add(null);
		li.add(45);
		li.add(1, 100);

		System.out.println(li);

//======================================================================================================

		List<String> l2 = new LinkedList<String>();
		l2.add("AUS");
		l2.add("KSA");
		l2.add("ENG");
		l2.add("IND");
		l2.add("WI");
		l2.add("PAK");
		l2.add(null);
		l2.add("IND");

		System.out.println(l2);
//======================================================================================================
		List<Double> l3 = new Vector<>();
		l3.add(5.23);
		l3.add(89.23);
		l3.add(15.23);
		l3.add(50.23);
		l3.add(2, null);
		System.out.println(l3);
//======================================================================================================

		List<Character> l4 = new Vector<>();
		l4.add('h');
		l4.add('e');
		l4.add('l');
		l4.add('l');
		l4.add('o');
		l4.add(null);

		System.out.println(l4);
//======================================================================================================
		List<Float> l5 = new Stack<Float>();
		l5.add(5454.12310f);
		l5.add(500.335f);
		l5.add(994.37854f);
		l5.add(90254.30f);
		l5.add(944.154f);
		l5.add(3, null);

		System.out.println(l5);

	}
}
