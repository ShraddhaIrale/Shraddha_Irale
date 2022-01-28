package exception;

public class exmple {

	public static void main(String[] args) {
		 int a[]=new int[5];
         try{    
              
              a[5]=30/0; 
            
             }    
            catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }  
         try {
     	    
      	   a[6]=9;
      	   }
         
         
             catch(ArrayIndexOutOfBoundsException e)  
                {  
          	   
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
         
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                } 
      
         finally{
      	   System.out.println("rest of the code");
         }
	}
}
         


