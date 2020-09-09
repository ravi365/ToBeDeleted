package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://touch.facebook.com/reg/?cid=103&refsrc=https%3A%2F%2Ftouch.facebook.com%2F&soft=hjk");
		
		driver.findElement(By.id("firstname_input")).sendKeys("qwe");
		driver.findElement(By.id("lastname_input")).sendKeys("tgy");
		driver.findElement(By.xpath("//button[contains(@value, 'Next')]")).click();
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		SelectMethod(month);
		
		

	}
	public static void SelectMethod(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> ll = sel.getOptions();
		
		System.out.println(ll.size());
		for (int i =0 ; i<ll.size(); i++)
		{
			System.out.println(ll.get(i).getText());
		}
	}

}
