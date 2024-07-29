package com.Array;

import PracticeCoding.forLoop;

public class ArrayEvenPosition {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
		for (int i = 0; i < a.length; i = i + 2) {

			System.out.println(a[i]);
		}

	}

}
