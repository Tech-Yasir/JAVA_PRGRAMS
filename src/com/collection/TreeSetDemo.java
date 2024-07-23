package com.collection;

import java.nio.file.DirectoryIteratorException;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] zaid) {
		TreeSet treeset = new TreeSet();
		treeset.add(50);
		treeset.add(30);// TreeSet follow the sorting order
		// treeset.add(10);does not allow the heterogeneous data-type
		System.out.println(treeset.add(100));// if value is not present in list then return true
		System.out.println(treeset);
		Iterator itr = treeset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(treeset.pollFirst());
	}

}
