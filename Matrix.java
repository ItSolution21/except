package simple;

public class Matrix {
	
	public static int factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Please write positive number ");
		}
		
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	
	public static void simple(int n) {
		if(n%2 == 1) {
			throw new IllegalArgumentException(" Please enter even value");
		}
		
		System.out.println(n/2);
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a value");
//		int a = sc.nextInt();
//		System.out.println("Enter b value");
//		int b =sc.nextInt();
//		
//		try {
//			System.out.println(a/b);						
//		}finally {
//			System.out.println("Finally block is called");
//		}
//	
//		
//		for(int i=0; i<10; i++) {
//			System.out.println("Hello world");
//		}
//		
//		System.out.println("Another program");
//		sc.close();
		
//		
//		System.out.println(factorial(4));
//		System.out.println(divide(1,0));
//		System.out.println("Hello world");
		
//		simple(345);
		
		
		//unchecked Exception or runtime exception 
		int a = 12;
		int b =0;
		System.out.println(a/b);
		
		
		
		//checked exception
		try {
			Class.forName("something");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
