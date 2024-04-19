package javasessions;

public class ConditinalStatements {
	public static void main(String args[]) {

		int x = 10, y = 20;

		System.out.println(x > y);

		if (x > y) {
			System.out.println("pass");
		} else {
			System.out.println("FAIL");// FALSE
		}

//

		if (true) {
			System.out.println("HI");
		} else {
			System.out.println("bye");// Bye
		}

//
		boolean flag = true;
		if (flag = true) {
			System.out.println("hello");// hello

		} else {
			System.out.println("world");

		}
		System.out.println("this" + flag);
//
		int t1 = 200;
		int t2 = 100;
		if (t1 >= t2) {
			System.out.println("t1 and t2 are greather than or equal");
		}
//
		int p1 = 100;
		int p2 = 200;
		if (p1 != p2) {
			System.out.println("selenium");

		}

		// Wrong approach
		String browser = "chrome"; // 1 .Chrome 2. chrome
		if (browser.equals("chrome")) {
			System.out.println("L chroime");// 2chrom
		}
		if (browser.equals("firefox")) {
			System.out.println("L fire");
		}
		if (browser.equals("edge")) {
			System.out.println("l edge");
		}
		if (browser.equals("safari")) {
			System.out.println("l safari");
		} else {// else condition for last if conditions only
			System.out.println("Pls pass the righjt browser");// 1st pls psaa thr wright browser
		}
//
		String browser1 = "chrome"; // 1 .Chrome 2. chrome
		if (browser1.equals("chrome")) {
			System.out.println("L chroime");// 2chrom
		} else if (browser1.equals("firefox")) {
			System.out.println("L fire");
		} else if (browser1.equals("edge")) {
			System.out.println("l edge");
		} else if (browser1.equals("safari")) {
			System.out.println("l safari");
		} else {// else condition for last if conditions only
			System.out.println("Pls pass the righjt browser");

		}
	}

}
