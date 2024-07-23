package com.control_statement;

public class ObjInisializeUsingMethod {
	int age;
	String color;

	void yasir(int as, String r) {
		age = as;
		color = r;

	}

	void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		ObjInisializeUsingMethod oh = new ObjInisializeUsingMethod();
		oh.yasir(10, "khan");
		oh.display();
	}

}
