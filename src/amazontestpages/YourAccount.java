package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccount {
	WebDriver driver;
	@FindBy(xpath="//div[@class='nav-line-1-container']")
	WebElement AcctList;
	
	@FindBy(xpath=" //*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement YouAcct;
	
	@FindBy(xpath="(//div[@class='a-column a-span9 a-span-last'])[1]")
	WebElement yourorder; 
	
	public YourAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickyouraccount() {
		Actions act=new Actions(driver);
		act.moveToElement(AcctList).build().perform();
		YouAcct.click();
		yourorder.click();
		
		
	}

}
