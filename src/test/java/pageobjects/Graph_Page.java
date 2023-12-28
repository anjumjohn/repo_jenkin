package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.baseClassForDriver;
import utilities.configReader;
import utilities.LoggerLoad;
//import utilities.ElementsUtils;

public class Graph_Page {

	
	public static WebDriver driver = baseClassForDriver.getdriver();
	//ElementsUtils eleUtil = new ElementsUtils();
	
	String URL=configReader.getApplicationUrl();
	String homepage = configReader.getHomePage();
	
	@FindBy(xpath="//a[@class='list-group-item'][@href='graph']")WebElement graphGpage;
	
	@FindBy(xpath="//a[@href='graph-representations']")WebElement graphrepresentationpage;

	@FindBy(xpath = "//a[text()='Practice Questions']")WebElement practiceQuestions;

	
	public Graph_Page() {

		PageFactory.initElements(driver, this);
	}
	
	public String getGraphPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void navigateToHomePage() {
		driver.get(homepage);
		LoggerLoad.info("user is in home page");
	}
	
	public void navigateTo(String pagename) {
		String urlName = configReader.geturl(pagename);
		driver.get(urlName);
	}

	public void clickOnGraphLink() {
		graphGpage.click();
		LoggerLoad.info("User clicked on Graph link");
	}
	
	public void clickOnGraphRepresentationsLink() {
		graphrepresentationpage.click();
		LoggerLoad.info("User clicked on Graph Representations link");
	}
	
	public void clickOnGraphPracQuesLink() {
		practiceQuestions.click();
	}
	
}
