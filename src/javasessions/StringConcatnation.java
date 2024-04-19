package javasessions;

public class StringConcatnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello world";
String s1="100";
String s2="a";
String x="hello";
String y="Selenium";int a=100;
int b=200;
System.out.println(a+b);//300
System.out.println(x+y);//helloseelnium
System.out.println(x+a);//hello100
System.out.println(a+b+x);//300hello
System.out.println(a+b+x+y);//300helloselenium
System.out.println(x+y+(a+b));//helloselenim300
System.out.println(a+b+x+y+a+b);//300helloselenium100200
	System.out.println(s1+s2);//100a
	double d1=12.33;
	double d2=23.44;
	System.out.println(x+y+d1+d2);//helloselenium12.3323.44
	System.out.println(x+y+(d1+d2));//helloselenium35.77
	System.out.println(a+b+d1+d2+x+y+a+b);//335.77helloselenium12.3323.44
	char c='a';
	String t="hello";
	System.out.println(t+c+'b');//helloab
	System.out.println('a'+'b'+t);//195hello a+b ASCII values
	System.out.println('a'+'b'+100+t);//295hello
	
	int p=100;
	int q=200;
	System.out.println("the value of p is"+p);//the value of p is 100
	System.out.println("the value of q is " +q);//the value of q is 200 ;
	System.out.println("the sum of p& q is :"+ p+q);//100200
	System.out.println("the sum of P7 Q is "+ (p+q));//300
	
	System.out.println('0'+'a'+'A'+"hello");//0=48 a=97 A=65 210hello
System.out.println("hello"+'o'+'a'+'A');//hellooaA
System.out.println(1*1*10+"Hello");//10Hello
System.out.println(1*1*10/2+"Hello");
			
	}
	

}
