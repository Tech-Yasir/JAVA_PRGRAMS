package com.Array;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		Arrays.equals(a,b);
		System.out.println(a.equals(b));
		System.out.println(Arrays.equals(a, b));
		System.out.println(a==b);

	}

}
