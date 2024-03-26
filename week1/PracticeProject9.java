package assistedPractice.week1;

public class PracticeProject9 {
	
	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5} ;
		// Display each element 
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("ELement at index "+i+" is: " + arr[i]);
		}	
		
		// Updating element in the array 
		System.out.println("--------------------------");
		arr[2] = 19 ;
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("ELement at index "+i+" is: " + arr[i]);
		}
		
	}
}
