package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//++ increase by 1 in memore
//-- decrement by 1 in memory

		int a = 1;
		int b = a++;
		System.out.println(a);// 2
		System.out.println(b);// 1

		int g = -98;
		int h = g++;
		System.out.println(g);// -97
		System.out.println(h);// -98

		int k = 10;
		System.out.println(k++);// 10
		System.out.println(k++);// 11

		// 2. Pre Increment

		int x = 1;
		int y = ++x;
		System.out.println(x);// 2
		System.out.println(y);// 2

		int p = -99;
		int q = ++p;
		System.out.println(p);// -98
		System.out.println(q);// -98
		
		int total =10;
		System.out.println(++total);//11
		System.out.println(total);//11
	
	//3. Post Decrement
		
		int u=2;
		int r=u--;
		
		System.out.println(u);//1
		System.out.println(r);//2
		
		int s1=10;
		
		System.out.println(s1--);//10
		System.out.println(s1);//9
		
		
		//4. Pre decrement
		
		int m=2;
		int n=--m;
		System.out.println(m); //1
		
		System.out.println(n);//1
		
		
		int t1=-999;
		int t2=--t1;
		System.out.println(t1);
		System.out.println(t2);
		
		
	
		
	
	}

}
