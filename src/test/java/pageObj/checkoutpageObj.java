package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class checkoutpageObj {
	
	public checkoutpageObj() {
		PageFactory.initElements(driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[@class = 'title']")
	public WebElement checkoutInfoTxt;
	
	@FindBy (id = "first-name")
	public WebElement firstnameField;
	
	@FindBy (id = "last-name")
	public WebElement lastnameField;
	
	@FindBy (id = "postal-code")
	public WebElement zipcodeField;
	
	@FindBy (id = "continue")
	public WebElement continueBtn;
	
	@FindBy (id = "cancel")
	public WebElement cancelBtn;

}
