package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Yourorders {
	WebDriver driver;
	@FindBy(id="a-autoid-1-announce")
    WebElement ordertime;
	
	@FindBy(xpath="(//li[@class='page-tabs__tab'])[1]")
    WebElement buyagain;
	
	@FindBy(xpath="(//li[@class='page-tabs__tab'])[2]")
	WebElement notyetshipped;
	
	@FindBy(xpath="(//li[@class='page-tabs__tab'])[3]")
    WebElement Cancelorder;
	
	public Yourorders(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void orderhistory() {
		
		Select sel=new Select(ordertime);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		buyagain.isDisplayed();
		notyetshipped.isDisplayed();
		Cancelorder.isDisplayed();	
	 driver.navigate().back();
	}
}
