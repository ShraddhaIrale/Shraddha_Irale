package modifierassignment1.child;

public class X {

	private int t = 90;   
	long h = 9000;       
	protected float f1 = 53.23f;
	public char c = 'd';
	
	public void methodPublic(){
		System.out.println("Public method of class X");
		methodPrivate();
	}
	
	protected void methodProtected(){ 
		System.out.println("Protected method of class X");
		
	}
	
	void methodDefault(){
		System.out.println("Default method of class X");
	
	}
	
	private void methodPrivate(){     
		System.out.println("Private method of class X");
		System.out.println("Value of private variable t of class X "+ t);
		

	}
}
