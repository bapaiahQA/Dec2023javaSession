package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class hashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//k, v pair
		// Non Order based programm
		
		
		HashMap<String, Integer>  empMap = new  HashMap<String, Integer>();
		
		
		empMap.put("TOM", 101);
		//empMap.put("TOM", 201);
		empMap.put("lisa", 201);
		
		System.out.println(empMap.size());
		
		System.out.println(empMap.get("TOM"));
		empMap.put("lisa", 300);
		System.out.println(empMap.get("lisa"));
		
		
		
		
		
		HashMap < String, String> empdata =new  HashMap < String, String>();
		empdata.put("Tom", "SDET1");
		empdata.put("Tom", "SDET2");
		empdata.put("bbc", null);
		empdata.put(null, "SDET3");
		empdata.put(null, "SDET4");
		empdata.put(null, null);
	//System.out.println(empdata.get("bbc"));
	//	System.out.println(empdata.get("test"));
		
	System.out.println(empdata.get(empdata));
	
	System.out.println(empdata);
	
	
	
for( Map.Entry< String, String> entry : empdata.entrySet()){
	System.out.println(entry.getKey()+ ":"+entry.getValue());
}
	System.out.println("CCCC");
	
	
	
	
}
	}


