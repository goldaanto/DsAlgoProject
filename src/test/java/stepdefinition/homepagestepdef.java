package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
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

//	@When("the user clicks on the Data Structure Dropdown icon")
//	public void the_user_clicks_on_the_data_structure_dropdown_icon() {
//		pageobject.dropdown();
//	}
//
//	@Then("User will view six different types of data structures lists")
//	public void user_will_view_six_different_types_of_data_structures_lists() {
//		System.out.println("user sees six different types of lists in dropdown");
//	}

//	
//	@Given("User is in the home page")
//	public void user_is_in_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user clicks the Get Started button")
	public void user_clicks_the_get_started_button() {
		System.out.println("aaaaaaaaaaaaaaaa");
    pageobject.Arraygetstarted();
	}

	//@SuppressWarnings("deprecation")
	
	@Then("user receives a error message")
	
	public void user_receives_a_error_message() {
		//expected error text
	      String exp = "You are not logged in";
	      //identify actual error message
	      WebElement m = driver.findElement(By.xpath("/html/body/div[2]"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      //verify error message with Assertion
	      Assert.assertEquals(exp, act);
	      //driver.quit();
	}

}
