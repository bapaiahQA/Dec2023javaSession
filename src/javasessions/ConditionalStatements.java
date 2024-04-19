package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=20;
System.out.println(x>y);
	
	if(x>y) {
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
	
	if(true) {
		System.out.println("Hi");
	}
	else {
		System.out.println("bye");
	}
	
	if(false) {
		System.out.println("Hi");
	}
	else {
		System.out.println("bye");
	}
	
	boolean flag =true;
	if (flag) {
		System.out.println("hello");
	}
	else {
		System.out.println("world");
	}
	
	boolean flagf =false;
	if (flagf) {
		System.out.println("hello");
	}
	else {
		System.out.println("world");
	}
	
	
	//
	int t1=100;
	int t2=100;
	if (t1>t2) {
		System.out.println("t1 and t2 are gr or eq");
	}
	
	if (t1>=t2) {
		System.out.println("t1 and t2 are gr or eq55");
	}
	
	//
	int p1=100;
	int p2=100;
	if (p1!=p2) {
		System.out.println("selenium");
	}
	
	//
	
	/*String browser = "chrome";
	if(browser.equals("chrome"));
	{
		System.out.println(" l chrome");
	}
	if(browser.equals("firefox")) {
		System.out.println("2 firefox");
	}
	if(browser.equals("IE")) {
		System.out.println("3 IE");
	}
	else {
		System.out.println("provide correct Browser info");
	}*/
	}

}
