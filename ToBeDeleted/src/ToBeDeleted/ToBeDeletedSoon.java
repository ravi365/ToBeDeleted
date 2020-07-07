package ToBeDeleted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToBeDeletedSoon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //We are creating an Object "new ChromeDriver" for the Object reference varaible "Driver" for the Interface "WebDriver"
		
		driver.get("https://ui.freecrm.com/");
		driver.findElement(By.name("email")).sendKeys("ravi.rulez999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ravi.rulez999");
		Thread.sleep(3000);
		

		driver.close();
		System.out.println("a");
	}

}
