package assistedPractice.week1;

//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.
/*
In contrast to Java's String class, StringBuffer and StringBuilder are both mutable classes.
 The StringBuilder class and the StringBuffer class have the same API.

*/


public class PracticeProject8 {
	
	public static void main(String[] args) {
		
		String orgstr  = "Hello Milan!!" ; 
		System.out.println("Original String: "+orgstr);
		
		StringBuffer strbffr = new StringBuffer(orgstr);
		System.out.println("String converted to stringbuffer: "+strbffr);
		
		StringBuilder strbldr = new StringBuilder(orgstr);
		System.out.println("String converted to String Builder: "+strbldr);
				
	}
}
