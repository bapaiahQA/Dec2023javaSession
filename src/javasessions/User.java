package javasessions;

public class User {

	// TODO Auto-generated method stub

	// class is a category -- blueprint --class-- prototype
	// instance ==object
	// human -- class--properties : nmae , eyes, address, nose, height
	// laptop -- class: name, size, color, price

	// class variables or data members
	String name;
	int age;
	String telephone;
	double salary;
	boolean isactive;

	public static void main(String[] args) {
		
		//Create the objcet of the class : using new keyword
		
		User u1= new User();
		//user == class
		//u1=object reference		
		//newuser();=object
		u1.age=30;
		u1.isactive=true;
		u1.name="bapu";
		u1.salary=12.33;
		u1.telephone="9160977435";
		System.out.println(u1.name);
		System.out.println(u1);
		
		User u2 = new User();
		u2.age=12;
		u2.name="bbc";
		System.out.println(u2.salary);
		
		
		new User();
		System.out.println(new User().name);
		

	}

}
