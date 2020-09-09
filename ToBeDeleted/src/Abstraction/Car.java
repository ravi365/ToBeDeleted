package Abstraction;

public interface Car {
	
	//Interface is used to achieve full Abstraction
	//Variables declared in Interface are final and static by nature. We don't have to specify it
	
	int car_wheels = 4;  //this method is static and final in nature
	
	//We cannot create non-abstract Methods. all the methods created in Interface are abstract by nature
	
	public void car_make();
	public void car_model();
	public void car_year();
	
	

}
