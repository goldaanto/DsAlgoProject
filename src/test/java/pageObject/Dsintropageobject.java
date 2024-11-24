package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Dsintropageobject{
//constructor
	WebDriver driver = null;
	public Dsintropageobject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//locators
	@FindBy(linkText="Time Complexity")WebElement timecomplexity_loc;
//	@FindBy(linkText="Practice Questions")WebElement PracticeQuestions_loc;
	
//Action methods
	
	public void timecomplexity()
	{
		timecomplexity_loc.click();
	}
	
//	public void PracticeQuestions()
//	{
//		PracticeQuestions_loc.click();
//	}
}