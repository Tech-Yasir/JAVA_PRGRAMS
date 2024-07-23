package com.collection;

import java.util.*;

public class CollectionSetdemo {

	public static void main(String[] args) {
		List ary = new ArrayList();
		ary.add("yasir");
		ary.add("ahmed");

		ary.add("sameer");
		ary.add(300);

		System.out.println(ary);
		Iterator itr = ary.iterator();
		// while(itr.hasNext()) {
//		System.out.println(itr.next()); 
		// hasNext()check if there is another element in the collection
		// next()method used to retrieve the next element in the collection

	}

}
