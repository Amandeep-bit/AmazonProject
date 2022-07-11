package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchfacility {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="(//div[@aria-label='t shirts for women'])[1]")
	WebElement opt1;
	
	@FindBy(xpath="(//div[@aria-label='t shirts for women'])[2]")
	WebElement opt2;
	
	@FindBy(xpath="(//div[@aria-label='t shirts for men cotton'])[1]")
	WebElement opt3;
	
    @FindBy(xpath="(//div[@aria-label='t shirts for women'])[1]")
    WebElement opt;
    
    @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
    WebElement image;
    
    @FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    WebElement name;
	
    @FindBy(xpath="//div[@class='a-row a-size-small']")
    WebElement rating;
    
   
    
    @FindBy(xpath="//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")
	WebElement next;
	public Searchfacility(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Searchproducts(String a) {
		search.sendKeys(a);
		opt1.isDisplayed();
		opt2.isDisplayed();
		opt3.isDisplayed();
		opt.click();
		image.isDisplayed();
		name.isDisplayed();
	    rating.isDisplayed();
		next.isEnabled();
		
		
		
	}
	
	
	

}
