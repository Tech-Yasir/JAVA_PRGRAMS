package com.control_statement;

import java.util.Scanner;


public class IfElseMoneyTax {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	 System.out.println("Enter your Income");
	 double income=sc.nextInt();
	 
	 double tax=calculateTax(income);
	 System.out.println("your income tax "+tax);
	 sc.close();
	}
	
	private static double calculateTax(double income) {
			double tax =0;
		
		if (income <=   10000) {
			tax=0.2 * income;
		}
		else if(income <=200000) {
			tax=0.3 * income;
			
		}
		else if (income<=300000) {
			tax=0.5 *income;
		}
		else 
			tax=0*income;
			
			return tax;
		}	
		}
	
	
k
	
 
