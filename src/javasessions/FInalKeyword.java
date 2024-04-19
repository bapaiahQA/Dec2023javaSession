package javasessions;

public class FInalKeyword {

	
	final int bum=20; //calss variable
	
	public static void main ( String[] args) {
		final int i=10; //local variable
		
		System.out.println(i);
		FInalKeyword obj = new FInalKeyword();
		System.out.println(obj.bum);
		
		//Constant variables
		final int DAYS_IN_WEEK=7;
		int salary =100*DAYS_IN_WEEK;
		System.out.println(salary);
		
	}
}
