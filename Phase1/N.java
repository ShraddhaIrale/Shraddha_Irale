package modifierassignment1;

public class N {

	protected long l = 67;
	public int o = 47;
	double d = 23;
	

	public void methodPublic(){  
		System.out.println("Public method of class N");
		methodProtected();
		methodDefault();
		methodPrivate();

	}
	
	protected void methodProtected(){   
		System.out.println("Protected method of class N");

	}
	
	void methodDefault(){    
		System.out.println("Default method of class N");
	}
	
	private void methodPrivate(){     
		System.out.println("Private method of class N");

	}
}
