package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPageObject;

public class LoginPageStep {


	WebDriver driver = null;
	LoginPageObject  pageObject = null;

	@Given("I go to the login page")
	public void i_go_to_the_login_page() {
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		pageObject = new LoginPageObject(driver);
		pageObject.setUsername("goldaanto@gmail.com");
		pageObject.setPassword("golda@123");
		Thread.sleep(2000);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		pageObject.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		if(pageObject.checkInHomePage())
		{
			Thread.sleep(2000);			
			//driver.close();
		}
	}
	


	





}
