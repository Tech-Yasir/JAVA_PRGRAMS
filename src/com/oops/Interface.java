package com.oops;

interface Yasir {

	void show();
}

   class Faiz implements Yasir {
	public void show() {

		System.out.println("khanYasir");

	}

}

public class Interface {
	public static void main(String[] args) {
		Faiz ir = new Faiz();
		ir.show();

	}

}
