package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.className("black")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		
		String ParentWindow = itr.next();
		
		System.out.println("Parent Handle Title:" + ParentWindow );
		
		driver.get("https://freecrm.com/");
		
		String ChildWindow = itr.next();
		System.out.println("Parent Handle Title:" + ChildWindow );
		
		driver.switchTo().window(ChildWindow);
		System.out.println("Child WIndow Title:" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		System.out.println("Parent Window Title:" + driver.getTitle());
		
		Thread.sleep(800000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\RSS\\Ravi\\google.png"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
