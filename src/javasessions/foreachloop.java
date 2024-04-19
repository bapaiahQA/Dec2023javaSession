package javasessions;

public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {10,20,30,40,10,1};
		
		
//		//for ecah
//		
	for (int e:i) {
		System.out.println(e);
//		}
//		
//		System.out.println("-----------------");
//		for (int bapu:i)
//		{
//			System.out.println(bapu);
//		}
//		System.out.println("-----------");
//		
//		//dounbe 
//		
//		double d[] = {1.1,2.2,3.3,4.4};
//		for (double e:d) {
//		System.out.println(e);
//		}
//		
//		
//		//
//		
//		
//		String product[] = {"bapu", "bapu1", "bbc"};
//		
//		for (String s:product) {
//			System.out.println(s);
//			break;
		}
		System.out.println(",,,,,,,,,,,,,,");
		int count =0;
		int num[] = {0,12,30,20,20};
		for (int s:num) {
			//System.out.println(s);//0
			System.out.println(count+"-"+s);
			count++;
		}
		
		
		int numd=num.length-1;
		for (int p:num) {
			p=numd;
		//	System.out.println(numd+"-"+p);
			System.out.println(num[p]);
			numd--;
		}
		
		
		///rever order foreach loop wont use
		
		System.out.println("kkkkkkkkkkkk");
		
		char ch[] = {'a','b','c'};
		
		for (char c:ch) {
			System.out.println(c);
		}
//	int c=bh.length;
	char bh[] = {'A', 'B'};
	for (char b :bh) {
		System.out.println(b);
	}
	}

}
