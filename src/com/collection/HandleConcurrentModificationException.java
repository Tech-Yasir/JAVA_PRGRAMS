package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class HandleConcurrentModificationException {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		         arrayList.add("Dilshad");
		         arrayList.add(100);
		         arrayList.add("Yasir");
		         arrayList.add("Sammer");
		         arrayList.add("yasir");
		         System.out.println(arrayList);
		       Iterator ir= arrayList.iterator();
		       while (ir.hasNext()) {
		    	   System.out.println(ir.next());
		    	   arrayList.add("Aaadil");
		    	   System.out.println(arrayList);
		    	   ArrayList copyArrayList=new ArrayList();
		    	   
				
			}
		     

	}

}
