package ToBeDeleted;

public class ObjectsAndClass {
	
	String st;
	int i;
	
public static class car
{
		
		String make;
		int model;
		
	public static void main(String[] args) {
		ObjectsAndClass onc = new ObjectsAndClass();
		onc.i = 20;
		onc.st = "qwerty";
		System.out.println(onc.i);
		System.out.println(onc.st);
		
		
		car a = new car();
		car b = new car();
		car c = new car();
		
		a.make = "Ford";
		a.model = 2020;
		b.make = "Chevy";
		b.model = 2021;
		c.make = "GMC";
		c.model = 2020;
		
		System.out.println(a.make);
		System.out.println(a.model);
		System.out.println(b.make);
		System.out.println(b.model);
		System.out.println(c.make);
		System.out.println(c.model);
		
		
		System.out.println("*******************************************************************************************");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.make);
		System.out.println(a.model);
		System.out.println(b.make);
		System.out.println(b.model);
		System.out.println(c.make);
		System.out.println(c.model);		
		
		
	
	
	}
	} 
}




