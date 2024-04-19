package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// can not create a Function/method inside a function;
	// funcations are paralle to each other
	// but can call a funcation from another function
	// ns funca == data members of the class

	// 1st function no input and no return
	// input : no input - o parameteres
	// return : void -- can not retun anything

	public void test() {
		System.out.println("test method");
	}

	// 2nd fun: somu input and no return

	public void getBill(int days) { // parameters
		System.out.println(" getting billing info");

		int fincalAmount = days * 100;
		System.out.println(fincalAmount);
	}

	// 3rd funcation with som input and return

	public int sum(int a, int b) {
		System.out.println("adding 2 numbers");
		int s = a + b;
		return s;
	}

	// 4th funcation : no input and some return

	// return type is String

	public String getinfo() {
		System.out.println("getting string information");
		String s = "hello app";

		return s;
	}
//return type boolean
	public boolean isAppexist() {
		return true;
	}
	
	
	public int calculateMarks(int marks, int extraMarks, int discMarks) {
		int finalMarks =marks+extraMarks-discMarks;
		return finalMarks;
		
	}
	// funcations can not have multiple returns
	//return should be the last statemnet
	public int testing() {
		System.out.println("testing id done");
		return 100; // 
	}
	
	
	public  void printName() {
		System.out.println("Naveen");
		return; // blank return  -- Void
	
	}
	
	public void launchurl ( String url) {
		System.out.println(url);
		return;
	}
	
	public String[] getdevices()
	{
		System.out.println("getiing devices");
		String devices[] = {"macbooc bro ", "test", "iphone15"};
		return devices;
	}
	
	
	public ArrayList<String> getUserList() {
		System.out.println(" getting list");
		
		ArrayList<String> usdrlist= new ArrayList<String>();
		usdrlist.add("shiva");
		usdrlist.add("bapu");
		usdrlist.add("bbc");
		
		return usdrlist;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		obj.getBill(10); // calling a funcation by passing a value is claaed call by value

		obj.getBill(20);

		System.out.println(obj.sum(10, 20));
		int m = obj.sum(5, 10);
		System.out.println(m);
		System.out.println(m - 5);

		int m1 = obj.sum(-10, 4);
		System.out.println(m1 + 9);
		obj.sum(10, m1);
		obj.sum(10, 10);
		String mesg =obj.getinfo();
		System.out.println(mesg);
		
		if(obj.isAppexist()) {
			System.out.println("login to app");
			obj.launchurl("bapu");
	String mydevoces[]	=	obj.getdevices();
	System.out.println(Arrays.toString(mydevoces));
	System.out.println(mydevoces.length);
	
	ArrayList<String> mylist= obj.getUserList();
	System.out.println(mylist);
	System.out.println(mylist.size());
	mylist.add("bbcone");
	
	
	
		}

	}
}
