package com.collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListObject {
	public static void main(String[] args) {
		List arrayList = new ArrayList();

		arrayList.add(0,"Uzair");
		arrayList.add(3);
		arrayList.add(2,355);
		arrayList.add(3,2);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);


		System.out.println(arrayList);
		// contains Method check karta hai array ke ander value present hai ki nahi
		//ager hogi tu true value return kare ga otherwise false
		// return type boolean 
		System.out.println(arrayList.contains(2));

		ArrayList arraylist2 = new ArrayList();
		arraylist2.add("Yasir");
	arraylist2.add("diulshad");
	arraylist2.add("Ahmed");

		arrayList.addAll(arraylist2);
		System.out.println(arrayList);
		// array ki size kitna hai yeh btata index base per
		System.out.println(arrayList.size());
		arrayList.remove(3);
		// remove method index no per hune wale elements ko remove karta hai,
		//kisi element ko remove karna hai tu index no dalna pade ga
		System.out.println(arrayList);
			
		arrayList.clear();	
		System.out.println(arrayList);
	}

}
