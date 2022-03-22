package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.AppiumServer;



public class Hooks {
	
	
	@Before
	public static void start(){

		AppiumServer.start();
		}
@After	
public static void stop() {
	
	AppiumServer.stop();
}
}
