package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i[] = {10,20,30,40,50};
		System.out.println(i[0]);
		System.out.println(i.length);
		//System.out.println(i.size());
		//System.out.println(i[i.length]);
		System.out.println(i[i.length-1]);
		
		char ch [] = {'a','e','i','o','u'};
		System.out.println(ch);
		System.out.println(ch[0]);
		System.out.println(ch.length);
		//System.out.println((String)ch);
		
		
		for (int k=0; k<ch.length;k++) {
			System.out.print(k);
			//System.out.println(ch[k]);
			System.out.println(ch);
		}
	
		
		
		String product[] = {"macbook", "imac", "canon"};
		System.out.println(product);
		System.out.println(product.length);
		System.out.println(Arrays.toString(product));
		
		
		
		Object data[] = {"Nalu", "30", "12.44", false};
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		}
	}
	


