package stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginpageobject;

public class loginstepdef{
	WebDriver driver = null;
	loginpageobject  pageobject = null;


	@Given("I go to the login page")
	public void i_go_to_the_login_page() {
		driver = Hooks.getDriver();
	    driver.get("https://dsportalapp.herokuapp.com/login");
	    pageobject = new loginpageobject(driver);
		//pageobject.signin();
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		pageobject.setUsername("goldaanto@gmail.com");
		pageobject.setPassword("golda@123");
		}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		pageobject.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user logged in successfully");
	}

}
