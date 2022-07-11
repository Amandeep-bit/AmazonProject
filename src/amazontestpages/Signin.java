package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	public Signin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void entervalidemail(String mail) {
		email.sendKeys(mail);
		continuebutton.click();
		
	}

}
