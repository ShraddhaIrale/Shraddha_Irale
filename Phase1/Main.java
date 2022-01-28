package inheritance;


class Product {

	int id =78;
	String name ="Amul";
	
	public void display(){
		System.out.println("Id of the Product is " + id);
		System.out.println("Name of the Product is " + name);
	}
 }
	 class A extends Product{
		
		int count = 50;
		String category = "Butter";
		
		public void display(){
			System.out.println("Count of the A is " + count);
			System.out.println("Category of the A is " + category);
	}
	}
		
	 class B extends Product{
			
		int count = 90;
		String category = "Milk";
		
		public void display(){
			System.out.println("Count of the B is " + count);
			System.out.println("Category of the B is " + category);
		}
	}
		
	 class C extends Product{
			
		int count = 56;
		String category = "Choco";
			
		public void display(){
			System.out.println("Count of the C is " + count);
			System.out.println("Category of the C is " + category);
		}
	}
	 class SubA extends A{
			
		int price = 30;	
		
		public void display(){
			int Total_price= count * price;
			System.out.println("Total Price is " + Total_price);
			System.out.println("Id of the Product is " + id);
			System.out.println("Name of the Product is " + name);
			System.out.println("Category of the A is " + category);
		}
	}
	
	 class SubB extends B{
		
		int price = 10;	
		
		public void display(){
			int Total_price= count * price;
			System.out.println("Total Price is " + Total_price);
			System.out.println("Id of the Product is " + id);
			System.out.println("Name of the Product is " + name);
			System.out.println("Category of the A is " + category);
		}
	}
public class Main {

	public static void main(String[] args) {
		SubA A=new SubA();
		SubB B=new SubB();
		A.display();
		B.display();
		
	}

}
