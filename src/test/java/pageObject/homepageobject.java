package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class homepageobject{
//constructor
	WebDriver driver = null;
	public homepageobject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//locators
	
	//@FindBy(xpath="/html/body/div[1]/nav/div/div[1]/div")WebElement dropdown_loc;
	@FindBy(linkText="Get Started")WebElement Arraygetstarted_loc;
	
	
//Action methods
	
//	public  void dropdown()
//	{
//		dropdown_loc.click();
//	}
	public void Arraygetstarted()
	{
		Arraygetstarted_loc.click();
	}
	

}