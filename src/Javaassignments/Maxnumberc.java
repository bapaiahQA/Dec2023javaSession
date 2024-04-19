package Javaassignments;

public class Maxnumberc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1000,b=400,c=300,d=200;
//if (a>=b && a>=c && a>=d ) {
//	System.out.println(" A is greaterthan");
//}
//else if (b>=a && b>=c && b>=d) {
//	System.out.println("B is gretaerthan");
//}else if (c>=a && c>=b && c>=d) {
//	System.out.println("C is greate");
//}else
//{
//	System.out.println(" D is greatertahn");
//}
//	
	
	
	//&
	
//if (a>=b & a>=c & a>=d ) {
//	System.out.println(" A is greaterthan");
//}
//else if (b>=a & b>=c & b>=d) {
//	System.out.println("B is gretaerthan");
//}else if (c>=a & c>=b & c>=d) {
//	System.out.println("C is greate");
//}else
//{
//	System.out.println(" D is greatertahn");
//}
	
	// even numbers

String  evennumberlits ="";
for (int i=0; i<=100; i++) {
	if (i%2==0) {
		evennumberlits=(evennumberlits+i +" ,");
		
	}
}
//System.out.println(i);
	System.out.println(evennumberlits);
	
	
	
	// a to z with ASCII

//	for (char ch = 'a'; ch <= 'z'; ch++) {
//
//	System.out.println(ch + " = " + (float) ch);
//
//	}
	
	
	 for (char ch = '0'; ch <= '9'; ch++) {

         System.out.println(ch + ": " + (byte) ch);

     }
	
	}

}
