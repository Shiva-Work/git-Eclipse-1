package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Student> n1=new Hashtable<>();
		n1.put(21,new Student("R111","Raghupathi","HYD","TS") );
		n1.put(23,new Student("R222","rajaram","HYD","TS") );
		n1.put(21,new Student("R333","seetharam","HYD","TS") );
		n1.put(22,new Student("R444","janakiram","HYD","TS") );
		
		for(Integer i:n1.keySet())
		System.out.println(i);
		
		for(Student s:n1.values())
			System.out.println(s);
		
	//	System.out.println(n1.);
		System.out.println(n1.get(22).hashCode());
		System.out.println(n1.get(23).hashCode());
			

	}

}
