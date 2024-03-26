package assistedPractice.week1;

public class PractiseProject1 {
	public static void main(String[] args) {
		
		//Implicit casting Explicit Casting
		
		// Implicit - Done automatically by the java compiler
			
		double a = 3; //No error 
		System.out.println("Implicit Casting: "+a);
		
		/* Explicit Casting - Programmer should specify when converting a
		   					  larger type to a narrower type.
			
		*/
		
		//float num = 3.5;  Throws error
		
		float num = (float) 3.5;
		int y  = (int) 4.5;
		System.out.print("Explicit Casting: "+num+" , "+y);
		
	
	}
}
