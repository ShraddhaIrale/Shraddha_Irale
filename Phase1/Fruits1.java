package collection;

import java.util.LinkedHashSet;

public class Fruits1 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Grapes");
		hs.add("Banana");
		hs.add("Pineapple");
		hs.add("Jackfruit");
		hs.add("Blackberry");
		hs.add("Avocado");
		hs.add("Bluekberry");
		hs.add("Cherry");
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("Does hashset contains this 'Orange' element  " + hs.contains("Orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element "+hs.remove("Blackberry"));
		System.out.println("remove the element "+hs.remove("Avocado"));
		System.out.println("add the element "+hs.add("Lemon"));
		System.out.println("add the element "+hs.remove("Kiwi"));
		System.out.println("add the element "+hs.remove("Mango"));
	}
}
