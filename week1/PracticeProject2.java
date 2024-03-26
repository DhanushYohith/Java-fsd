package assistedPractice.week1;

public class PracticeProject2 {

    private int privateVar = 10;  
    int defaultVar = 20;  
    protected int protectedVar = 30;
    public int publicVar = 40;
    
    
    private void privateMethod() {
        System.out.println("Private method called.");
    }
    
    
    void defaultMethod() {
        System.out.println("Default method called.");
    }
    
   
    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }
    
    
    public void publicMethod() {
        System.out.println("Public method called.");
    }
    
    public static void main(String[] args) {
    	PracticeProject2 example = new PracticeProject2();
        
        
        System.out.println("Accessing members within the same class:");
        System.out.println("Private variable: " + example.privateVar);
        System.out.println("Default variable: " + example.defaultVar);
        System.out.println("Protected variable: " + example.protectedVar);
        System.out.println("Public variable: " + example.publicVar);
        
        example.privateMethod();
        example.defaultMethod();
        example.protectedMethod();
        example.publicMethod();
    }	
}
