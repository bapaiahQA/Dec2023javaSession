package ExceptionHandling;

public class FinallyBlockquestion {
	
	
	
	
	public static int getmarks( String studentName) {
		
		
		
		if (studentName.equals("rahul")) {
			
			try {
			int i=9/0;
			return 80;
			}
			catch ( Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("finally block");
				return 100;
			}
			//return 90;
			
		}else if (studentName.equals("bbc")){
			return 95;
		}else {
			System.out.println(" pls pass the right student");
			return -1;
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = getmarks("rahul");
		System.out.println(m);
	}

}
