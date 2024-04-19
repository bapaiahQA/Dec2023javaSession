package javasessions;

public class Timecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TC: code optimization is consider based on perfomance
//BIG 0 ---> 0
		int i = 10;
		System.out.println(i);
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.println(x + "_" + y);
			}
		}

		// x= 1+n+n
		// y=1+n+n+n (1+2n) (1+3n)= 1+3n+2n+6n^2=1+5n+6n^2=n)n(5+6n) ==6n^2==0(n^2)

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				for(int z = 1; z <= 5; z++) {
					System.out.println(x + "_" + y+""+z);
				}//1+n+n
				//1+n+n
				//1+n+n+n
				//(1+2n)(1+2n) (1+3n)
				//(1+2n+6n2))(1+2n)
				//1+2n+2n+4n^2+6n2+12n3
				//4n+10n^2+12n3
				//n(4+10n+12n^2)
				//10n2+12n3
				//n2(10+12n)
				//12n3 //0n^3
				
				
			}

		}

	}
}