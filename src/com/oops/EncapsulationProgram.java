package com.oops;
class Account {  
	//private data members  
	private long acc_no;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	public long getAcc_no() {  
	    return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
	    this.acc_no = acc_no;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public float getAmount() {  
	    return amount;  
	}  
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
	  
	}  







    class EncapsulationProgram {

	public static void main(String[] args) {
		Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAcc_no(7275932778l);  
	    acc.setName("Khan Yasir");  
	    acc.setEmail("ky9137@gmail.com");  
	    acc.setAmount(500000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 

	}

}
