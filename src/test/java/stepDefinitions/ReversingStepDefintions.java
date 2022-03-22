package stepDefinitions;

import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.HideShowScreens;
import screens.Reversing;

public class ReversingStepDefintions extends BaseClass{

//	@Given("^User is on API Demos starting page\\.$")
//	public void user_is_on_API_Demos_starting_page() throws Throwable {
//	 setup();
//	}

//	@When("^The user will click on Animation\\.$")
//	public void the_user_will_click_on_Animation() throws Throwable {
//		Reversing add= new Reversing(driver);
//		add.AnimationClick();
//	}

	@When("^The user will click Reversing\\.$")
	public void the_user_will_click_Reversing() throws Throwable {
		Reversing add= new Reversing(driver);
		add.reversingClick();
	}

	@When("^User will select on Play ball starts moving in downwards direction\\.$")
	public void user_will_select_on_Play() throws Throwable {
		Reversing add= new Reversing(driver);
		add.PlayClick();
		Thread.sleep(1000);
	}

	

	@When("^User will click on Reverse\\.$")
	public void user_will_click_on_Reverse() throws Throwable {
		Reversing add= new Reversing(driver);
		add.ReverseClick();
	}

	@Then("^ball will go to its initial position\\.$")
	public void ball_will_go_to_its_initial_position() throws Throwable {
		Reversing add= new Reversing(driver);
		String check = add.value();
		Assert.assertEquals("Animation/Reversing", check);
		System.out.println("Done");
	}


}
