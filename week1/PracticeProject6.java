package assistedPractice.week1;

import java.util.* ; 

public class PracticeProject6 {
	public static void main(String[] args) {
		
		//HAshMAp
		
		Map< String , Integer> hashMap = new HashMap<>() ; 
		hashMap.put("John" , 25) ;
		hashMap.put("Alice" , 30) ; 
		hashMap.put("Bob" , 35) ;
		
		System.out.println("HashMap:");
		for(Map.Entry<String , Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue()); 
		}
	
		//TreeMap
		
		Map<String , Integer> treeMap = new TreeMap<>() ; 
		treeMap.put("Red" , 1) ;
		treeMap.put("Green" , 2);
		treeMap.put("Blue" ,3);
		
		System.out.println("\nTreeMap:");
		for(Map.Entry<String  , Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+ "-" + entry.getValue());
		}
		
		
		//Linked HashMap
		
		Map<String , Integer> linkedHashMap = new LinkedHashMap<>() ; 
		linkedHashMap.put("Bob" , 10) ;
		linkedHashMap.put("Alice" , 8) ;
		linkedHashMap.put("Harold" ,5) ;
	
		System.out.println("\nLinkedHashMap:");
		
		for(Map.Entry<String , Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() +"-" + entry.getValue());
		}
	}
}
