package com.control_statement;

import java.util.Scanner;

public class PrimeNO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 2, count = 0;
		System.out.println("enter the any number");
		a = s.nextInt();
		for (int div = 2; div < a; div++) {
			if (a % div == 0) {
				count++;
			}
 
		}
		if (count > 0) {
			System.out.println(" not a prime ");
		} else {
			System.out.println("prime no");
		}
	}
}
