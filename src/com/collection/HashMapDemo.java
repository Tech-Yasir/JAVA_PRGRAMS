package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.Media;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put(300, "Science Book");
		hashmap.put(100, "lab book");
		hashmap.put(150, "English book");
		hashmap.put(70, "NoteBook");
		System.out.println(hashmap);
		//Set set = hashmap.entrySet();//print key and value in square bracket[]entry method 
		//System.out.println(set);
	//	Iterator iterator = set.iterator();
		//while (iterator.hasNext()) {
		//	Map.Entry entry=(Map.Entry)iterator.next();
	//		System.out.println(entry.getKey()+"--->"+entry.getValue());
			
			//System.out.println(iterator.next());
// there are two types to iterate value first one (above)by using iterator
	   	// second by using for each loop
	//	for (Map.Entry obj:hashmap.entrySet()) {
		//	System.out.println(obj.getKey()+"----->"+obj.getValue());
			
		}
		
		}
	//}


