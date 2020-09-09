package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RSS\\Ravi\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\RSS\\Desktop\\abc.txt");   //do not click on it otherwise it will got o windows

	}

}
