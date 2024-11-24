package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class welcomepageobject{
//constructor
	WebDriver driver = null;
	public welcomepageobject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//locators
	@FindBy(xpath="/html/body/div[1]/div/div/a/button")WebElement getstarted_loc;
	
//Action methods
	public void getstarted()
	{
		getstarted_loc.click();
	}
	

}