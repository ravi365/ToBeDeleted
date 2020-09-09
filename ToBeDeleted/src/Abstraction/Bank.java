package Abstraction;

public abstract class Bank {
	
	//Abstract Classes are used to achieve partial abstraction
	//Abstraction: is a process to hide the implementation logic
	//Abstract classes just like non-abstract classes can have static, non-static, and final variables
	
	int loan_min = 1000;
	static int loan_rate = 10;
	final int loan_term = 5;
	
	//Abstract classes can have both abstract and non-abstract methods
	
	public abstract void loanBank();  //abstract method
	
	public void credit() {
		System.out.println("Credit Amount");
	}
	
	public void debit() {
		System.out.println("Debit Amount");
	}
	

}
