package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utils.AppiumServer;


@CucumberOptions(
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		features= {"./src/test/java/features"},
		glue={"stepDefinitions","hooks"},
			
		//tags= {"@hide","@show","@add","@reverse","@title","@message"}
		tags= {"@tags"}
		
		)
public class AddButtonRunner extends AbstractTestNGCucumberTests{
	
	
	}

