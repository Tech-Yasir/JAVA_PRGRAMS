package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Handle {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(20);
		list.add(40);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer s = iterator.next();
			//System.err.println(s);
			if (s == 10) {
				list.remove(0);
				System.out.println(list);

			}
		}
	}

}
