package stepDefinitions;


import org.testng.Assert;

import base.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import screens.MessageScreens;

public class MessageStepDefinitions extends BaseClass {
	
	@When("^The User click on OS$")
	public void the_User_click_on_OS() throws Throwable {
		MessageScreens add= new MessageScreens(driver);
		add.OSClick();  
	}

	@When("^The user click on SMS Messaging$")
	public void the_user_click_on_SMS_Messaging() throws Throwable {
		MessageScreens add= new MessageScreens(driver);
		add.SMSClick();
	}
	@When("^the user enter phone and Messages$")
	public void the_user_enter_phone_and_Messages() throws Throwable {
	//@When("^the user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	//public void the_user_enter_and() throws Throwable {
		MessageScreens add= new MessageScreens(driver);
		
		add.RecipentClick();
		add.messageClick();
		Thread.sleep(500);
	}

	@When("^click Send$")
	public void click_Send() throws Throwable {
		MessageScreens add= new MessageScreens(driver);
		add.SendClick();
		Thread.sleep(500);
	}

	@Then("^the messgae will send to recipent\\.$")
	public void the_messgae_will_send_to_recipent() throws Throwable {
		MessageScreens add= new MessageScreens(driver);
		String check = add.value();
		Assert.assertEquals("Message sent!", check);
		System.out.println("Done");
	}


}
