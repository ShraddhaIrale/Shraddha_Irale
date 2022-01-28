package programs40;

public class StringToPrimitiveType {

	public static void main(String[] args) {
		
		//converting number string into integer
		String s= "200";
		int i1 = Integer.parseInt(s);
		System.out.println("String to Integer : "+i1);
		
		//converting number string into double
		double d = Double.parseDouble(s);
		System.out.println("String to Double : "+d);
		
		//converting number string into long
		long l = Long.parseLong(s);
		System.out.println("String to Long : "+l);
		
		//converting number string into boolean
		boolean b = Boolean.parseBoolean(s);
		System.out.println("String to Boolean : "+b);
		
		//converting number string into short
		short ss = Short.parseShort(s);
		System.out.println("String to Short : "+ss);
		
		//converting number string into float
		float f = Float.parseFloat(s);
		System.out.println("String to Float : "+f);
				
		//converting number string into character
		String s1="hello";
		for(int i = 0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			System.out.println("String to Char : "+c);
			
		}
	}

}
