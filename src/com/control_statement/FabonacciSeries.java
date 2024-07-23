package com.control_statement;

public class FabonacciSeries {

	public static void main(String[] args) {
		int no1 = 0, no2 = 1, i, no3,count=20;

		
		for (i = 2; i < count; i++) {
			System.out.println(no1);
			System.out.println(no2);

			no3 = no1 + no2;

			System.out.println(no3);
			no1 = no2;
			no2 = no3; 

		}

	}
}