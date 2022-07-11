package amazontestpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Soppingcart {
	WebDriver driver;
	@FindBy(xpath="(//div[@id='addToCart_feature_div'])[1]")
	WebElement addtoc;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-dropdown']")
	WebElement quantity;

	@FindBy(xpath="(//div[@id='addToCart_feature_div'])[1]")
	WebElement addtocart;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="//div[@data-index='19']")
	WebElement tulips;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchh;
	
	@FindBy(id="nav-search-submit-button")
	WebElement clicksearch;
	
	@FindBy(xpath="//div[@data-index='4']")
	WebElement shirtimage;
	
	@FindBy(xpath="(//div[@id='addToCart_feature_div'])[1]")
	WebElement addshirt;
	
	@FindBy(xpath="//a[@class='a-button-text']")
	WebElement gotocart;
	
	public Soppingcart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addtoshoppingcart(String flow,String shirt) {
		addtoc.click();
		Select sel =new Select(quantity);
		sel.selectByIndex(3);
		driver.navigate().back();
		driver.navigate().back();
		addtocart.click();
		search.sendKeys(flow);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", tulips);
		tulips.click();
		addtocart.click();
		driver.navigate().back();
		driver.navigate().back();
		searchh.sendKeys(shirt);
		clicksearch.click();
		shirtimage.click();
		addshirt.click();
		gotocart.click();

		
	}

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

