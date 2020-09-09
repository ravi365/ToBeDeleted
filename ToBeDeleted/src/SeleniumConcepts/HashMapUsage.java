package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HashMapUsage {
	
	static WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		 driver = new ChromeDriver();
		
        driver.get("https://touch.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Ftouch.facebook.com%2F&soft=hjk");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		
		String password = Data.LoginCredentials().get("ValidID");
		String s[] = password.split(":");
		
		driver.findElement(By.id("firstname_input")).sendKeys(s[0]);
		driver.findElement(By.id("lastname_input")).sendKeys(s[1]);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@value, 'Next')]")).click();
	Thread.sleep(3000);
		
		String mth = Data.MonthSelection().get(3);	
	WebElement month = driver.findElement(By.id("month"));
	Select sel = new Select(month);
	
	sel.selectByVisibleText(mth);
	Thread.sleep(3000);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}
	
	
}

