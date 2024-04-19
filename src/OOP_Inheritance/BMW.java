package OOP_Inheritance;

	public class BMW extends Car{
		//method overrridden  :: Moly polymarphism ( Run time or dynamic polymarphism)
		//when you same have same method name in parent & child class
		//same number of parameters and type of parameters and seqence also
		@Override
		public void start() {
			System.out.println("BMW ==start");
		}
		
		public void stop (String name) {
			System.out.println("bbc");
		}
		
public void autoparking() {
		System.out.println("BMW-- car");
	}
	}

