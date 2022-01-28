package functionoverloading;

public class Numeric {
	
	public static void Calculate(int a,int b) {
		
		int res=a+b;
		System.out.println("addition of two number is " +res);
		return;
		}
	
	public static void Calculate(int r) {
		
		int area=(int) (2*3.14*r);
		System.out.println("area of circle is " +area);
		return;
		}

	public static void Calculate(double p,int q) {
		
		double areat= p*q;
		System.out.println("area of rectangle is " +areat);
		return;
		}
	
	public static void main(String[] args) {
		
		Calculate(10,20);
		Calculate(20);
		Calculate(3.1,40);
	}

}
