package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class LinkedHashMapFruit {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1,"Apple");
		linkedHashMap.put(2,"Orange");
		linkedHashMap.put(3,"Grapes");
		linkedHashMap.put(4,"Banana");
		linkedHashMap.put(5,"Pineapple");
		linkedHashMap.put(6,"Jackfruit");
		linkedHashMap.put(7,"Blackberry");
		linkedHashMap.put(8,"Avocado");
		linkedHashMap.put(9,"Bluekberry");
		linkedHashMap.put(10,"Cherry");
				
		
		 System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	     System.out.println("\nValues of map after iterating over it : ");
	        
	        for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
		
	    System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4) + " " + "\nRemove entry for key 7 : " + linkedHashMap.remove(7));
	    System.out.println("Content of LinkedHashMap after removing key 4 and 7 : " + linkedHashMap);
	    System.out.println("LinkedHashMap contains banana ? : " + linkedHashMap.containsValue("Banana"));
	    System.out.println("LinkedHashMap contains apple ? : " + linkedHashMap.containsValue("Apple"));
	    System.out.println("LinkedHashMap contains 4th key ? : " + linkedHashMap.containsKey(4));
	    System.out.println("LinkedHashMap Hashcode : " + linkedHashMap.hashCode());
	 
	    linkedHashMap.clear();

	}
}
