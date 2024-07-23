package com.collection;

import java.util.*;


public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList ali=new ArrayList();
		ali.add("Yusuf");
		ali.add("Yasir");
		ali.add("Hashim");
		ali.add(100);
		ali.add(13.4);
		System.out.println(ali);
		Iterator ad=ali. iterator(); {
			
			while(ad.hasNext())
			{
				System.out .println(ad.next());
				
			}
		}
}
}