package SeleniumConcepts;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.HashMap;


public class DuplicateElements {

	public static void main(String[] args) {
		
		String Languages[] = {"Java", "Python", "JS", "Cobol", "Java", "JS"};
		
//Using HashSet
		
		HashSet<String> hs = new HashSet<String>();
		for(String lang: Languages)
		{
			if(hs.add(lang)==false)
			{
				System.out.println("Duplicate value: " +lang);
			}
		}
	
	

	
//Using HashMap
	
	HashMap<String, Integer> hm = new HashMap<String, Integer> ();
	
	for(String name: Languages) {
     Integer count = hm.get(name);
     //System.out.println(count);
     
     if(count ==null)
     {
    	 hm.put(name, 1);
    	 //System.out.println(hm);
     }
     else
     {
    	 hm.put(name, ++count);
     }
    System.out.println(hm);
	}
	
	for(Entry<String, Integer> m : hm.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println("Duplicate value: " + m.getKey());
		}
	}
	
	
		
}
}
