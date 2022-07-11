package amazontestexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {
	WebDriver driver;
	
	@BeforeClass
	public void OpenApplication() {
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		
		

		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	

}
	@AfterClass
	public void CloseApplication() {
		driver.close();
	}
	

}
