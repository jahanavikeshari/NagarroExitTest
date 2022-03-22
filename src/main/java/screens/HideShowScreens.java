package screens;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HideShowScreens extends BaseClass {
	
	public final static Logger logger= Logger.getLogger(HideShowScreens.class);  
	public HideShowScreens(AppiumDriver<MobileElement> driver) {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		BaseClass.driver = driver;
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
	public MobileElement animation;
	
	public void AnimationClick() {
		
		animation.click();
		logger.info("click on AnimationClick");
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Hide-Show Animations\"]")
	public MobileElement hideshow;
	
	public void HideShowClick() {
		
		hideshow.click();
		logger.info("click on Hide Show");
	}
	@AndroidFindBy(xpath="//android.widget.CheckBox[@content-desc=\"Hide (GONE)\"]")
	public MobileElement hide;
	
	public void HideClick() {
		
		hide.click();
		logger.info("click on Hide Click");
	}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public MobileElement button;
	
	public void ButtonClick() {
		
		for(int i=0;i<=3;i++) {
		button.click();
		logger.info("click on All four Buttons");
	
	}
		
}
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Show Buttons\"]")
	public MobileElement ShowButton;
	
	public boolean ShowButtonClick() {
		logger.info("click checking");
		ShowButton.click();
		return true;
		
	}
	
	

}
