package com.datadriventest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class TDDTestingusingTestNG {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		 driver = new ChromeDriver(); //We are creating an Object "new ChromeDriver" for the Object reference varaible "Driver" for the Interface "WebDriver"
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.get("http://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fb%2FBooks%2F267%2Fbn_1854946");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
	ArrayList<Object[]> testData = TestUtil.GetDataFromExcel(); //We can directly call the method from the Class bcz both are Static, otherwise we have to create Object of the Class
	return testData.iterator();   //iterator will iterate values in a proper sequence
	}
	
	
	@Test(dataProvider = "getTestData")
	public void FbPageReg(String firstName, String lastName, String emailID) {
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstName);
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastName);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(emailID);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
