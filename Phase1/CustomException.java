package exception;


public class CustomException {

	static void salary(int sal) throws SalaryException{  
	     if(sal<2100)  
		      throw new SalaryException("you need to work hard"); 
	     else if(sal > 2100 && sal <= 5000)
	    	 throw new SalaryException("your salary is somehow good"); 
	    else if(sal > 5100 && sal <9000)
	    	throw new SalaryException ("salary is very good");  
		   } 
	public static void main(String[] args) {
		try{  
	       salary(8000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	      System.out.println("rest of the code...");  
	  }   
	}

	class SalaryException extends Exception{  

		SalaryException(String s){  
		  super(s);  
		 }
	}
