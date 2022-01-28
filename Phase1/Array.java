package programs40;

public class Array {

	public static void main(String[] args) {
		
		//single dimensional array
		int [] a = {10,20,30,40};
		for(int i=0;i<=3;i++)
		{
			System.out.println("elements of array : "+a[i]);
		}
		
		
		//multidimensional array
		int [][] b = {{10,20,30,40},{50,60,30}};
		{
			System.out.println("\nlength of row 1: "+b[0].length);
			System.out.println("\nlength of row 2: "+b[1].length);
		}
	}

}
