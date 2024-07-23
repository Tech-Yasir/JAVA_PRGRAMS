  package com.control_statement;

import java.util.Scanner;

public class MakeCalculator {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		System.out.println("Enter ypur first no");
		int a = cal.nextInt();
		System.out.println("Enter your second no");
		int b = cal.nextInt();
		System.out.println("Select your symbol(-,+,*,%,/)");
		String symbol = cal.next();
		int res;
		switch (symbol) {
		case "+":
			res = a + b;
			System.out.println("Additin the number:" + res);
			break;
		case "-":
			res = a - b;

			System.out.println("Substractin the number" + res);
			break;
		case "*":
			res = a * b;
			System.out.println("Multipication the number " + res);
			break;
		case "/":
			res = a / b;
			System.out.println("Division the number " + res);
			break;
		case "%":
			res = a % b;
			System.out.println("Modulus the number " + res);
			break;
		default:

			System.out.println("Not macth the symbol");
			break;

		}

	}

}
