package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class cartpageObj {
	
	public cartpageObj() {
		PageFactory.initElements(driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[@class='title']")
	public WebElement yourcartTxt;
	
	@FindBy (xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
	public WebElement removeBackpackBtn;
	
	@FindBy (xpath = "//*[@id=\"remove-sauce-labs-bike-light\"]")
	public WebElement removeBikeLightBtn;
	
	@FindBy (xpath = "//*[@id=\"remove-sauce-labs-fleece-jacket\"]")
	public WebElement removeJacketBtn;
	
	@FindBy (xpath = "//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")
	public WebElement removeTshirtBtn;
	
	@FindBy (xpath = "//*[@id=\"remove-sauce-labs-onesie\"]")
	public WebElement removeOnesieBtn;
	
	@FindBy (xpath = "//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")
	public WebElement removeRedTshirtBtn;
	
	@FindBy (id = "checkout")
	public WebElement checkoutBtn;
	
	@FindBy (id = "continue-shopping")
	public WebElement continueShoppingBtn;
	
	@FindBy (xpath ="//*[@id=\"cart_contents_container\"]/div/div[1]/div[1]")
	public WebElement qtyTxt;
	
	@FindBy (xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[2]")
	public WebElement descriptionTxt;
	
	@FindBy (xpath ="//*[@id=\"item_4_title_link\"]/div")
	public WebElement backpackTxt;
	
	@FindBy (xpath = "//*[@id=\"item_0_title_link\"]/div")
	public WebElement bikeLightTxt;
	
	@FindBy (xpath = "//*[@id=\"item_5_title_link\"]/div")
	public WebElement jacketTxt;
	
	@FindBy (xpath = "//*[@id=\"item_1_title_link\"]/div")
	public WebElement tshirtTxt;
	
	@FindBy (xpath = "//*[@id=\"item_2_title_link\"]/div")
	public WebElement onesieTxt;
	
	@FindBy (xpath = "//*[@id=\"item_3_title_link\"]/div")
	public WebElement redtshirtTxt;
	
	@FindBy (xpath ="//*[@id=\"shopping_cart_container\"]/a/span")
	public WebElement shoppingcartIcon;
	

}
