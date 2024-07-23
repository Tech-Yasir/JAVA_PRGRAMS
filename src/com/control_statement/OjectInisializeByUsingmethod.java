package com.control_statement;

public class OjectInisializeByUsingmethod {
	String name;
	int age;

	void yasir(String a, int b) {
		name = a;
		age = b;
		System.out.println(name + " " + age);

	}

	public static void main(String[] args) {
		OjectInisializeByUsingmethod ob = new OjectInisializeByUsingmethod();
		ob.yasir("Khan", 10);

	}

}
