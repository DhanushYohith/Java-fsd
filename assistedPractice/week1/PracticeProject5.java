package assistedPractice.week1;

import java.util.*;

public class PracticeProject5 
{
	
	public static void main(String[] args) 
	{
		
		//ArrayList
		List<String> arrayList  = new ArrayList<>() ; 
		
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		
		System.out.println("ArrayList:");
		for(String fruit : arrayList)
		{
			System.out.println(fruit);			
		}
		
		//Linked List
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Blue");
		
		System.out.println("\nLinkedList: ");
		for(String color : linkedList) 
		{
			System.out.println(color);
		}
		
		//HashSet
		
		Set<String> hashSet = new HashSet<>() ; 
		hashSet.add("Cat"); 
		hashSet.add("Dog");
		hashSet.add("Elephant");
	
		System.out.println("\nHashSet:");
		for(String animal : hashSet) {
			System.out.println(animal);
		}
		
		//HashMAp
		
		Map<Integer , String> hashMap = new HashMap<>() ; 
		hashMap.put(1,"One") ;
		hashMap.put(2,"two") ;
		hashMap.put(3,"three") ; 
		
		System.out.println("\nHashMap:");
		for(Map.Entry< Integer , String > entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		
	}
}
