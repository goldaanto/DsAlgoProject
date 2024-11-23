package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Arraypageobject;

public class Arraystepdef {
	         WebDriver driver=null;
	         Arraypageobject pageobject=null;
	   	         
	
	  @Given("User is on Array page")
	         public void user_is_on_dsintropage() {
		    driver = Hooks.getDriver();
			driver.get("https://dsportalapp.herokuapp.com/array/");
			pageobject = new Arraypageobject(driver);
			System.out.println("user is on array page");
	         }

	  @When("user clicks on Scroll down button of array page")
	  public void user_clicks_on_scroll_down_button_of_array_page() {
		  System.out.println("page scroll down successfully");
	         }


	  @Then("user is scroll down to the end of the array page")
	  public void user_is_scroll_down_to_the_end_of_the_array_page() {
	    System.out.println("user views the array page");
	}

	
	@When("User clicks on Arrays in Python Link")
	public void user_clicks_on_arrays_in_python_link() {
	    pageobject.arrayinpython();
	}

	@Then("User navigated to Arrays in Python Page")
	public void user_navigated_to_arrays_in_python_page() {
		 System.out.println("user views the array in python page");
	}

	@When("User clicks on Arrays Using List Link")
	public void user_clicks_on_arrays_using_list_link() {
	    pageobject.arrayusinglist();
	}

	@Then("User navigated to Arrays Using List Page")
	public void user_navigated_to_arrays_using_list_page() {
		 System.out.println("user views the array using list page");
	}

	@When("User clicks on Basic Operations in Lists Link")
	public void user_clicks_on_basic_operations_in_lists_link() {
	   pageobject.basicoperations();
	}

	@Then("User navigated to Basic Operations in Lists Page")
	public void user_navigated_to_basic_operations_in_lists_page() {
		 System.out.println("user views the basic operations in list page");
	}

		@When("User clicks on Applications of Array Link")
	public void user_clicks_on_applications_of_array_link() {
	    pageobject.applicationarray();
	}

	@Then("User navigated to Applications of Array Page")
	public void user_navigated_to_applications_of_array_page() {
		 System.out.println("user views the applications of array page");
	}

}
