package com.Array;

import java.util.Iterator;

public class ReverseInString {
	
	public static void main(String[] args) {
		String str="aziz abdul am i ";
		String [] arr=str.split("\\s");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
