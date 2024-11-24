package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arraypageobject {
	//constructor
		WebDriver driver = null;
		public Arraypageobject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
}

//locators
		
		@FindBy(linkText="Arrays")WebElement dropdown_loc;
		@FindBy(linkText="Arrays in Python")WebElement inpython_loc;	
		@FindBy(linkText="Arrays Using List")WebElement Arraylist_loc;	
		@FindBy(linkText="Basic Operations in Lists")WebElement basicoper_loc;	
		@FindBy(linkText="Applications of Array")WebElement application_loc;	
						
//Action methods
		public  void dropdown()
		{
			dropdown_loc.click();
		}
		public void arrayinpython()
		{
			inpython_loc.click();
		}
		public void arrayusinglist()
		{
			Arraylist_loc.click();
		}
		public void basicoperations()
		{
			basicoper_loc.click();
		}
		public void applicationarray()
		{
			application_loc.click();
		}
		}