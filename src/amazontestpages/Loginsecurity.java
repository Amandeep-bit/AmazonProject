package amazontestpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginsecurity {
WebDriver driver;
	      @FindBy(xpath="(//div[@class='a-box ya-card--rich'])[2]")
	      WebElement loginsec;
	      
	      @FindBy(id="a-autoid-0")
	      WebElement Name;
	      
	      @FindBy(id="a-autoid-1")
	      WebElement email;
	      
	      
	      public Loginsecurity( WebDriver driver) {
	    	  PageFactory.initElements(driver, this);
	      }
	    	  public void EditableElements() {
	    		  loginsec.click();
	    		  Name.isEnabled();
	    		  email.isEnabled();
	    		  driver.navigate().back();
	    	  }
	    	  
	      }
	
	
	
	
	
	
	
	

