package modifierassignment1.child;

import modifierassignment1.M;
import modifierassignment1.N;
import modifierassignment1.P;

public class Z extends M{

	public static void main(String[] args) {
		
		new N().methodPublic(); 
		
		new M().methodPublic();
		
		new P().methodPublic();
		
		System.out.println("Value of long " + new X().h);
		System.out.println("Value of float " + new X().f1);
		System.out.println("Value of char " + new X().c);
		
	}

}
