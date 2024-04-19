package javasessions;

public class Application {
	
	//duplicate methods are not allowed in java
	
	//method overloading
	//1. when you have different methods
	//2. with different parameters
	//3. with the different sequence of the parameters
	//4. in case of methods overloading is not matter only methods name is the matter
	//5.
	
	
	public void test() {
		
	}
	public String test(int i) {
		return " testing";
	}
	
	public void test(int i, String k) {
		

	}
public void test( String k, int i) {
		

	}
	


public static void main(String[] args) {
	
	
	
	Application obj = new Application();
	obj.test();
	obj.test(10);
	
	
}

}
