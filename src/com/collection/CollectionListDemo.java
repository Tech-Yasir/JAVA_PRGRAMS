package com.collection;

import java.util.*;
public class CollectionListDemo {

	public static void main(String[] args) {
		List i=new ArrayList();
		i.add(100);
		i.add(1,283);
		i.add(2,293);         
		System.out.println(i);
		
		
		List repeat= new ArrayList();
		repeat.add("yasir");
		repeat.add(200);
		repeat.add(45);
		repeat.add("yasir");
		repeat.add("yasir");
		System.out.println(repeat);
	ListIterator li= repeat.listIterator();
     //    while (itr.hasNext())
	{
       // 	 System.out.println(itr.next());
			
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		}      
               
	}

}
