package assistedPractice.week1;

public class PracticeProject7 {
	
	//Inner class Demo
	
	//attributes of outer class
	 
	private int outerVar = 10 ;
	private static int staticOuterVar = 20 ;
	
	class InnerClass
	{
		void display() {
			System.out.println("Inner Class MEthod Called");
			System.out.println("Outer variable accessed from the inner class--" + outerVar);
			System.out.println("Static outer variable accessed from inner class--" + staticOuterVar);
		}
	}
	
	public static void main(String[] args) {
		PracticeProject7 outer = new PracticeProject7() ;
		InnerClass inner = outer.new InnerClass() ; 
		
		inner.display();
	}

}
