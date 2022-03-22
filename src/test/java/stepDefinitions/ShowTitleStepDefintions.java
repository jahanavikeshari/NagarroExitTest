package stepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.Reversing;
import screens.ShowTitle;

public class ShowTitleStepDefintions extends BaseClass  {
	
//	@Given("^User is on API Demos starting page\\.$")
//	public void user_is_on_API_Demos_starting_page() throws Throwable {
//		setup();
//	}

	@When("^The user will click on App\\.$")
	public void the_user_will_click_on_App() throws Throwable {
		ShowTitle add= new ShowTitle(driver);
		add.AppClick();
	   
	}

	@When("^The user will click Action Bar\\.$")
	public void the_user_will_click_Action_Bar() throws Throwable {
		ShowTitle add= new ShowTitle(driver);
		add.ActionBarClick();
	   
	}

	@When("^User will select on Display Options\\.$")
	public void user_will_select_on_Display_Options() throws Throwable {
		ShowTitle add= new ShowTitle(driver);
		add.DisplayClick();
	   
	}

	@Then("^User will click on all DISPLAY_SHOW_TITLE\\.$")
	public void user_will_click_on_all_DISPLAY_SHOW_TITLE() throws Throwable {
		ShowTitle add= new ShowTitle(driver);
		add.ShowTitle();
	     
	}

	



}
