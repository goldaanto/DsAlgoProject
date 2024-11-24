package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stackpageobject {
	
	//constructor
			WebDriver driver = null;
			public Stackpageobject(WebDriver driver) {		
				this.driver = driver;
				PageFactory.initElements(driver, this);
	}

	//locators
			
			@FindBy(linkText="Operations in Stack")WebElement operations_loc;	
			@FindBy(linkText="Implementation")WebElement Implementation_loc;	
			@FindBy(linkText="Applications")WebElement Applications_loc;	
			
							
	//Action methods
			public  void operationsinstack()
			{
				operations_loc.click();
			}
			public void Implementation()
			{
				Implementation_loc.click();
			}
			public void Applications()
			{
				Applications_loc.click();
			}
			}

