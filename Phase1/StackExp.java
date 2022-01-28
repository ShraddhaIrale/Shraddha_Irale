package stack;

import java.util.Stack;

public class StackExp {

	public static void main(String[] args) {
		
		// Default initialization of Stack 
	     Stack<Comparable> stack1 = new Stack<Comparable>(); 


	     // pushing the elements 
	     stack1.push("Apple"); 
	     stack1.push("Orange");
	     stack1.push("Grapes"); 
	     stack1.push("Banana");
	     stack1.push("Cherry");
	     stack1.push("Delhi");
	     stack1.push("Mumbai");
	     stack1.push("Pune");
	     stack1.push("Hyderabad");
	     stack1.push("Banglore");
	     stack1.push(2);
	     stack1.push(3);
	     stack1.push(5);
	     stack1.push(7);
	     stack1.push('d');
	     stack1.push('h');
	     
	     
	     System.out.println("All stack Elements "+ stack1);
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     
	     
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	     
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     System.out.println("Popped element from stack 1: " + stack1.pop());
	     
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	     
	     System.out.println("index of element All inside the stack"+ stack1.indexOf("Apple"));
	     System.out.println("index of element All inside the stack"+ stack1.indexOf("Delhi"));
	     
	     
	}

}
