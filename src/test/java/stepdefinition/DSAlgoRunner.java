package stepdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
	

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin for extent adapter
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//plugin for default report
		//plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:}
		features= {"src/test/resources/Features/"}, glue={"stepdefinition","stepdefinition"})
public class DSAlgoRunner {
	
}
