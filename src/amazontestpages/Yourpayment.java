package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Yourpayment {
	
	@FindBy(xpath="(//div[@class='a-box ya-card--rich'])[5]")
	WebElement yourpayment;

	@FindBy(xpath="(//input[@type='submit'])[2]')")
	WebElement paymentmethod;
	
	@FindBy(xpath="pp-wDzOiI-23")
	WebElement addcard;
	
	@FindBy(id="pp-gxrhfJ-15")
	WebElement cardnum;
	
	@FindBy(id="pp-gxrhfJ-17")
	WebElement Name;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-dropdown'])[1]")
	WebElement expirydate;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-dropdown'])[2]")
	WebElement expiryyear;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement addcardbutton;
	
	public Yourpayment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Payment(String Charsequence,String name) {
		yourpayment.click();
		paymentmethod.click();
		addcard.click();
		cardnum.sendKeys(Charsequence);
		Name.sendKeys(name);
		Select sel=new Select(expirydate);
		sel.selectByIndex(4);
		Select sel1=new Select(expiryyear);
		sel1.selectByIndex(2);
		addcardbutton.click();
	}
	
	
	
	
	
	
	
}
