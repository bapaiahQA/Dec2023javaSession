package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test");

		
		// try block we can write without cathc if you written the finnaly block
		try {
			int i = 9 / 0;
		}
//		catch (ArithmeticException e) {
//		e.printStackTrace();
	//}
		finally {
			System.out.println("i am finnaly block");
		}	
//		catch (ArithmeticException e) {
//		e.printStackTrace();
//		}
	}

}
