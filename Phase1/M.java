package modifierassignment1;

public class M {
	
	private int s = 87;   
	long k = 1000;       
	protected float f = 67.98f;
	
	public void methodPublic(){     
		System.out.println("Public method of class M");
		methodProtected();
		methodDefault();
		methodPrivate();
	}
	
	protected void methodProtected(){   
		System.out.println("Protected method of class M");

	}
	
	void methodDefault(){    
		System.out.println("Default method of class M");
	}
	
	private void methodPrivate(){ 
		System.out.println("Private method of class M");
		System.out.println("Value of private value s of class M " + s);

	}
}