package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import hook.HookPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.TryEditorPageObject;

public class TryEditorPageStep {
	
	WebDriver driver = null;
	TryEditorPageObject pageEle = null;
	@Given("User is on the Try Editor Page")
	public void user_is_on_the_try_editor_page() {
		driver = HookPages.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		pageEle = new TryEditorPageObject(driver);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}

	@When("User enters the Python statement in the editor")
	public void user_enters_the_python_statement_in_the_editor() {
		pageEle.setTextAreaValue();
	   
	}

	@When("User clicks on Run button")
	public void user_clicks_on_run_button() {
		pageEle.clickRun();
	}

	@Then("Statement will be executed and Result shown")
	public void statement_will_be_executed_and_result_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Popup Window displayed with error msg")
	public void popup_window_displayed_with_error_msg() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
