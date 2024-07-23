package com.control_statement;


public class AccessPrivetField {

	 int b = 10;
	  static int a=10;
	
	 
	public static void main(String[] args) {
                 AccessPrivetField ob= new AccessPrivetField();
                 ob.a=50;
                 ob.b=80;
                 
		  System.out.println(ob.a);
		  System.out.println(ob.b);
		  AccessPrivetField accessPrivetField = new AccessPrivetField();
		  System.out.println(accessPrivetField.b);
		  System.out.println(accessPrivetField.a);
	}
}
