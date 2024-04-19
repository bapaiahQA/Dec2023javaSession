package javasessions;

public class Customer {
	String name;
	int age;
	String citty;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Customer	c1	=new Customer();
c1.age=20;
c1.citty="hyd";
c1.name="bapu";

System.out.println(c1.name+" "+c1.age+ " "+c1.citty);


Customer	c2	=new Customer();
c2.age=20;
c2.citty="hyd";

System.out.println(c2.age+ " "+c1.citty);

c1=c2;
System.out.println("c=c2");
System.out.println(c1.name+" "+c1.age+ " "+c1.citty);
System.out.println(c2.age+ " "+c2.citty);

Customer	c3	=new Customer();
c3.age=21;
c3.citty="ViZ";
c3.name="new";
c2=c3;
System.out.println(c1.name+" "+c1.age+ " "+c1.citty);
System.out.println(c2.age+ " "+c2.citty);
System.out.println(c3.age+ " "+c3.citty);

Customer	c4	=new Customer();
c4.age=5;
c4.citty="c4c";
c4.name="c4";
c3=c1;   ///c i p[ointing to c2 so c3 will use c2 values



System.out.println("c3==c4");
System.out.println(c1.name+" "+c1.age+ " "+c1.citty);//55
System.out.println(c2.age+ " "+c2.citty);//5

System.out.println(c3.age+ " "+c3.citty);//20

System.out.println(c4.age+ " "+c4.citty);


	}

}
