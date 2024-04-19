package javasessions;

import java.util.ArrayList;

public class FunctionsTest {

	// PSVM( String a[])

	// WAF funcation name : get student MArks
	// input param, Studentname( String)
	// return marks(int)

	public int getStudentmarks(String studentName) {
		System.out.println(" getting marks for student: " + studentName);

		int marks = -1;
		if (studentName.trim().equalsIgnoreCase("devika")) {
			// return 90;
			marks = 90;
		} else if (studentName.equalsIgnoreCase("ravi")) {
			// return 95;
			marks = 95;
		}

		else if (studentName.equalsIgnoreCase("naveen")) {
			// return 15;
			marks = 10;
		} else {
			System.out.println(" pls provide the student name " + studentName);
			// return -1;
		}
//re
//return 0;2
		return marks;

		// Multipe returns are the best exsize.

	}

	public int getMarks(String studentname) {
		System.out.println(" gettings marks for stundent:" + studentname);

		// Swicth boolean conditions are not allowd ion Swicth
		switch (studentname.toLowerCase().trim()) {
		case "devika":
			return 95;

		case "ravi":
			return 120;
		case "mavi":
			return 100;

		default:
			System.out.println("studenet name not found , pls add the right stundent name " + studentname);
			return -1;
	
	}
		
	}

	// WAF : launch browser (name)
	// input params : String Browser name
	// return : true/false

	public boolean launchBrowser(String Browsername) {
		System.out.println(" browser name " + Browsername);
		switch (Browsername.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is loaded");
			return true;
		case "firefox":
			System.out.println("firefox is loaded");
			return true;
		default:
			System.out.println("pls pass thr right browser " + Browsername);
			return false;

		}
	

	}

	
	//WAF
	//funcation name: getdevicelist
	//input param:empnmae
	//return : ArrayList<String>
	
	
	
	
	public ArrayList<String>  getDeviceList(String empname) {
		System.out.println("get device list"+empname);
		
		ArrayList<String> devcelist= new  ArrayList<String>(); //VC=10, PC =0;
		
		switch(empname.toLowerCase().trim()) {
		case "pallavi":
			devcelist.add("mac pro");
			devcelist.add(" pro");
			devcelist.add("13 pro");
			devcelist.add("11 pro");
			break;
		case "bapu":
			devcelist.add("winods pro");
			devcelist.add(" samsung pro");
			devcelist.add("13 pro");
			
			break;
			
		case "saida":
			devcelist.add("Airtel sim");

			break;
			
			default:
				System.out.println("pls pass the right emp name"+empname);
				break;	
		}	
		return  devcelist;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int i = 20; System.out.println(i);
		 */

		// rertun type :void

		FunctionsTest obj = new FunctionsTest();
		int m1 = obj.getStudentmarks("devika");
		obj.getMarks("devika");
		System.out.println(m1);
		if (m1 == -1) {
			System.out.println(" no need to print marksheet");

		} else {
			System.out.println("print marks");
		}

		int m2 = obj.getMarks("devika");
		System.out.println(m2);
		if (m2 == -1) {
			System.out.println(" no need to print marksheet");
		} else {
			System.out.println("print marks");
		}

	
boolean islaunched=	obj.launchBrowser("chrome");

System.out.println(islaunched);

if(islaunched) {
	System.out.println("enter the url");
}else
{
	System.out.println("no browser");
}
	
	}

}
