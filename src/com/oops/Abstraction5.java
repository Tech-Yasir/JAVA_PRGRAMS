package com.oops;
abstract class Bank{
	abstract int getRateOfInterest();
}
class Sbi extends Bank{
	int getRateOfInterest() {
		System.out.println("jiu");
		return 7;
	}
}
	class KOTAK extends  Sbi{
		int getRateOfInterest() {
			return 8;
		}
	}
  public class Abstraction5 {

	public static void main(String[] args) {
		Bank bank;
		bank=new Sbi();
		System.out.println("Rate of Interst"+bank.getRateOfInterest()+"%");
		bank=new KOTAK();
		System.out.println("Rate of Interest"+bank.getRateOfInterest()+"%");

	}

}