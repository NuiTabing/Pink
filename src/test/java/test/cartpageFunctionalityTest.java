package test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.commonMethods;
import utilities.configReader;

public class cartpageFunctionalityTest extends commonMethods{
	
	homepageFunctionalityTest hpf = new homepageFunctionalityTest();
	productpageFunctionalityTest pdf = new productpageFunctionalityTest();
	
	@BeforeMethod
	public void setUp() {
		getDriver();
	}
	
	@Test
	public void CartPage_TC001_checkItemsAndRemove() {
		pdf.productPage_TC002_addToCart();
		Assert.assertTrue(cp.backpackTxt.isDisplayed());
		Assert.assertTrue(cp.bikeLightTxt.isDisplayed());
		Assert.assertTrue(cp.jacketTxt.isDisplayed());
		Assert.assertTrue(cp.tshirtTxt.isDisplayed());
		Assert.assertTrue(cp.onesieTxt.isDisplayed());
		Assert.assertTrue(cp.redtshirtTxt.isDisplayed());
		click(cp.removeOnesieBtn);
		System.out.println("num of items are: "+cp.shoppingcartIcon.getText());
		Assert.assertEquals(cp.shoppingcartIcon.getText(), configReader.getProperties("numOfItemsIncart"));
		click(cp.checkoutBtn);
		Assert.assertEquals(cop.checkoutInfoTxt.getText(), configReader.getProperties("checkoutInfoText"));
		//System.out.println(cop.checkoutInfoTxt.getText());
	}

}
