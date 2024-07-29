package com.Array;

import java.util.Arrays;

public class SortedMethod {

	public static void main(String[] args) {
		int[][] rollno = { { 1, 2, 3, 4 }, { 5, 6 } };
		/*
		 * for(int i=0;i<rollno.length;i++) { Arrays.sort(rollno);
		 * System.out.println(rollno[i]);
		 * 
		 * }
		 */
		for (int i = rollno.length - 1; i >= 0; i--) {
			for (int j = rollno.length - 1; j >= 0; j--)
				System.out.println(rollno[i][j]);
			

		}

	}

}
