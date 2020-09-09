package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("ravi.rulez999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ravi.rulez999");
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Calendar')]")).click();
		Thread.sleep(3000);
		
		
		//driver.close();
		
		//a[contains(text(), '01')]
		
	String initial_xpath = "//a[contains(text(), '";
	String final_xpath = "')]";
	int today = 12;
	
	
	for (int i = 01; i<=31; i++)
	{
		String xpath = initial_xpath + i + final_xpath;
		String number = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(number);
		if (number.equals(today))
		{
		driver.findElement(By.xpath(xpath)).click();
		
		}
		
	}
	
		
		

	}

}
