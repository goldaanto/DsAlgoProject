package stepdefinition;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.welcomepageobject;

public class welcomestepdef{
	WebDriver driver = null;
	welcomepageobject  pageobject = null;


	@Given("the users launch the daslago welcome page")
	public void the_users_launch_the_daslago_welcome_page() {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		pageobject = new welcomepageobject(driver);
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}

	@When("user clicks the getstarted button")
	public void user_clicks_the_getstarted_button() {
		pageobject.getstarted();
	}

	@Then("user will view the Home page")
	public void user_will_view_the_home_page() {
		System.out.println("user views the home page");
	}
}
