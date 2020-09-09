package ToBeDeleted;

public class TestingFunctions {
	
	public void sum()
	{
		System.out.println("Sum Method without Return Type");
	}
	
	public int sum(int j)
	{
		System.out.println("Sum Method with Return Type");
		int i = 10;
		int k = i + j;
		return k;
	}

	public static void main(String[] args) {
		TestingFunctions tf = new TestingFunctions();
		
		// Printing O/p of Sum Method without return type
		tf.sum();
		
		//Printing O/P of Sum Method with return type
		//tf.sum(50);
		
		//Printing O/P of Sum Method with return type
		int l = tf.sum(500);
		System.out.println(l);

	}

}
