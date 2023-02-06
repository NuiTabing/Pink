package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class homepageFunctionalityTest extends commonMethods {
	
	

	
	@BeforeMethod
	public void setUp() {
		getDriver();
	}

	@Test
	public void HomePage_TC001_Login() {
		hp.usernameField.sendKeys(configReader.getProperties("username"));
		hp.passwordField.sendKeys(configReader.getProperties("password"));
		hp.loginButton.click();
		verifyHeader(pd.product,configReader.getProperties("producttext"));
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
}
