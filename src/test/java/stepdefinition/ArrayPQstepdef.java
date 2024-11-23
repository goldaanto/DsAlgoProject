package stepdefinition;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ArrayPQpageobject;
import util.ExcelReader;


public class ArrayPQstepdef {
	WebDriver driver=null;
    ArrayPQpageobject pageobject=null;
    ExcelReader xcelRead = null;
    ArrayList<Object> dataList = null;
	ArrayList<Object> data=null;
	
	@Given("User is on practice questions page")
	public void user_is_on_practice_questions_page() throws IOException {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/array/practice");
		pageobject = new ArrayPQpageobject(driver);
		System.out.println("user is on array practice question page");
	}

	@When("User clicks on Search the array Link")
	public void user_clicks_on_search_the_array_link() {
	    pageobject.searcharray();
	}

	@Then("User navigated to Search the array Page")
	public void user_navigated_to_search_the_array_page() {
		System.out.println("user is on Search the array page");
	}
	
	@Given("User is on Search the array Link")
	public void user_is_on_search_the_array_link() throws IOException {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/question/1");
		pageobject = new ArrayPQpageobject(driver);
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\testdata\\Arraydata.xlsx");
	    System.out.println(" user is on the practice question 1 page");
	}

	@When("User gives the input from {string} and {int}")
	public void user_gives_the_input_from_and(String string, Integer int1) {
		System.out.println("enter python code"+string);
		System.out.println("enter python code"+xcelRead);
		dataList = xcelRead.getData(string);
		System.out.println("read the excel sheet"+dataList.size());
		
		data =  (ArrayList) dataList.get(int1);
		System.out.println("read the excel row "+data.size());
		
		
		String statement = (String) data.get(0);
		pageobject.sendcode(statement);
		
		System.out.println("read the excel cell"+statement);
	}

	@Then("User clicks the Run button and submit button")
	public void user_clicks_the_run_button_and_submit_button() {
		pageobject.runbutton();
	    System.out.println("click run button");
	    System.out.println("click submit button");
	    pageobject.runbutton();
	}


	@When("User clicks on Max Consecutive Ones Link")
	public void user_clicks_on_max_consecutive_ones_link() {
	   pageobject.max();
	}

	@Then("User navigated to Max Consecutive Ones Page")
	public void user_navigated_to_max_consecutive_ones_page() {
		System.out.println("user is on Max Consecutive Ones page");
	}
	
	@Given("User is on Max Consecutive Ones Link")
	public void user_is_on_max_consecutive_ones_link() throws IOException {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/question/2");
		pageobject = new ArrayPQpageobject(driver);
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\testdata\\Arraydata.xlsx");
	    System.out.println(" user is on the practice question 2 page");
	}

	@When("User clicks on Find Numbers with Even Number of Digits Link")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_link() {
	    pageobject.even();
	}

	@Then("User navigated to Find Numbers with Even Number of Digits Page")
	public void user_navigated_to_find_numbers_with_even_number_of_digits_page() {
		System.out.println("user is on Find Numbers with Even Number of Digits Page");
	}
	
	@Given("User is on Find Numbers with Even Number of Digits Link")
	public void user_is_on_find_numbers_with_even_number_of_digits_link() throws IOException {
		driver = Hooks.getDriver();
		driver.get("https://dsportalapp.herokuapp.com/question/3");
		pageobject = new ArrayPQpageobject(driver);
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\testdata\\Arraydata.xlsx");
	    System.out.println(" user is on the practice question 3 page");
	}


	@When("User clicks on Squares of  a Sorted Array Link")
	public void user_clicks_on_squares_of_a_sorted_array_link() {
	    pageobject.squares();
	}

	@Then("User navigated to Squares of  a Sorted Array Page")
	public void user_navigated_to_squares_of_a_sorted_array_page() {
		System.out.println("user is on squares of sorted array page");
	}



}
