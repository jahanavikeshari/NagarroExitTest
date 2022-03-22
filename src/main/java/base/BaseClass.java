package base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumServer;


public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver=null;
	
	static File file = new File("./config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();
	
	//Reading config properties
	static {
		try {
			fis= new FileInputStream(file);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		try {
			prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	public  void setup() {
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName",prop.getProperty("plateform.name"));
		capabilities.setCapability("platformVersion", prop.getProperty("plateform.version"));
		capabilities.setCapability("appPackage" ,prop.getProperty("package.name"));
		capabilities.setCapability("appActivity",prop.getProperty("application.activity"));
		capabilities.setCapability("deviceName",prop.getProperty("device.name"));
		capabilities.setCapability("app", prop.getProperty("application.path"));
		capabilities.setCapability("isHeadless", true);
		
		try {
			driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicit.wait")), TimeUnit.SECONDS);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
	}
	@BeforeSuite
	public void startAppium() {
		AppiumServer.start();
	}
	
	@AfterSuite
	public void stopAppium() {
		AppiumServer.stop();
	}
	

}

