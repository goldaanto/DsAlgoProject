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
	
	@FindBy(xpath="/html/body/div[1]/nav/div/div[1]/div")WebElement dropdown_loc;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/a")WebElement DSgetstarted_loc;
	
	
//Action methods
	
	public void dropdown()
	{
		dropdown_loc.click();
	}
	public void DSgetstarted()
	{
		DSgetstarted_loc.click();
	}
	

}