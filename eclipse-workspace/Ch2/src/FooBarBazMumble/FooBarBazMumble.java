package FooBarBazMumble;

public class FooBarBazMumble {
	public static void main(String[] args) {
		foo();
		bar();
		System.out.println("mumble");
		math();
		modulus();
		String a = "Hello";
		System.out.println(computeSum(7,4));
		 
		System.out.println(a + 42);
	 }
	
	 public static void foo() {
		 System.out.println("foo");
	 }
	 
	 public static void bar() {
		 System.out.println("bar");
	 }
	 
	 public static void baz() {
		 System.out.println("baz");
	}
	public static void math() {
		System.out.println(14/4);
	}
	
	public static void modulus() {
		System.out.println(14%4);
	}
	
	public static int computeSum(int x, int y) {
		int sum = x + y;
		return sum;		
	}
	
}

