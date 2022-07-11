package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Youraddress {
	
	@FindBy(xpath="(//div[@class='a-box ya-card--rich'])[4]")
	WebElement youraddress;
	
	@FindBy(xpath="//h2[@class='a-color-tertiary']")
    WebElement addaddress;
	
	@FindBy(xpath="(//span[@role='button'])[1]")
	WebElement country;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement phone;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement address;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement unit;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement city;
	
	@FindBy(xpath="(//span[@data-action=\"a-dropdown-button\"])[2]")
	WebElement province;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement postalcode;
	
	@FindBy(xpath="(//span[@class=\"a-size-base\"])[9]")
	WebElement defaultoption;
	
	@FindBy(id="address-ui-widgets-addr-details-gate-code")
	WebElement accesscode;
	
	@FindBy(xpath="(//span[@aria-hidden='true'])[8]")
	WebElement weekend;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement addadress;
	
	public Youraddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterinfoaddwindow(String Name,CharSequence string,String Address,String string2,String City) {
		youraddress.click();
		addaddress.click();
		country.getAttribute("Canada");
		name.sendKeys(Name);
		phone.sendKeys(string);
		address.sendKeys(Address);
		unit.sendKeys( string2);
		city.sendKeys(City);
		Select sel=new Select(province);
		sel.selectByIndex(8);
		defaultoption.isDisplayed();
		accesscode.isEnabled();
		weekend.isEnabled();
		addadress.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
