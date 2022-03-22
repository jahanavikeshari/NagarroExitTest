package stepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.AddButtons;

public class AddButtonsStepDefinitions extends BaseClass{
	AddButtons add;
//	@Given("^User is on API Demos starting page\\.$")
//	public void user_is_on_API_Demos_starting_page() throws Throwable {
//	    setup();
//	}

//	@When("^The user will click on Animation\\.$")
//	public void the_user_will_clicks_on_Animation() throws Throwable {
//		AddButtons add= new AddButtons(driver);
//		add.AnimationClick();
//		}
	

	@When("^The user will click on Layout Animation\\.$")
	public void the_user_will_clicks_on_Layout_Animation() throws Throwable {
		add= new AddButtons(driver);
		add.LayoutClick();
	}

	@Then("^User will click on ADD BUTTON\\.$")
	public void user_will_clicks_on_ADD_BUTTON() throws Throwable {
		add.Addbutton();
	}

	@Then("^User will able to add button\\.$")
	public void user_will_able_to_add_button() throws Throwable {
		String check = add.Title();
		Assert.assertEquals("Animation/Layout Animations", check);
		System.out.println("Done");
		
		
	}

}
