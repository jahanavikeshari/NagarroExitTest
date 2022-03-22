package screens;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import base.BaseClass;

public class AddButtons extends BaseClass {
	
	public final static Logger logger= Logger.getLogger(AddButtons.class);  
	public AddButtons(AppiumDriver<MobileElement> driver) {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		BaseClass.driver = driver;
		
	}
	
/*	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation;
	
	public void AnimationClick() {
		animation.click();
	}*/
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Layout Animations\"]")
	public MobileElement Layout;
	
	public void LayoutClick() {
		Layout.click();
		logger.info("click on Animation");
	}
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Add Button\"]")
	public MobileElement AddButton;
	
	public void Addbutton() {
		AddButton.click();
		logger.info("click on Add Button");
	}
	

	
	public String Title() {
		logger.info("click on checking");
		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView").getText();
		
	}
	
	

}
