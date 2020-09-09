package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		
		String parentwindowID = itr.next();
		System.out.println(parentwindowID);
		
		String childwindowID = itr.next();
		System.out.println(childwindowID);
		
		driver.switchTo().window(childwindowID);
	System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		
	driver.switchTo().window(parentwindowID);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
	
	//driver.switchTo().frame(0);	
		
		


	}

}
