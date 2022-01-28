package collection;



import java.util.TreeMap;

public class TreeMapFruit {

	public static void main(String[] args) {
		 TreeMap<String, Integer> marks = new TreeMap<String, Integer>();
		
		 marks.put("Apple"      ,1);
		 marks.put("Orange"     ,2);
		 marks.put("Grapes"     ,3);
		 marks.put("Banana"     ,4);
		 marks.put("Pineapple"  ,5);
		 marks.put("Jackfruit"  ,6);
		 marks.put("Blackberry" ,7);
		 marks.put("Avocado"    ,8);
		 marks.put("Bluekberry" ,9);
		 marks.put("Cherry"     ,10);
				
		
		 System.out.println("Contents of LinkedHashMap : " + marks);
	     System.out.println("\nValues of map after iterating over it : ");
	        
	        for (String key : marks.keySet()) {
	            System.out.println(key + ":\t" + marks.get(key));
	        }
	}
}
