package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintNull {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list.get(3));
	}
}
