package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditorPageObject {
	
	WebDriver driver = null;
	//constructor
	
	public TryEditorPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locator
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/div") WebElement txtArea_loc;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button") WebElement button_loc;
	
	//Action
	
	public void setTextAreaValue()
	{
		String param = "Print("+"NumpyNinja"+")";
		txtArea_loc.sendKeys("Print");
	}
	
	public void clickRun()
	{
		button_loc.click();
	}
}
