package com.Array;

public class LargestNumber {

	public static void main(String[] args) {
		

		int yasir[] = new int[] { 29, 23, 24, 76, 04, 38, 39, 88 };
		int max=yasir[0];
		for (int i = 0; i < yasir.length; i++) {
			if (yasir[i] > max) {
				max = yasir[i];
			}
			System.out.println("Largest number in array" + max);
			

		}

	}

}
