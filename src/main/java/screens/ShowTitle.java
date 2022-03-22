package screens;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShowTitle extends BaseClass{
	
	public final static Logger logger= Logger.getLogger(ShowTitle.class);  
	public ShowTitle(AppiumDriver<MobileElement> driver) {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	public MobileElement App;
	
	public void AppClick() {
		App.click();
		logger.info("click on App");
	}
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Action Bar\"]")
	public MobileElement ActionBar;
	
	public void ActionBarClick() {
		ActionBar.click();
		logger.info("click on Action Bar");
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Display Options\"]")
	public MobileElement Display;
	
	public void DisplayClick() {
		Display.click();
		logger.info("click on Display");
	}

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"DISPLAY_SHOW_TITLE\"]")
	public MobileElement Title;
	
	public void ShowTitle() {
		Title.click();
		logger.info("click on Show_Title_Display");
		
	}
	
//	public String value() {
//		logger.info("checking title");
//		return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView").getText();
//		
//	}

	
}
