package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW b =new BMW();
b.autoparking();
b.fuel();
b.start();
b.stop();
b.engine();//Inheriated

System.out.println("---------------");
Car c = new Car();
c.fuel();
c.start();
c.stop();
c.engine();//Inheriated
	
System.out.println("{{{{{{{{{{");

Audi a= new Audi();
a.engine();
a.fuel();
a.price();
a.start();
a.stop();


	}

}
