package com.control_statement;

public class ElseIfProgram {

	public static void main(String[] args) {
		int marks = 50;
		
		if (marks == 10 && marks==40) {
			System.out.println("going to sakinaka ");

		} else if (marks < 100) {
			System.out.println("going to mumbai");
		} else if (marks >= 30) {
			System.out.println("going to kurla");

		} else if (marks <= 60) {
			System.out.println("going to andheri");
		} else {
			System.out.println("dont going");
			
		}
	}

}
