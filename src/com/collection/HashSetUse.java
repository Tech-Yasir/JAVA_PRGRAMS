package com.collection;

import java.util.HashSet;

public class HashSetUse {

	public static void main(String[] args) {
	HashSet hashset=new HashSet();
	hashset.add("yasir");
	hashset.add(100);
	hashset.add("dilshad");
	hashset.add(true);
	hashset.add('d');
	System.out.println(hashset);
	hashset.add("yasir");
	hashset.add(null);
	System.out.println(hashset.add("dilshad"));

	}

}
