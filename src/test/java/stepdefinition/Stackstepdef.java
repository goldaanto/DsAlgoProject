package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Stackpageobject;

public class Stackstepdef {
	 WebDriver driver=null;
     Stackpageobject pageobject=null;
     
	@Given("User is on Stack page")
	public void user_is_on_stack_page() {
		 driver = Hooks.getDriver();
			driver.get("https://dsportalapp.herokuapp.com/stack/");
			pageobject = new Stackpageobject(driver);
			System.out.println("user is on stack page");
	}

	@When("user clicks on Scroll down button of Stack page")
	public void user_clicks_on_scroll_down_button_of_stack_page() {
		System.out.println("page scroll down successfully");
	}

	@Then("user is scroll down to the end of the Stack page")
	public void user_is_scroll_down_to_the_end_of_the_stack_page() {
		System.out.println("user views the stack page");
	}

	@When("User clicks on Operations in Stack Link")
	public void user_clicks_on_operations_in_stack_link() {
	    pageobject.operationsinstack();
	}

	@Then("User navigated to Operations in Stack Page")
	public void user_navigated_to_operations_in_stack_page() {
		System.out.println("user views the operations in stack page");
	}

	@When("User clicks on Implementation Link")
	public void user_clicks_on_implementation_link() {
	    pageobject.Implementation();
	}

	@Then("User navigated to Implementation Page")
	public void user_navigated_to_implementation_page() {
		System.out.println("user views the implementation page");
	}

	@When("User clicks on Applications Link")
	public void user_clicks_on_applications_link() {
	    pageobject.Applications();
	}

	@Then("User navigated to Applications Page")
	public void user_navigated_to_applications_page() {
		System.out.println("user views the operations in applications page");
	}

}
