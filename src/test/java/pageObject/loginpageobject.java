package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpageobject{
//constructor
	WebDriver driver = null;
	public loginpageobject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//locators
	//@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")WebElement signin_loc;
	@FindBy(name="username")WebElement username_loc;
	@FindBy(name="password") WebElement password_loc;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]" ) WebElement login_loc;
	
//Action methods
//	public void signin()
//	{
//		signin_loc.click();
//	}
	public void setUsername(String username)
	{
		username_loc.sendKeys(username);
		
	}
	
	public void setPassword(String password)
	{
		password_loc.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login_loc.click();
	}

	

}