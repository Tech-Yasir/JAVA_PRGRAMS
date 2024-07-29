package com.Array;

public class LargestNumber {

	public static void main(String[] args) {

		int Number[] = new int[] { 29, 23, 24, 76, 04, 38, 39, 88 };
		int max = Number[0];
		for (int i = 0; i < Number.length; i++) {
			if (Number[i] > max) {
				max = Number[i];

			}

		}
		System.out.println("Largest number in array --->" + max);

	}

}
