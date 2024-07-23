package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet linkedHashset=new LinkedHashSet(100, 90);
		linkedHashset.add("khanYasir");
		linkedHashset.add("Sameer");
		
		System.out.println(linkedHashset);
		LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashset);
		linkedHashSet2.add("abrar");
		System.out.println(linkedHashSet2); 

	}

}
