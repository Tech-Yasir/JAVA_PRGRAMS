package com.Exception;

public class ArithemeticExceptionHandle {

	

	public static void main(String[] args) {
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		
		}
		System.out.println("Yasir");
	

	}

}
