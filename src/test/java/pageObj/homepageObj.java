package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class homepageObj {
	
	public homepageObj() {
		PageFactory.initElements(driver.getDriver(), this);
	}
	
	@FindBy (id = "user-name")
	public WebElement usernameField; 
	
	@FindBy (id = "password")
	public WebElement passwordField;
	
	@FindBy (id = "login-button")
	public WebElement loginButton;

}
