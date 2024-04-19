package MapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It maintaions the insertion order
		//It won't be the index order
		
		//HASh map maintains the random order
		//
		LinkedHashMap < String, String> empdata =new  LinkedHashMap < String, String>();
		empdata.put("Tom", "SDET1");
		empdata.put("Tom", "SDET2");
		empdata.put(null, null);
		empdata.put("bbc", null);
		empdata.put("bapu", "SDET3");
		empdata.put("yes", "SDET4");
		
		
		System.out.println(empdata);
	}

}
