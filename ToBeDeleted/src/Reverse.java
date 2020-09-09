
public class Reverse {

	public static void main(String[] args) {

		String s = "Selenium";
		
		
		//Method1: Using For Loop 
		int i = s.length();
		String rev = "";
		
		for (i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
	}
	
	//Method 2: Use StringBuffer Class from Java
	
StringBuffer sf = new StringBuffer(s);



	

}
