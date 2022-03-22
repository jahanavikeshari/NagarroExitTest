package screens;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Reversing extends BaseClass {
	public final static Logger logger= Logger.getLogger(Reversing.class);  
	public Reversing(AppiumDriver<MobileElement> driver) {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation;
	
	public void AnimationClick() {
		animation.click();
		logger.info("click on Animation");
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Reversing\"]")
	public MobileElement Reversing;
	
	public void reversingClick() {
		Reversing.click();
		logger.info("click on reversing");
	}

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Play\"]")
	public MobileElement Play;
	
	public void PlayClick() {
		Play.click();
		logger.info("click on Play");
	}

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Reverse\"]")
	public MobileElement Reverse;
	
	public void ReverseClick() {
		Reverse.click();
		logger.info("click on reverse");
	}
	public String value() {
		logger.info("checking title value");
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView").getText();
	}




}
