package javasessions;

public class Browser {
	
	
	public  void m1() {
		System.out.println("m1 method");
m2();
	}

	public  void m2() {
		System.out.println("m2 method");
m3();
System.out.println("hey");
	}

	public  void m3() {
		System.out.println("m3 method");
		//m2();

	}


	public static void main(String[] args) {
		
		Browser obj =new  Browser();
		obj.m2();
		// TODO Auto-generated method stub

	}

}
