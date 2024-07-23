package com.control_statement;

public class DefaultConstructer {
	  
		int id;  
		String name;  
		
		void display(int id,String name)
		{
			System.out.println(id+" "+name);
			}  
		  	
		public static void main(String args[]){ 
			
			DefaultConstructer s1=new DefaultConstructer(); 
			
			DefaultConstructer s2=new DefaultConstructer();  
		s1.display(10,"Yasir");  
		s2.display(23,"ke");  
		}  
		}  


