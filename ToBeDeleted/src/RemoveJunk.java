
public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "#%$#%#$^$# 12314414 liberal$%#^%^%$&$^&";
		
//Valid Values = [0-9a-zA-Z]
		
		String st = s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(st);
		

	}

}
