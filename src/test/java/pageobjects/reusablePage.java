package pageobjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.baseClassForDriver;
import utilities.configReader;
import utilities.ElementsUtils;

public class reusablePage {
	
	public static WebDriver driver = baseClassForDriver.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	
	String tryEditorURL=configReader.tryEditorURL();
	

	@FindBy(xpath = "//a[text()='Try here>>>']") //try editor button
	WebElement tryHere;

	@FindBy(xpath = "//*[@class=' CodeMirror-line ']") //try editor input
	WebElement editorInput; 

	@FindBy(xpath = "//button[text()='Run']") //run button
	WebElement run;

	@FindBy(xpath = "//pre[@id='output']") //try editor output
	WebElement output;
	
	public reusablePage() {

		PageFactory.initElements(driver, this);
	}
	public void click_Tryhere() {
		//Loggerload.info("click on " + string1 + " button on " + string2);
		tryHere.click();
	}

	public void navigateTotryEditor() {
		driver.get(tryEditorURL);
		
	}
	
	public void runClick() {
		run.click();
	}
	
	public void enterPythonCode(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetName, rowNum);
		eleUtil.enterCode(code, editorInput);
		
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getErrorMessage() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
		
	}
	public String getActualResult() {
		eleUtil.waitForElement(output);
		return output.getText();
	}
	
	public void reusableMethod(String string) {

		String page_name = string.replaceAll("\\s+", "");
		String urlName = configReader.geturl(page_name);
		driver.get(urlName);
	}
}

