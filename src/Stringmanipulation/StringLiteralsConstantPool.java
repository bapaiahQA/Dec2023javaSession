package Stringmanipulation;

public class StringLiteralsConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String tr="Hello"; // immutabvle == can not be changed
		
		tr=tr.concat("selenium");
		System.out.println(tr);
		
		
		int i=10; //mutable
		i=i+20;
		System.out.println(i);
		
		//String literls
		String s1="Hello";//1 -scp
		String s2="Hello";//0
		
		String s3=new String("world");//1 -heap, 1-scp
		
		String s4="world";
		String s5="Hello";
		String s6=new String ("Selenium");  //1 -heap, 1-scp
		String s7="Selenium";
		String s8=new String ("Selenium");
		
		System.out.println(s1==s2); //scp ==scp ==true ( It compares the values)
		
		
		System.out.println(s4==s3);//SCP== Heap --false
		
		System.out.println(s6==s8);//heap ==heap --false
		
		
		System.out.println(s6.equals(s8));//true
		System.out.println(s4.equals(s3));//true

		
		String obj= new String ("testing");// 1heap  , 1SCP =2
		String ob= new String ("testing"); // 1heap 0scp == scp won't allow duplicate
		System.out.println(obj==ob);  //flase
		System.out.println(obj.equals(ob));//true
		
		
		String o="Testing";
		System.out.println(obj==o);
	}

}
