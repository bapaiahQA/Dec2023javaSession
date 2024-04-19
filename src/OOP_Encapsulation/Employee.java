package OOP_Encapsulation;

public class Employee {

	String name;
	int age;

	double salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// private int rank;

	public String getName() {
		System.out.println(name);
		return this.name;
	
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
}

public Employee() {
	
	
}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("bbc", 12, 10.0);
		e1.name = "raju";
		System.out.println(e1.name);
		// e1.rank =90;
		// System.out.println(e1.rank);

	}

}
