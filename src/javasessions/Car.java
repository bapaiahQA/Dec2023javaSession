package javasessions;

public class Car {
	
String name;
String licenseNumber;// Non Static variabes
double  price;
String color;
final static int wheels =4;//static Variables





public static void main ( String [] args) {
	Car c1= new Car();
	
	c1.color="Red";
	c1.licenseNumber="1221";
	c1.price=80.11;
	c1.name="bmw";
	
	
	
	System.out.println(c1.color+" "+c1.licenseNumber+ " "+c1.name+" "+c1.price+" "+wheels);
	
Car c2= new Car();
	
	c2.color="yello";
	c2.licenseNumber="1210";
	c2.price=90.11;
	c2.name="YM";
	
	
	
	
Car c3= new Car();
	
	c3.color="blue";
	c3.licenseNumber="10";
	c3.price=99.11d;
	c3.name="YM";
	
	
	System.out.println(c1.color+" "+c1.licenseNumber+ " "+c1.name+" "+c1.price+" "+wheels);
	System.out.println(c2.color+" "+c2.licenseNumber+ " "+c2.name+" "+c2.price+" "+wheels);
	System.out.println(c2.color+" "+c2.licenseNumber+ " "+c2.name+" "+c2.price+" "+Car.wheels);
	
	
	
	
}
}
