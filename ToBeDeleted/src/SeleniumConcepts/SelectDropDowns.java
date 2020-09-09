package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {

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
		
		//Select sel = new Select(month);
		//sel.selectByVisibleText("Mar");
		
		String dob = "Apr-10-2020";
		String dobArr[] = dob.split("-");
		
		
		SelectMethod(month, dobArr[0]);
		SelectMethod(day, dobArr[1]);
		SelectMethod(year, dobArr[2]);
		
	}

	public static void SelectMethod(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(value); 
	}
}
