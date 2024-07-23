package com.control_statement;

import java.util.Iterator;

public class OneToHundredTableForm {

	public static void main(String[] args) {
		int c=1;
		for (int i = 1; i <= 10; i++) {
                 for(int j=1;j<=10;j++) {
                	 System.out.print(c +" ");
                	 c +=10;
                 }
                 c=i+1;
                 System.out.println("");
			
		}

	}
	
	
	
	

}
