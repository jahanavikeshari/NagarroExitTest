package stepDefinitions;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.AddButtons;
import screens.HideShowScreens;

public class HideShowStepDefinitions extends BaseClass{
	@Given("^User is on API Demos starting page\\.$")
	public void user_is_on_API_Demos_starting_page() throws Throwable {
	   setup();
	}

	@When("^The user will click on Animation\\.$")
	public void the_user_will_click_on_Animation() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		add.AnimationClick();
	}

	@When("^The user will click Hide-ShowAimations\\.$")
	public void the_user_will_click_Hide_ShowAimations() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		add.HideShowClick();
	}

	@When("^User will select on Hide\\(Gone\\)checkbox\\.$")
	public void user_will_select_on_Hide_Gone_checkbox() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		add.HideClick();
	}

	@When("^User will click on all four buttons and the buttons get hide\\.$")
	public void user_will_click_on_all_four_buttons() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		add.ButtonClick();
	}

	
	

	@When("^The User will click on Show buttons to show all the hidden buttons \\.$")
	public void user_will_able_to_show_all_the_hidden_buttons() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		add.ShowButtonClick();
	}

	

	@Then("^All the Hidden buttons will show\\.$")
	public void all_the_Hidden_buttons_will_show() throws Throwable {
		HideShowScreens add= new HideShowScreens(driver);
		boolean check = add.ShowButtonClick();
		Assert.assertEquals(true, check);
		System.out.println("Done");
	}



}
