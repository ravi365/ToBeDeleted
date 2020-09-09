
public class Finally {

	public static void main(String[] args) {
	
test();
	}

	
		
	public static void test()
	{
		try {
			//int i =10;
			//sint j = i/0;
			System.out.println("Enter Try method");
		} catch(ArithmeticException e)
		{
			System.out.println("Enter Catch Method");
		}
		
		finally
		{
			System.out.println("Enter finally block");
		}
	}
	
	

}
