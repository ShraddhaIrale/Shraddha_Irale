package inheritance;


abstract class Vehicle{
	
	int speed = 80;
	long distance = 90;
	
	abstract void run();
	abstract void stop();
	abstract void display();
	
	public void fuel(int a){
		System.out.println("int parameter");
	}
	
	public void fuel(float b, String c){
		System.out.println("float parameter" + " and " + " string parameter ");
	}
	
	public void fuel(char d, int e){
		System.out.println("char parameter" + " and " + " int parameter ");
		System.out.println("");
	}
}

class TwoWheeler extends Vehicle{
	
	int speed = 60;
	long distance = 70;
	int num_of_tire = 2;
	
	TwoWheeler(){
		System.out.println("default concstructor of two Wheeler");
	}
	
	void run(){
		 System.out.println("Inside run method");
	 }
	 void stop(){
		 System.out.println("Inside stop method");
	 }
	
	public void display(){
		System.out.println("Speed of 2 Wheeler is " + speed);
		System.out.println("Distance of 2 Wheeler is " + distance);
		System.out.println("num of tire of 2 Wheeler is " + num_of_tire);
		System.out.println("Speed of Vehicle is " + super.speed);
		System.out.println("Speed of Vehicle is " + super.distance);
		System.out.println("");
	}
}

 class ThreeWheeler extends Vehicle{
	
	int speed = 45;
	long distance = 78;
	int num_of_tire = 3;
	
	ThreeWheeler(){
		System.out.println("default concstructor of three Wheeler");
	}
	
	void run(){
		 System.out.println("Inside run method");
	 }
	 void stop(){
		 System.out.println("Inside stop method");
	 }
	
	
	public void display(){
		System.out.println("Speed of 3 Wheeler is " + speed);
		System.out.println("Distance of 3 Wheeler is " + distance);
		System.out.println("num of tire of 3 Wheeler is " + num_of_tire);
		System.out.println("Speed of Vehicle " + super.speed);
		System.out.println("Speed of Vehicle " + super.distance);
		System.out.println("");
	}
}

 class FourWheeler extends Vehicle{
	
	int speed = 66;
	long distance = 89;
	int num_of_tire = 4;
	
	FourWheeler(){
		System.out.println("default concstructor of four Wheeler");
	}
	
	void run(){
		 System.out.println("Inside run method");
	 }
	 void stop(){
		 System.out.println("Inside stop method");
	 }
	
	
	public void display(){
		System.out.println("Speed of 4 Wheeler is " + speed);
		System.out.println("Distance of 4 Wheeler is " + distance);
		System.out.println("num of tire of 4 Wheeler is " + num_of_tire);
		System.out.println("Speed of Vehicle " + super.speed);
		System.out.println("Speed of Vehicle " + super.distance);
		System.out.println("");
	}
}
 class EightWheeler extends Vehicle{
	
	int speed = 68;
	long distance = 79;
	int num_of_tire = 8;
	
	EightWheeler(){
		System.out.println("default concstructor of eight Wheeler");
	}
	
	 void run(){
		 System.out.println("Inside run method");
	 }
	 void stop(){
		 System.out.println("Inside stop method");
	 }
	
	 
	
	public void display(){
		System.out.println("Speed of 8 Wheeler is " + speed);
		System.out.println("Distance of 8 Wheeler is " + distance);
		System.out.println("num of tire of 8 Wheeler is " + num_of_tire);
		System.out.println("Speed of Vehicle " + super.speed);
		System.out.println("Speed of Vehicle " + super.distance);
		System.out.println("");
	}
}
public class Main1 {

	
	public static void main(String[] args) {
		
		Vehicle v = new TwoWheeler();
		v.run();
		v.stop();
		v.display();
		v.fuel(2);
		v.fuel(2.7f,"fuel");
		v.fuel('v',7);
		
		Vehicle v1 = new ThreeWheeler();
		v1.run();
		v1.stop();
		v1.display();
		
		Vehicle v2 = new FourWheeler();
		v2.run();
		v2.stop();
		v2.display();
		
		Vehicle v3 = new EightWheeler();
		v3.run();
		v3.stop();
		v3.display();
		
	}

}
