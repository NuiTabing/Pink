package utilities;

import pageObj.cartpageObj;
import pageObj.checkoutpageObj;
import pageObj.homepageObj;
import pageObj.productpageObj;

public class pageInitialized extends driver{
	
	protected static homepageObj hp;
	protected static productpageObj pd;
	protected static cartpageObj cp;
	protected static checkoutpageObj cop;
	
	public static void init() {
		
		hp = new homepageObj();
		pd = new productpageObj();
		cp = new cartpageObj();
		cop = new checkoutpageObj();
	}

}
