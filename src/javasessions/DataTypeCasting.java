package javasessions;

public class DataTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte t = 10;
		int k = t;
		System.out.println(k);
		int p = 150;
//byte q=p;// int to byte won't work

//WE should not convert highr value to lower value
		byte c = (byte) p;
		System.out.println(c);

//
		long l = p;
		System.out.println(l);
		long l1 = 10000;
		float f1 = l1;
		System.out.println(f1);

		float f2 = 12.33f;
		long l2 = (long) f2;
		System.out.println(l2);// long can't hold any . values

		int i1 = (int) f2;
		System.out.println(i1);

		float f3 = 800.85f;
		byte b3 = (byte) f3;

		// Charcater can store any integer value

		int ch = 'a';
		byte bh = 'a';
		System.out.println(bh);
		
		char c1='b';
		int f11=c1;
		System.out.println(f11);
		
		
		int v=97;
		char v1=(char)v;
		System.out.println(v1);

	}

}
