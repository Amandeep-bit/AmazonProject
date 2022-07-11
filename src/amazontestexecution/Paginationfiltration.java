package amazontestexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Paginationfiltration {

	@FindBy(xpath="//i[@class='a-icon a-icon-dropdown']")
	WebElement sort;
	
	
	
	public Paginationfiltration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void filter() {
		sort.click();
		Select sel =new Select(sort);
		sel.selectByIndex(1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
