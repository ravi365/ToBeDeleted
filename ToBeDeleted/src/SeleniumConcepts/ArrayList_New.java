package SeleniumConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_New {

	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList();
		ar1.add(12);
		ar1.add(20);
		
		System.out.println(ar1.size());
		
		ar1.add("ETRDTYDTD");
		System.out.println(ar1.get(2));

		for(int i =0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		
		//Generic vs Non-Generic
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("qaz");
		System.out.println(ar2.get(0));
	
		
		
		//Creating EmployeeClassforArrayList Object
		EmployeeClassforArrayList e1 =new EmployeeClassforArrayList("Ravi", 31, "QA", "Accenture");
		EmployeeClassforArrayList e2 =new EmployeeClassforArrayList("Tushar", 29, "Navy", "Bergsian");
		
		ArrayList<EmployeeClassforArrayList> ar3 = new ArrayList<EmployeeClassforArrayList>();
	    ar3.add(e1);
	    ar3.add(e2);
	    
	    
	    
	    Iterator<EmployeeClassforArrayList> itr = ar3.iterator();
	    while (itr.hasNext())
	    {
	    	EmployeeClassforArrayList emp = itr.next();
	    	System.out.println(emp.age);
	    	System.out.println(emp.name);
	    	System.out.println(emp.job);
	    	System.out.println(emp.Employeer);
	    }
	   
	    
	System.out.println("**************************************************");
	ArrayList ar4 = new ArrayList();
	ar4.add(20);
	ar4.add(40);
	ar4.add(60);
	
	ArrayList ar5 = new ArrayList();
	ar5.add(200);
	ar5.add(40);
	ar5.add(600);
	
	ar4.addAll(ar5);
	System.out.println(ar4);
	for (int i = 0; i<ar4.size(); i++)
	{
		System.out.println(ar4.get(i));
	}
	
	ar4.removeAll(ar5);
	for (int i = 0; i<ar4.size(); i++)
	{
		System.out.println(ar4.get(i));
	}
	
System.out.println("************************************************************");
	
	
	for (int i = 0; i<ar5.size(); i++)
	{
		System.out.println(ar5.get(i));
	}
	
	
	
	System.out.println("************************************************************");
	ar4.addAll(ar5);
	ar4.retainAll(ar5);
	for (int i = 0; i<ar4.size(); i++)
	{
		System.out.println(ar4.get(i));
	}
	    
		
		
		
		
		
	}

}
