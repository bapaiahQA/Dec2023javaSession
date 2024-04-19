package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int k=1; k<=10; k++) {
//			System.out.println(k);
//		}
		//
//		for (int j=1; j<=10; ) {
//			System.out.println(j);
//		}

		int k = 1;
		for (; k <= 10;) {
			System.out.println(k);
			k++;

		}

//		for(; true ;) {
//			System.out.println("bye");
//		}

//		for (int p1=0; p1<=10; p1++) {
//			System.out.println("heloo world " +p1);//0-10
//		}
//		
//		for (int as=10; as>=1; as--) {
//			System.out.println("heloo world " +as);//0-10
//		}

		// while loop.
		// Check the condition then execute statement

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println(".............");

		int p = 1;
		while (p <= 100) {
			if (p % 5 == 0)

			{
				System.out.println("HI...");
				break;
			}
			p++;
		}
		
		//Use cases of while loop
		//lazy loading linked in
		//pagination
		//page loading
		//element is getting displayed.
		//calander
		//crousers
		
		
		//for loop when we know the limit
		//start>> increatse/decrease> check the condition>>perform action>
		//prrint statement
		
		
//		for (int a=1; a<=10;a++) {
//			System.out.println(a);
//		}
		
//		for (int p1=0; p1<=10; ++p1) {
//			System.out.println("heloo world " +p1);//0-10
//		}
		
		
//		for (int a=1; a<=10 ;) {
//		System.out.println("this is " + a);
//			a++;
//	}
		
		
//		for (; ;) {
//		
//		System.out.println("bye");
//		break;
//	}

	for (int even=0; even<=10; even++) {
		System.out.println(even);
		even++;
	}
	System.out.println("this is new");
	for (int even1=100; even1<=0; even1--) {
		
		System.out.println(even1%2);
	
	}
	}
}
