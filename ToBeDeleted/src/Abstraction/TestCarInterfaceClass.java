package Abstraction;

public class TestCarInterfaceClass {

	public static void main(String[] args) {
		
		//Create Object Reference of the BMW cLass

		BMW b = new BMW();
		b.car_make();
		b.car_model();
		b.car_year();
		b.car_price();
		
		System.out.println("********************************************************");
		//Using Dynamic Polymorphism/Topdown approach - Parent Class object reference can call child Class
		Car c = new BMW();
		c.car_make();
		c.car_model();
		c.car_year();
		//We can't call car_price method using Object refrenece of Parent class
		
		
		System.out.println("********************************************************");
		
		//We cannot create Object Reference of Interface
		
		
		// Car c1= new Car(); is not possible
		
		
		
	}

}
