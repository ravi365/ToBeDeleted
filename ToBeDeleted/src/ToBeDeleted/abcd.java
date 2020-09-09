package ToBeDeleted;

public class abcd {
	
	int a = 10;
	static int b = 20;
	
	
	public void sum1()
	{
		int a = 30;
		System.out.println(a);
		System.out.println(a+b);
		sum2();
	}
	
	public static  void sum2()
	{
		System.out.println(b+b);

	}
	
	public int addition()
	{
		int x = 30000;
		int y = 50000;
		int z = x+y;
		
		return z;
	}

	public static void main(String[] args) {
		
	 abcd sm = new abcd();
	 sm.sum1();
	 sum2();
	 abcd.sum2();
	 System.out.println("********************************************************88");
	 sm.sum2();
	 System.out.println("********************************************************88");
	 int b= 600;
	 System.out.println(b);
	 //System.out.println(abcd.b);
	 
	 
	 System.out.println(b);
	 
	System.out.println(sm.a);
	 
    //int add = sm.addition();
    //System.out.println(add);
    
	int add = sm.addition();
    System.out.println(add);
	}

}
