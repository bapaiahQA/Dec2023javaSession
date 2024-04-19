package Stringmanipulation;

public class StringvsStringBuilderVsStringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String tr ="Hello";
		tr.concat("selenium");
		System.out.println(tr); // hello
		

	
		StringBuilder sc = new StringBuilder("test");
		
		sc.append(tr);
	sc.append("test");
	
	System.out.println("StringvsStringBuilderVsStringbuffer.main()");
	System.out.println(sc);
	}

}
