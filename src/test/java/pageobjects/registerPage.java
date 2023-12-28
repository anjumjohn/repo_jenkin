package pageobjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.configReader;
import hooks.baseClassForDriver;
import io.cucumber.datatable.DataTable;
//import pages.String;

public class registerPage {
	public static WebDriver driver=baseClassForDriver.getdriver();
	String registerurl=configReader.getregisterUrl();
	
	//Webelements for register page
	@FindBy (xpath="//input[@id='id_username']") WebElement usrname;
	@FindBy(xpath="//input[@id='id_password1']") WebElement pwd1;
	@FindBy(xpath="//input[@id='id_password2']") WebElement confirmpwd;
	@FindBy(xpath="//input[@value='Register']") WebElement regbtn;
	@FindBy(xpath="//a[text()='Login ']") WebElement login;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement errMsg;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement newAcctMsg;
	
	
	public registerPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void gotoRegPage() {
		driver.get(registerurl);
	}
	
	public void clickRegButton() {
		regbtn.click();
	}
	
	public void errorMessage() {

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		Assert.assertEquals(messageStr, "Please fill out this field.");

	}
	
	public void userNameData(DataTable datatable) {
		List<Map<String, String>> userName=datatable.asMaps(String.class, String.class);
		for(Map<String,String> detail:userName) {
			String uName = detail.get("username");
			usrname.sendKeys(uName);
		}
		
		}
	
	public void pwdData(DataTable datatable) {
		List<Map<String, String>> pwd=datatable.asMaps(String.class, String.class);
		for(Map<String,String> detail:pwd) {
			String pwd2 = detail.get("password");
			pwd1.sendKeys(pwd2);
		}
		
		}
	
	public void confPwdData(DataTable datatable) {
		List<Map<String, String>> conpwd=datatable.asMaps(String.class, String.class);
		for(Map<String,String> detail:conpwd) {
			String conpwd1 = detail.get("confirm password");
			confirmpwd.sendKeys(conpwd1);
		}
		
		}
	
	public String readErrorMsg() {
		String msg=null;
		msg=errMsg.getText();
		return msg;
	}
	
	public String reg_url() {
		String regurl=driver.getCurrentUrl();
		return regurl;
		
	}

	public String getNewAcctMsg() {
		String newacct=null;
		newacct=newAcctMsg.getText();
		return newacct;
	}
	
}
