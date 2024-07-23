package com.control_statement;

public class NestedIf {

	public static void main(String[] args) {
		String address = "Delhi, India";    
	    
		if(address.endsWith("India")) {    
		if(address.contains("Meerut")) {    
		System.out.println("Your city is Meerut");    
		}else if(address.contains("Noida")) {    
		System.out.println("Your city is Noida");    
		}else {    
		System.out.println(address.split(",")[1]);   // isko ,(koma) mila phir woh split kardega than spilt karne ke baad  index [1] jo dalo ge woh print kare ga                                          
		}    
		}else {    
		System.out.println("You are not living in India");    
		}    
		}    
	}


