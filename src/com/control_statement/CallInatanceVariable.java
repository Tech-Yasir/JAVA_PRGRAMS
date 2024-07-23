package com.control_statement;

	public class CallInatanceVariable {
	int yasir=15;
        static int a=10;
	public static void main(String[] args) {
		
		{
			int c=30;
			System.out.println(c);
		}
		CallInatanceVariable you= new CallInatanceVariable();
	System.out.println(you.yasir);
	System.out.println(CallInatanceVariable.a);
		
	}
	
	

}
