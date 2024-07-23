package StiringProgram;
//wap to reverse Arrays without using function.
//wap to reverse a String without using function.
//wap to found occuring elenment in a string.
//wap to addition and multiplication using interface.

public class PrintDuplicateElement {

	public static void main(String[] args) {
		String str="Khan yasir";
		for(char i: str.toCharArray()) { 
			if(str.indexOf(i)==str.lastIndexOf(i)) {
				System.out.println(i);
			}
			
		}
		
		
		
		

	}

}
