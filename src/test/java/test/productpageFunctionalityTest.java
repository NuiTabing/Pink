package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import utilities.commonMethods;
import utilities.configReader;

public class productpageFunctionalityTest extends commonMethods {
	
	homepageFunctionalityTest hpf = new homepageFunctionalityTest();
	
	@BeforeMethod
	public void setUp() {
		getDriver();
	}

	@Test
	public void productPage_TC001_productLists() {
		hpf.HomePage_TC001_Login();
		Assert.assertTrue(pd.backpack.isDisplayed());
		Assert.assertTrue(pd.bikeLight.isDisplayed());
		Assert.assertTrue(pd.jacket.isDisplayed());
		Assert.assertTrue(pd.Tshirt.isDisplayed());
		Assert.assertTrue(pd.onesie.isDisplayed());
		Assert.assertTrue(pd.redTshirt.isDisplayed());
		verifyHeader(pd.backpack, configReader.getProperties("backpackTxt"));
		verifyHeader(pd.bikeLight, configReader.getProperties("bikeLightTxt"));
		verifyHeader(pd.jacket, configReader.getProperties("jacketTxt"));
		verifyHeader(pd.Tshirt, configReader.getProperties("tShirtTxt"));
		verifyHeader(pd.onesie, configReader.getProperties("onesieTxt"));
		verifyHeader(pd.redTshirt, configReader.getProperties("redTshirtTxt"));
		getDriver().navigate().back();
	}
	
	@Test
	public void productPage_TC002_addToCart() {
		hpf.HomePage_TC001_Login();
		pd.atcBackpack.click();
		pd.atcBikeLight.click();
		pd.atcJacket.click();
		pd.atcTshirt.click();
		pd.atcOnesie.click();
		pd.atcRedTshirt.click();
		pd.shoppingCartLink.click();
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}

}
