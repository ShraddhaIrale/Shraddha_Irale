package functionoverloading;

public class MethodConstructor {

	MethodConstructor(int p){
		System.out.println("area of square " + p*p);
		
	}
	
	MethodConstructor(double b,int c){
		System.out.println("area of rectangle " + b*c);

	}
	
	MethodConstructor(double r){
		System.out.println("area of circle " + 3.14*r*r);
		
	}
	
	public static void display(int p,double b,int c,double r) {
		System.out.println("area of square " + p*p);
		System.out.println("area of rectangle " + b*c);
		System.out.println("area of circle " + 3.14*r*r);
	}
	
	public static void area(int d1,int d2) {
		
		int rt= (d1*d2)/2;
		System.out.println("area of rombhus is " +rt);
		return;
		}
	public static void area(double x,double y) {
		
		double t= (x*y)/2;
		System.out.println("area of triangle is " +t);
		return;
		}
	
	public static void main(String[] args) {
		
		MethodConstructor obj1 = new MethodConstructor(10);
		MethodConstructor obj2 = new MethodConstructor(4.5,8);
		MethodConstructor obj3 = new MethodConstructor(5);
		area(40,70);
		area(10.1,6.8);
	}
	
}
