package screens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.ExcelReader;

public class MessageScreens extends BaseClass{
	
//	ExcelReader reader = new ExcelReader("./src/test/resources/Automation.xlsx");
//	String SheetName= "message";

	public final static Logger logger= Logger.getLogger(MessageScreens.class);
		public MessageScreens(AppiumDriver<MobileElement> driver) {
//			PageFactory.initElements(driver, this);
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			BaseClass.driver = driver;
		}
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"OS\"]")
		public MobileElement OS;
		
		public void OSClick() {
			
			OS.click();
			logger.info("click on OS");
		}
		@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"SMS Messaging\"]")
		public MobileElement SMS;
		
		public void SMSClick() {
			SMS.click();
			logger.info("click on SMS");
		}
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.EditText")
		
		public MobileElement recipent;
		
		public void RecipentClick() {
			recipent.click();
			ExcelReader reader = new ExcelReader("./src/test/resources/Automation.xlsx");
			String SheetName= "message";
			String Data1=reader.getCellData(SheetName,0,2);
			 recipent.sendKeys(Data1);
			 
			logger.info("enter the recipent value");
			 
		}
		@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.EditText")
		public MobileElement message;
		
		public void messageClick() {
			ExcelReader reader = new ExcelReader("./src/test/resources/Automation.xlsx");
			String SheetName= "message";
			String Data2=reader.getCellData(SheetName,1,2);
			 message.sendKeys(Data2);
			 
			logger.info("enter the message");
			
		}
		@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Send\"]")
		public MobileElement Send;
		
		public void SendClick() {
			Send.click();
			logger.info("click on Send button");
		}
		
		public String value() {
			logger.info("click checking");
			return driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView").getText();
			
		}
		
		
}
	
