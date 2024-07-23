package com.oops;

interface Tiger {
	void roar(); // by default method id abstract

	void hunt();

	int a = 10; // constant field , by default public static final
	
	
	
}

class Lion implements Tiger {

	@Override
	public void roar() {
		System.out.println("Lion is roaring");

	}

	@Override
	public void hunt() {
		System.out.println("lion is on hunt");

	}

}

public class MyInterface {

	public static void main(String[] args) {
		
	
		
		System.out.println(Tiger.a); // access my constant field
		Lion lion = new Lion();
		lion.roar();
		lion.hunt();
		System.out.println(Tiger.a); // access my constant field <<access class name dot variable name>>

	}

}
