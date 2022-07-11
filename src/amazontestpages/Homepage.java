package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{ 
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement AcctList;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[2]")
	WebElement sgnin;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Clickyouracct() {
		
		
		Actions actt=new Actions(driver);
		actt.moveToElement(AcctList).perform();
		//sgnin.click();
		
	}




}
