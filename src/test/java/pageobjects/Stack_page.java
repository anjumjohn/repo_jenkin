package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.baseClassForDriver;
import utilities.ElementsUtils;
import utilities.LoggerLoad;
import utilities.configReader;

public class Stack_page {
	
	public static WebDriver driver = baseClassForDriver.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	
	String URL=configReader.getApplicationUrl();
	String homepage = configReader.getHomePage();

	@FindBy(xpath = "//a[@href='stack']")WebElement getstart_stack;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(@href, '/stack')]")WebElement dropdown_stack;
	
	@FindBy(xpath = "//a[@href='operations-in-stack']")WebElement operationsInStackLink;
	
	@FindBy(xpath = "//a[@href=\"implementation\"]")WebElement implementationLink;
	
	@FindBy(xpath = "//a[@href='stack-applications']")WebElement applicationLink;
	
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement practiceQuestionLink;

		public  Stack_page() {
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnGetStartInStackPage() {
			System.out.println(dropdown_stack);
			System.out.println(driver);
			getstart_stack.click();
		}
		
		public void clickOnOperationsInstackpage() {
			 operationsInStackLink.click();
		}
			
		public void ClickimplementationLink(){
			implementationLink.click();
		}	
		
		public void ClickApplicationLink(){
			applicationLink.click();
		}	
		
		public void ClickPracticeQuestionLink(){
			practiceQuestionLink.click();
		}
		
		public String getStackPageTitle() {
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
}