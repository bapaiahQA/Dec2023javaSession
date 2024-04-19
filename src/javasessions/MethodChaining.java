package javasessions;

public class MethodChaining {

	// method overloading
	public static void test() {

	}

	public static void test(int i) {

	}

	public static void test(int a, String b) {

	}

	public static void t1() {
		System.out.println("t1 method");
		t2();

	}

	public static void t2() {
		System.out.println("t2 method");
		t3();

	}

	public static void t3() {
		System.out.println("t3F method");
		
		MethodChaining obj = new  MethodChaining();
		obj.m2();

	}

	public  void m1() {
		System.out.println("m1 method");
m2();
	}

	public  void m2() {
		System.out.println("m2 method");
m3();
	}

	public static void m3() {
		System.out.println("m3 method");
		t1();

	}

	public static void main(String[] args) {
		MethodChaining.t1();
		MethodChaining obj = new  MethodChaining();
		obj.m1();
		obj.m2();
		// s - s --- class name.method name/directly
		//NS to NS directly
		//s to NS -- Create the obj
		// Ns to s classname.method
		//M -- NS -- Create the object

	}
}
