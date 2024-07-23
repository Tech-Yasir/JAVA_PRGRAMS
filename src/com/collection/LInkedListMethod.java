package com.collection;

import java.util.LinkedList;

public class LInkedListMethod {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("Yasir");
		li.add("mushahid");
		li.add("Dilshad");
		
		li.add("Madara");
		li.add(7275);
		li.add('d');
		//linkedList method
		li.addFirst("Tanveer");
		li.addLast("Tamjeed");
	
		System.out.println(li.getLast());

	}

}
