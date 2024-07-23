package PracticeCoding;

import java.util.*;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter your prime no");
		int t = src.nextInt();

		
		for (int i = 0; i <= t; i++) {
			int n=src.nextInt();
			System.out.println(i);

		}
if(t%2==0) {
	System.out.println("its no is prime");

	
}
else {
	System.out.println("its no not prime");
}
	}

}
