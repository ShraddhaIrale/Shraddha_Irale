package programs40;

public class Methods {

		//demo method
		public int add(int a,int b)
		{
			int c = a+b;	 
			return c;
				
		}
		public static void main(String[] args) {
		
			Methods m = new Methods(); 
			int ans = m.add(20,10);
			System.out.println("Addition of 20 and 10 is : "+ans);
		}

}
