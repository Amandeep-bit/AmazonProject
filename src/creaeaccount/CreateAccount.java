package creaeaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateAccount {

	public static void main(String[] args) {
	
		System.setProperty("wedriver.chrome.driver", "Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
        WebElement AccountLists =driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(driver);
        action.moveToElement(AccountLists).build().perform();
        driver.findElement(By.linkText("Start here.")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("amandeep");
        driver.findElement(By.id("ap_email")).sendKeys("amandeepkaurr91@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("111111");
        driver.findElement(By.id("ap_password_check")).sendKeys("111111");
        driver.findElement(By.id("continue")).click();
	}

}
