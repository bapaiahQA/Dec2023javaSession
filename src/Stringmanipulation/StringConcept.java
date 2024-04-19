package Stringmanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " hello this is my java code and i am so happy i am expert";

		System.out.println(str.length());

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("Z"));
		System.out.println(str.indexOf("i", str.indexOf("i") + 1));
		// System.out.println(str.indexOf("i",str.indexOf("i")+1)+1));

		String name = "Test Automation labs";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		String domain = "hello selenium  ";
		String dom = domain.replaceAll("\\s+", "");
		System.out.println(dom);

		String t1 = " your order id is 12345";
		String orderid = t1.replaceAll("\\D+", "");
		System.out.println(orderid);

		String t2 = "your user id is  9090  and  order id is 12345";
		String newstr = t2.replaceAll("\\D+", " ");
		System.out.println(newstr);
	
	
	System.out.println(" XXXXXXXXXXXx");
	
	Pattern pattern =Pattern.compile("\\d+");
	Matcher matcher=pattern.matcher(t2);
	
	
//Arraylist
	while(matcher.find()){
		System.out.println(matcher.group());
	}
	

	
	
	
	
	
	String userID=null;
	String old=null;
	if(matcher.find()) {
	userID=matcher.group();
	System.out.println(userID);
	
	}
	
	
	if(matcher.find()) {
	old=matcher.group();
	System.out.println(old);
	
	}

	System.out.println(userID);
	System.out.println(old);
	
	
	String tr="hello!! this is my value .$123333*";
	
String fvalue=	tr.replaceAll("[^a-zA-Z]", "");
	System.out.println(fvalue);
	
	
	}
}
