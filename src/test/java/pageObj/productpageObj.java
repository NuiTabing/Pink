package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.driver;

public class productpageObj {
	
	public productpageObj() {
		PageFactory.initElements(driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/span")
	public WebElement product; 
	
	@FindBy (xpath = "//*[@id=\"item_4_title_link\"]/div")
	public WebElement backpack;
	
	@FindBy (xpath = "//*[@id=\"item_0_title_link\"]/div")
	public WebElement bikeLight;
	
	@FindBy (xpath = "//*[@id=\"item_1_title_link\"]/div")
	public WebElement Tshirt;
	
	@FindBy (xpath = "//*[@id=\"item_5_title_link\"]/div")
	public WebElement jacket;
	
	@FindBy (xpath = "//*[@id=\"item_2_title_link\"]/div")
	public WebElement onesie;
	
	@FindBy (xpath = "//*[@id=\"item_3_title_link\"]/div")
	public WebElement redTshirt;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
	public WebElement priceBackpack;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
	public WebElement priceBikeLight;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")
	public WebElement priceTshirt;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")
	public WebElement priceJacket;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")
	public WebElement priceOnesie;
	
	@FindBy (xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
	public WebElement priceRedTshirt;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	public WebElement atcBackpack;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	public WebElement atcBikeLight;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	public WebElement atcTshirt;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	public WebElement atcJacket;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	public WebElement atcOnesie;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	public WebElement atcRedTshirt;
	
	@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
	public WebElement shoppingCartLink;
	
	
	
	

}
