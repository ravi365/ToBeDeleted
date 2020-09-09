package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(@class, 'multiselect-selected-text')]")).click();
		
		
		//Method 1: Using For Loop
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container dropdown-menu')]//li//a//label"));
		System.out.println(list.size());
		
		for (int i =0; i<list.size(); i++)
			
		{
			System.out.println(list.get(i).getText());
			//if (list.get(i).getText().equals("Angular"))
			//{
			
			//Boolean bl = list.get(i).isSelected();
			if (!list.get(i).isSelected())
			{
				list.get(i).click();
				//break;
			//}
		}
		
		Thread.sleep(5000);
		//driver.close();
		
		//Method2: Using Customised Xpath
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(@class, 'multiselect-selected-text')]")).click();
		
			driver.findElement(By.xpath("//ul[contains(@class, 'multiselect-container dropdown-menu')]//li//a//label//input[contains(@value, 'Angular')]")).click();
		
		
		Thread.sleep(5000);
		driver.close();

	}
	}
}
