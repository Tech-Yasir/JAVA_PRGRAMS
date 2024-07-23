package com.oops;

class InheritanceExample {

	int show() {
		System.out.println("English");
		return 19;
	}
}

class SingleInheritance extends InheritanceExample {
	
	void zayn() {
		super.show();
		
		System.out.println("Urdu");
	}

	public static void main(String[] args) {
		SingleInheritance yasir = new SingleInheritance();
		yasir.zayn();
		
		
	}
}
