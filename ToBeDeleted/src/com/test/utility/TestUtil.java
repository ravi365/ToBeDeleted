package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	public static ArrayList<Object[]> GetDataFromExcel()
	{
		
		ArrayList <Object[]> ar = new ArrayList<Object[]>();
	
	Xls_Reader xls = new Xls_Reader("C:\\Users\\RSS\\git\\ToBeDeleted\\ToBeDeleted\\src\\com\\testdata\\EbayTestData.xlsx");
	
   int rowCnt = xls.getRowCount("Sheet1");
   
   for (int i = 2; i <=rowCnt; i++)
   {
	   String firstName = xls.getCellData("Sheet1", "firstName", rowCnt);
	   String lastName = xls.getCellData("Sheet1", "lastName", rowCnt);
	   String emailID = xls.getCellData("Sheet1", "email", rowCnt);
	   
	   
	 //Object obj[] = new Object[];
	 		Object obj[] = {firstName, lastName, emailID};
	 		ar.add(obj); 
   }
	
return ar;
}
}

