package com.oops;

abstract class Abstraction3 {
	abstract void car();

}

class Abstraction2 extends Abstraction3 {
	void car() {
		System.out.println("car have four wheels");
	}

}
   class Abstraction1 extends Abstraction2{
	   void car() {
		   System.out.println("car color is black");
	   }
	   public static void main(String[] args) {
		   Abstraction1 abs= new Abstraction1();
		  abs.car();
		
	}
   }
