package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Months {

	public static void main(String[] args) {
		int a1=6;
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add(0, "April");
        ll.add("November");
        
        System.out.println(ll);
        
        ll.addLast("December");
        ll.addFirst("January");
        
        System.out.println(ll);
        
        ll.add(1, "March");
        ll.add(1, "February");
        
        System.out.println(ll);
        
        ll.add(8, "September");
        ll.add(9, "Octomber");
        
        System.out.println(ll);
        
        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()) 
        {
        	System.out.println("list is "+ itr.next());
        }
        System.out.println("\n");
        
        System.out.println(ll.get(1) +" is a even month");
        System.out.println(ll.get(3) +" is a even month");
        System.out.println(ll.get(5) +" is a even month");
        System.out.println(ll.get(7) +" is a even month");
        System.out.println(ll.get(9) +" is a even month");
        System.out.println(ll.get(11) +" is a even month");
        
        System.out.println("\n");
        
        System.out.println(ll.get(0) +" is a odd month");
        System.out.println(ll.get(2) +" is a odd month");
        System.out.println(ll.get(4) +" is a odd month");
        System.out.println(ll.get(6) +" is a odd month");
        System.out.println(ll.get(8) +" is a odd month");
        System.out.println(ll.get(10) +" is a odd month");
        
        System.out.println("\n");
        
        System.out.println("First Month : " + ll.getFirst() +"  "  + "Last Month : " + ll.getLast());
        
        System.out.println("\n");
       
        System.out.println("Remove Birthday Month: " +ll.remove(6));
        
        System.out.println("\n");
        
        System.out.println("LinkedList Contains Any Winter Month : " + ll.contains("December"));        
        
        }
	}

