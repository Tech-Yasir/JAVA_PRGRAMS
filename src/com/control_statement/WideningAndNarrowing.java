package com.control_statement;

public class WideningAndNarrowing {

	public static void main(String[] args) {
		int a = 10;
		float b = a; // widening   type cast
		System.out.println(a);
		System.out.println(b);
		float f = 20.0f;
		int g = (int) f;// narrowing  type cast
		System.out.println(f);
		System.out.println(g);
		int y=130;
		byte z=(byte)y;// overflow
		System.out.println(y);
		System.out.println(z);
		short s=10;
		short x=10;
		int w=(int)x+s;  //type cast 
		System.out.println(w);
		
		

	}

}
