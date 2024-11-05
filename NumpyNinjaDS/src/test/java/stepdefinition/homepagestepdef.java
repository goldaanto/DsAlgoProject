package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homepageobject;

public class homepagestepdef{
	WebDriver driver = null;
	homepageobject  pageobject = null;

	@Given("the user is in the Home page")
	public void the_user_is_in_the_home_page(){
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		pageobject = new homepageobject(driver);
		System.out.println("user is in the homepage");
	}

	@When("the user clicks on the Data Structure Dropdown icon")
	public void the_user_clicks_on_the_data_structure_dropdown_icon() {
		pageobject.dropdown();
	}

	@Then("User will view six different types of data structures lists")
	public void user_will_view_six_different_types_of_data_structures_lists() {
		System.out.println("user sees six different types of lists in dropdown");
	}

//	
//	@Given("User is in the home page")
//	public void user_is_in_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
    pageobject.DSgetstarted();
	}

	@Then("user receives a error message")
	public void user_receives_a_error_message() {
		System.out.println("You are not logged in "); 
	}

}
