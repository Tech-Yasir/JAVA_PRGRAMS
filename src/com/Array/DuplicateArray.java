package com.Array;


public class DuplicateArray {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 5, 9, 3, 2, 7, 7, 8, };
		System.out.println("Duplicate Arrray");
		for (int i = 0; i < a.length; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}

			}

		}

	}

}
