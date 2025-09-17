
public class inClassLoops {

	public static void main(String[] args) {
		
		int terms=10;
		int rows = 7;
	//	forFibonacci(terms);
		
	//	rightTri(rows);
		equilTri(rows);
		
//		int num = 0;
//		int sum = 0;
//		for(int i = 0;i<=9; i++ ) {
//			sum = sum+i;
//		
//		}
//		System.out.println(sum);
	}

	private static void equilTri(int rows) {
		for(int i = 0; i<rows; i++) {
		
			for (int j = 0; i<rows - i;j++) {
				System.out.println(" ");
			}
			
			for (int j = 1; j<i+1;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}

//	private static void rightTri(int rows) {
//		for(int i = 0; i<rows; i++) {
//			for (int j = 0; j<i;j++) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
//		
//	}

//	private static void forFibonacci(int terms) {
//		
//		if(terms < 1) {
//			 System.out.println("Please use positive integers only!");
//		 }
//		int firstTerm = 0;
//		int secondTerm = 1;
//		
//		System.out.printf("Fibonacci sequence up to %d terms", terms);
//		
//		if(terms == 1) {
//			System.out.println(firstTerm);
//			return;
//		}
//		System.out.print(firstTerm + ", " + secondTerm);
//		for(int i = 2;i<terms;i++);{
//			int nextTerm = firstTerm + secondTerm;
//			System.out.println(", " + nextTerm);
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//		}
//		System.out.println();
		
//	}

}
