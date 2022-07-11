package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordpage {
	
	@FindBy(id="ap_password")
	WebElement pasword;
	
	//@FindBy(name="rememberMe")
	//WebElement keepin;
	
	@FindBy(id="signInSubmit")
	WebElement Sign;
	
	public Passwordpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Enterpassword(String pass) {
		
		pasword.sendKeys(pass);
		//keepin.click();
		Sign.click();
	}

}
