package assignments;

import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) {
		
		
        double num1, num2;  // stores two numbers
  
       
        Scanner sc = new Scanner(System.in);   // Take input from the user
  
        char ch=0;
		do{
        	
        
        System.out.println("Enter two the numbers: ");
  
        
        num1 = sc.nextDouble();  // take the inputs
        num2 = sc.nextDouble();  // take the inputs
        
        System.out.println("Select the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int op = sc.nextInt();
  
        double result = 0;
  
        switch (op) {
  
        // case to add two numbers
        case 1:
  
        	result = num1 + num2;
        	System.out.println("Addition of "+num1+" & "+num2+" is "+result);
            break;
  
        // case to subtract two numbers
        case 2:
  
        	result = num1 - num2;
        	System.out.println("Subtraction of "+num1+" & "+num2+" is "+result);
            break;
  
        // case to multiply two numbers
        case 3:
  
        	result = num1 * num2;
        	System.out.println("Multiplication of "+num1+" & "+num2+" is "+result);
            break;
  
        // case to divide two numbers
        case 4:
  
        	result = num1 / num2;
        	System.out.println("Division of "+num1+" & "+num2+" is "+result);
            break;
  
        default:
  
            System.out.println("You enter wrong input");
            break;
        	}
  
        	System.out.println("\nDo you want to continue (Type y or n) \n");
        	ch = sc.next().charAt(0);
		}while(ch == 'Y'|| ch == 'y');
	}

}
