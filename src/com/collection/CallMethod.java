package com.collection;
 class Test {
    
	void show() {
		
		System.out.println("Yasir");
}
}
class B extends Test{
	
	void show() {
		super.show();
		System.out.println("Sarfraz");
	}	
}
 public class CallMethod{
	public static void main(String[] args) {
		
		Test t = new B();
	    t.show();
//		Test test = new Test();
//		test.show();
	}
	
}
