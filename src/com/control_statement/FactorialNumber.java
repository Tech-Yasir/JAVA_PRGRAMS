package com.control_statement;


import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Factorial no");
		int number=src.nextInt();
		int factorial=1;
		for (int i=1;i<=number;i++) {
			factorial*=i;
			
		}
		System.out.println(number +"is"+ factorial);
	}

}
