package regx;

import java.util.regex.Pattern;

public class RegXExp {

	public static void main(String[] args) {
		System.out.println ("shraddha@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.com","shraddha@gmail.com"));
		System.out.println ("6736985437 : "+Pattern.matches("\\d{10}","6736985437"));
		System.out.println ("shraddha02irale67 : "+Pattern.matches("[shr][a-z]+\\d{2}+[a-z0-9]+","shraddha02irale67"));
		
	}
}


