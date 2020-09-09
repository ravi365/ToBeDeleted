package ToBeDeleted;

public class stringTesting {

	public static void main(String[] args) {
		
		String s = "I love binge watching";
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', 9));
		
		System.out.println(s.indexOf("binge"));
		System.out.println(s.indexOf("hate"));
		System.out.println(s.charAt(9));
		
		String s1 = "I love binge wAtching";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
       System.out.println(s.substring(0, 6));
       
       String s3 = "     Hello World        ";
       System.out.println(s3.trim());
       
       System.out.println(s3.replaceAll(" ", ""));
       
       String date = "01/01/2020";
       System.out.println(date.replace("/", "-"));
       
       String datesplit[] = date.split("/");
       for (int i =0; i<datesplit.length; i++)
       {
    	   System.out.println(datesplit[i]);
       }
       
	}

}
