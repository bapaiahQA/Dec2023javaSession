package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the Object of Arraylist
		
//		ArrayList Ar = new ArrayList(); 
//		Ar.add(100);
//		Ar.add(200);
//		System.out.println(Ar.size());//2
//		Ar.add(300);
//		Ar.add(400);
//		Ar.add(-100);
//		System.out.println(Ar.size());//5
//		System.out.println(Ar.getLast());//-100
//		Ar.remove(3);
//		System.out.println(Ar);
//		System.out.println(Ar.addAll(0, Ar));
//		System.out.println(Ar.add("bapu"));
//		Ar.add("bapu123");
//		System.out.println(Ar);
//		System.out.println(Ar.equals(100));
//		
//		
//		ArrayList <Integer> marklist = new ArrayList<Integer>();
//		marklist.add(100);
//		marklist.add(200);
//		marklist.add(1, null);
//		marklist.add(null);
//		System.out.println(marklist.size());
//		System.out.println(marklist);
//		
//		
//		ArrayList<Object> empdatalist= new ArrayList<Object>();
//		empdatalist.add("bapu");
//		empdatalist.add(1, null);
//		empdatalist.add(true);
//		empdatalist.addLast("id");
//		
//		System.out.println(empdatalist);
		
		
		
		ArrayList <String> mklist = new ArrayList<String>();
		mklist.add("raju");
		mklist.add("yes");
		mklist.add(1, null);
		mklist.add(null);
		mklist.add("bapu");
		mklist.add(2, null);
		mklist.add("nan");
		mklist.addLast("id");
		System.out.println(mklist.size());
		System.out.println(mklist);
		System.out.println(mklist.getLast());
		System.out.println(mklist.get(1));
		
		
		for (int i=0; i<=mklist.size()-1; i++)
			System.out.println(mklist.get(i));
		
		
		System.out.println("00000000000");
		
		for (String e:mklist)
		{
			System.out.println(e);
		}

	}

}
