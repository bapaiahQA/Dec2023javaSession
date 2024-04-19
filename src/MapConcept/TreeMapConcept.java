package MapConcept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap < String, String> empdata =new  TreeMap < String, String>();
		empdata.put("Tom", "SDET1");
		empdata.put("Tom", "SDET2");
		//empdata.put(null, bbc);
		empdata.put("bbc", null);
		empdata.put("bapu", "SDET3");
		empdata.put("yes", "SDET4");
		empdata.put("2", "SDET4");
		
		empdata.remove("2", "SDET4");
		empdata.remove("Tom");
		
		System.out.println(empdata);
		
		
		for( Map.Entry< String, String> entry : empdata.entrySet()){
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		
		
		System.out.println("nnnnnn");
		
		
		empdata.forEach((k, v)-> System.out.println(k+":"+v));

	}

}
