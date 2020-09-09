package ToBeDeleted;

public class Test123 {
	
	public void sum()
	{
		int a = 10;
		System.out.println("20"+a);
	}
	
	public void multiple()
	{
		String b = "30";
		System.out.println(b + 40);
		Integer.parseInt(b);
		System.out.println(Integer.parseInt(b)+40);
	}
	
	public void sub()
	{
		int c = 50;
		int d = 60;
		String e = "70";
		int f = 80;
		int g = 90;
		System.out.println(c+d+e+f+g);
	}

	
	public void div() {
		int h = 100;
		boolean i = true;
		System.out.println(h + "i");
		String s = "200";
		String.valueOf(h);
		System.out.println(s + String.valueOf(h));
		System.out.println(s + h);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Test123 test = new Test123();
		test.sum();
		test.multiple();
		test.sub();
		test.div();
	}

}
