package com.oops;

interface Student{
	void yasir();
}
interface Teacher{
	void faisal();
}
class Result implements Student,Teacher{
	public void yasir() {
		System.out.println("Pass");
	}
	public void faisal() {
		System.out.println("Excilent");
	}
}

public class MultipleleInheritanec {

	public static void main(String[] args) {
		Result result=new Result();
		result.yasir();
		result.faisal();

	}

}
