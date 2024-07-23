package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet st = new TreeSet();
		st.add(1);
		st.add(100);
		st.add(50);
		st.add(49);

		System.out.println(st);
		System.out.println(st.headSet(50));
		System.out.println(st.tailSet(49));

	}

}
