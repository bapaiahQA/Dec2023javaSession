package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Non primitive data type
		// similar kind of data type it can store.

		// array using new keyword
//		int i=10;
//		i =20;
//		i =30;
//		System.out.println(i);//30 this is not a array

		//// array using new keyword
		// new keyword to create onject and initilize the arrya also

		
		/*limitation in array*/
		// size of the array is fixed : it's static array
		//it can store only similar data types
		//object array also a static array.  // solution is the arraylist or collections
		
		//Real time exmples
		
		
		
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4]=50;// AIOB , dynamically won't increase
		System.out.println(i[0]);// 10
		// System.out.println(i[4]);// Arayindexoutbound exception AIOB
		// System.out.println(i[-1]);
		System.out.println(i); /// address of the array never use this
		System.out.println(Arrays.toString(i));
//print the value from the arrya;

		for (int k = 0; k <= 3; k++) {
			System.out.println(i[k]);//10
			if(i[k]==20) {
				System.out.println("this is game");
				break;
			}
			// In Selenium all the footer links available in the page
System.out.println("bye");
		}
		
		
		System.out.println(i.length);
		
		
		///
		short sh [] = new short[3];
		System.out.println("length = "+sh.length);
		System.out.println("li="+0);
		System.out.println("hi="+(sh.length-1));
		System.out.println(Arrays.toString(sh));
		sh[0]=10;
		System.out.println(Arrays.toString(sh));
	sh[2]=40;
	System.out.println(Arrays.toString(sh));
	// if you don't want to use -1 in lengthe remove equal and -1
	for (int p=0; p<=sh.length-1; p++) {
		System.out.println(sh[p]);
	}
	
	//character array
	
	
	char ch[] = new char[4];
	ch[0]= 'a';
	ch[1] ='1';
	ch [2]='$';
	ch [3] =98;
	System.out.println(ch[3]);
	System.out.println(Arrays.toString(ch));
	//emp data
	
	
	//float
	
	
	float fh[]= new float [2];
	fh [0] =12.33f;
	fh[1]=100;
	System.out.println(",,,,,,,,,,");
	System.out.println(fh);
	System.out.println(Arrays.toString(fh));
	//object array: it can store any kind of data types
	
	Object empdata[] = new Object[5];
	
	empdata[0]="bapu";
	empdata[1]=30;
	empdata[2]=25.55;
	empdata[3]=true;
	empdata[4]='f';
	System.out.println(Arrays.toString(empdata));
	
	 System.out.println(empdata.length);
	 
	 
	 //string array;
	 
	 String product[] =new String[3];
	 product [0]="MAC";
	 product [1]="MAC pro ";
	 product [2]="MAC new";
//	 for (int x=0; x<=product.length-1; x++){
//	 System.out.println(product[x]);
//	 if(product[x].equals("MAC new")) {
//		 System.out.println("out of stock");
//	 }
//	
//	 }
	 
	 //
	 

	 
	 

	}

}
