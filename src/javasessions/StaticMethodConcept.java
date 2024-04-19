package javasessions;

public class StaticMethodConcept {
	public static String name;
	public int age;

	public static void getinfo() {
		System.out.println("get info");
	}

	public void sendEmail() {
		System.out.println("send email");
	}

	public static void main(String[] args) {
		
		//call static var & Methods:
		//1. by using class name;
		
		StaticMethodConcept.name="bbc";
		StaticMethodConcept.getinfo();
		//StaticMethodConcept.main(args);
		//System.out.print(StaticMethodConcept.main(args));
		//System.out.println(StaticMethodConcept.getinfo());
		System.out.println(StaticMethodConcept.name);
		//System.out.println(StaticMethodConcept.getinfo());
		
		//call non static methods using object
		StaticMethodConcept obj = new  StaticMethodConcept();
		obj.age=10;
		obj.sendEmail();
		System.out.println(obj.name);
		System.out.println(obj.age); //send email, 10
		obj.getinfo();
		//2 can access static var 7 Methods using obj refer name but with warning, not recomanded
		
		//3  can i access static var & methods directly -- without class name
		
		System.out.println (name);
		getinfo();
		
		

	}

}
