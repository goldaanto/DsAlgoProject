package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ArrayPQpageobject {

	//constructor
			WebDriver driver = null;
			public ArrayPQpageobject(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
	}

	//locators
			
			@FindBy(linkText="Search the array")WebElement searcharray_loc;
			@FindBy(css="#answer_form > div > div > div.CodeMirror-scroll")WebElement codearea_loc;
			@FindBy(css="#answer_form > button") WebElement run_loc;
			@FindBy(xpath = "#answer_form > input.button")WebElement submit_loc;
			@FindBy(linkText="Max Consecutive Ones")WebElement max_loc;	
			@FindBy(linkText="Find Numbers with Even Number of Digits")WebElement even_loc;	
			@FindBy(xpath="/html/body/div[5]/a")WebElement squares_loc;	
			
							
	//Action methods
			public  void searcharray()
			{
				searcharray_loc.click();
			}
			
			public  void sendcode(String Code)
			{
				codearea_loc.sendKeys(Code);
				WebElement codeMirror_loc= driver.findElement(By.className("CodeMirror"));
				WebElement codeLine = codeMirror_loc.findElements(By.className("CodeMirror-line")).get(0);
				codeLine.click();
				WebElement txtArea = codeMirror_loc.findElement(By.cssSelector("textarea"));
				txtArea.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
				txtArea.sendKeys(Code);
				
			}
			
			public void runbutton()
			{
				run_loc.click();
				
			}
			public void submitbutton()
			{
				submit_loc.click();
			}
			public void max()
			{
				max_loc.click();
			}
			public void even()
			{
				even_loc.click();
			}
			public void squares()
			{
				squares_loc.click();
			}
			

}
