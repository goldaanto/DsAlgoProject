package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageobject.RegisterPageObject;

public class RegisterPageStep {
	
	WebDriver driver = null;
	RegisterPageObject  pageObject = null;
	
	@Given("I go to the Registration page")
	public void i_go_to_the_registration_page() throws InterruptedException {
		driver = new ChromeDriver();
		pageObject = new RegisterPageObject(driver);
		driver.get("https://dsportalapp.herokuapp.com/register");
		Thread.sleep(2000);
	}

	
	
	@When("user enters the username, password and confirm password")
	public void user_enters_the_username_password_and_confirm_password() throws InterruptedException {
		pageObject.setUserName("goldaanto@yahoo.co.in");
		pageObject.setPassword1("Golda@123");
		pageObject.setPassword2("Golda@123");
		Thread.sleep(2000);
	}
	
	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
		WebElement submitele = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
		submitele.submit();
	}
	
	@Then("user  navigated to the home page")
	public void user_navigated_to_the_home_page() {
		driver.close();
	   driver.quit();
	}

}
