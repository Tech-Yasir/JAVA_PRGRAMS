package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("One");
		myList.add("Two");
		myList.add("Three");

		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			if (element == "One") {
				element.remove(1); // Safe removal using the iterator
				System.out.println(element);
			}
		}
	}

}
