package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListProblem {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		
	// to insert  the list
		li.add(10);
		li.add("JAVA");
		li.add(9746578l);
		li.add(674.85f);
		li.add('M');
		li.add(true);
		li.add(10);
		
 //to print the list
		
		System.out.println(li);
		
		//to find how many no of values are stored in list
		
		int size = li.size();
		System.out.println(size);
		
		
		//to get a particular value 
		
		Object object = li.get(3);
		System.out.println(object);
		
		// to remove a particular value
		li.remove(6);
		System.out.println(li);
		
		li.add(5," L");
		System.out.println(li);
		
		li.set(6, 20);
		System.out.println(li);
		
		boolean contains = li.contains("JAVA");
		System.out.println(contains);
		
		
		
		int indexOf = li.indexOf("JAVA");
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(674.85f);
		System.out.println(lastIndexOf);
		
		
		
		
		
		
 		
		
		
		
		
		
		
		
		
		
	}

}
