package Abstraction;

public class TestAbstractClass {

	public static void main(String[] args) {
		
		
		//Creating Object reference variable of HDFCBank Class
		HDFCBank hb = new HDFCBank();
		hb.loanBank();
		hb.credit();
		hb.debit();
		hb.customerList();
		
		
		System.out.println("********************************************************************");
		//Using Dynamic Polymorphism - Parent Class object reference can call child Class
		
		Bank b = new HDFCBank();
		b.loanBank();
		b.credit();
		b.debit();
	
		//But Parent class cant access HDFC methods which are local to it. Hence, Bank can't access "customerList" method
		
		System.out.println("********************************************************************");
		
		
		//We cannot create Object Reference of the abstract class. Hence, we cannot create Bank b1 = new Bank();
		
		
		

	}

}
