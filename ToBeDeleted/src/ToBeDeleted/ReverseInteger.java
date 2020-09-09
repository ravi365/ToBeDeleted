package ToBeDeleted;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 123456789;
		int revnum = 0;
		
		
		while (num != 0)
			
		{
			 revnum = revnum * 10 + num % 10;  //5;
			  //revnum = 0 *10 + 12345%10 = 5;
			 //revnum = 5*10 + 1234%10 = 50 + 4 = 54;
			 //revnum = 54*10 + 123%10 = 543;
			//revnum = 543*10 + 12%10 = 5432;
			 //revnum = 5432*10 + 1%10 = 543;
			 num = num / 10;
			 
			  
		}
		
		System.out.println(revnum);
		System.out.println("hwfiuehfi");

	}

}

//5
//54
//543
//5432
//54321

//Method 2: StringBuffer


