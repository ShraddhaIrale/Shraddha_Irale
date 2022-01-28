package modifierassignment1;

public class P {

	
		public void methodPublic() {
			System.out.println("Public method of class P");
			methodProtected();
			methodDefault();
			methodPrivate();
	
		}

		protected void methodProtected() {
			System.out.println("Protected method of class P");
			
		}

		void methodDefault() {
			System.out.println("Default method of class P");
		}

		private void methodPrivate() {
			System.out.println("Private method of class P");
		}
		
		public static void main(String[] args) {
			new M().methodPublic();
			System.out.println("Value of long" + new M().k);
			System.out.println("Value of float" + new M().f);	
			
			
			System.out.println("Variables of class N");
			System.out.println("Value of long " + new N().l);
			System.out.println("Value of int " + new N().o);
			System.out.println("Value of double " + new N().d);
		}


	}

	


