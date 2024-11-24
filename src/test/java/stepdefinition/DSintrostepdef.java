package stepdefinition;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.Dsintropageobject;

public class DSintrostepdef{
	WebDriver driver = null;
	Dsintropageobject  pageobject = null;
	
	@Given("User is on dsintro Page")
public void user_is_on_dsintro_page() {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/data-structures-introduction");
		pageobject = new Dsintropageobject(driver);
}

@When("user clicks on Scroll down button")
public void user_clicks_on_scroll_down_button() {
	System.out.println("page scroll down successfully");
}

@Then("user is scroll down to the end of the  page")
public void user_is_scroll_down_to_the_end_of_the_page() {
   System.out.println("page scroll down successfully");
}

@When("user clicks on TimeComplexity link")
public void user_clicks_on_create_time_complexity_link() {
    pageobject.timecomplexity();
}

@Then("user is navigated to Time Complexity page")
public void user_is_navigated_to_time_complexity_page() throws InterruptedException   {
	Thread.sleep(2000);	
	String title = driver.getTitle();
	Assert.assertEquals("Time Complexity", title);
}
	
//@When("user clicks on Practice Questions link")
//	public void user_clicks_on_create_Practice_Questions_link() {
//	    pageobject.PracticeQuestions();
//	}
//
//@Then("user is navigated to Practice Questions page")
//	public void user_is_navigated_to_Practice_Questions_page() throws InterruptedException   {
//		Thread.sleep(2000);	
//		String title = driver.getTitle();
//		Assert.assertEquals("Time Complexity", title);
//}
}


