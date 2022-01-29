package wyklady.w04;

public
	class Main {
		public static void main(String[] args) {
			int counter = 1;
			// while(counter < 11) 
			//	 System.out.println(counter++);
			
			while(counter < 10) {
				System.out.println("counter: " + counter);
				counter += 2;
			}
			
			//java.util.Scanner scan = new java.util.Scanner(System.in);
			//int val;
			//do {
			//	val = scan.nextInt();
			//	System.out.println("> " + val);
			//}while(val != 0);
			
			// System.out.println("koniec do-while");

			for(int i = 0; i < 10; i++)
				System.out.println("for: " + i);
			
			//=============
			
			for(int i = 0; i < 10; i++) {
				if (i > 5)
					break;
				
				System.out.println("for-break: " + i);
			}
		}
	}