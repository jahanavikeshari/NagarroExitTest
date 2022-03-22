package utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServer {
	
	public static AppiumDriverLocalService service;
	
	public static void start() {
		service= AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	
	public static void stop() {
		service.stop();
	}
	
	

}
