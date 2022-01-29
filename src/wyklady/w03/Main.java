package wyklady.w03;

public
	class Main {
		public static void main(String[] args) {
			int val = 10;
			// System.out.println(val == 15);
			
			// zwiększanie o 1
			val = val + 1;
			val += 1;
			System.out.println(val);
			System.out.println(++val);
			System.out.println(val++);
			System.out.println(val);
			// inkrementacja ++
			// dekrementacja --
			
			String answer = 16 > 15 ? "true" : "false";
			System.out.println(answer);
			if (val > 10) 
				System.out.println(val + " > 10");
			
			int wrt2;
			if (val > 20) {
				wrt2 = 4;
				System.out.println("wrt2: " + wrt2);
			} else {
				wrt2 = 9;
				System.out.println("wrt2: " + wrt2);
			}
			
			int size = 1;
			
			switch(size) {
				case 0:
					System.out.println("Nie masz aut");
					break;
				case 1:
				case 2:
					System.out.println("Masz do 2 aut");
					break;
				default:
					System.out.println("Masz wiele aut");
			}

				
		}
	}