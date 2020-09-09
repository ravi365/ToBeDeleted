package ToBeDeleted;

public class MethodOverloading {
	
	int a = 10;
	int b = 20;
	
	public void sum()
	{
		System.out.println(a+b);
	}
	
	public void sum(int i)
	{
		System.out.println(a+b+a);
		System.out.println(i);
	}
	
	public void sum (int i, int j)
	{
		System.out.println(i+j);
	}
    
	public void sum(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void sum(char c)
	{
		System.out.println(c);
	}
	
	public void sum(String st)
	{
		System.out.println(st);
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(30);
		mo.sum(50, 60);
		mo.sum(20, 1000, 3000);
		mo.sum('g');
		mo.sum("gweyifguiwefui");
		main();
		}
	
	public static void main()
	{
		MethodOverloading mo = new MethodOverloading();
		mo.sum("zvcbvxcvznczcnnzmvcnvzxczncv");
	}

}
