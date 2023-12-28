package hooks;

import utilities.LoggerLoad;
import utilities.configReader;

//import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class hooksForDS {

		private static baseClassForDriver bs;
		static Scenario scenario;
		private static WebDriver driver;

		@BeforeAll
		public static void before() throws Throwable {
			//Get browser Type from config properties file
			LoggerLoad.info("Loading Config file");
			configReader.configload();
			String browser = configReader.getBrowserType();
			
			//Initialize driver from base class	
			bs = new baseClassForDriver();
			bs.initDriver(browser);
			LoggerLoad.info("Initializing driver for : "+browser);
		}
		@Before
		public void scenario(Scenario scenario) {
			LoggerLoad.info("===============================================================================================");
			LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
			LoggerLoad.info("-----------------------------------------------------------------------------------------------");
			
		}
		@AfterStep
		public void afterstep(Scenario scenario) {
			if (scenario.isFailed()) {
				LoggerLoad.error("Steps Failed , Taking Screenshot");
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "My screenshot");
				Allure.addAttachment("Myscreenshot",new String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
			}
		}

		@AfterAll
		public static void after() {
			LoggerLoad.info("Closing Driver");
			bs.closeallDriver();
		}
}
