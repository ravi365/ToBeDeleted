package SeleniumConcepts;

import java.util.HashMap;

public class Data {


	public static HashMap<String, String> LoginCredentials()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("ValidID", "ravi.rulez999@gmail.com:ravi.rulez999@gmail.com");
		hm.put("InvalidID", "abc:xyz");
		
		return hm;
		
	}
	
	public static HashMap<Integer, String> MonthSelection()
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "Jan");
		hm1.put(2, "Feb");
		hm1.put(3, "Mar");
		hm1.put(4, "April");
		hm1.put(5, "May");
		
		return hm1;
	}
}
