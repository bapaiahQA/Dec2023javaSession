package OOP_Encapsulation;

public class Emptest {
	
	public static void main(String[] args) {
	Employee e1 = new  Employee("nani", 12, 110.0);
	System.out.println(e1.age);
	e1.setName("bapu");
	e1.setName("raghu");
	e1.getName();
	
	Employee e2 = new  Employee("il", 2, 110);
	System.out.println(e2.age+" "+e2.name+" "+e2.salary);
	e2.getAge();
	e2.setAge(9);
	e2.getAge();
	e2.setSalary(100.0);
	e2.getSalary();
	System.out.println(e2.getAge() +" "+e2.getSalary());
	
	Browser br = new Browser();

	br.launchBrowser();
}
}