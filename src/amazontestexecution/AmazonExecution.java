package amazontestexecution;

import org.testng.annotations.Test;

import amazontestpages.Homepage;
import amazontestpages.Passwordpage;
import amazontestpages.Signin;
import amazontestpages.YourAccount;
import amazontestpages.Youraddress;
import amazontestpages.Yourorders;

public class AmazonExecution extends Base{
	
	
	@Test
	public void amazonsignin() {
	
	Homepage hp=new Homepage(driver);
	Signin sign= new Signin(driver);
	Passwordpage pw= new Passwordpage(driver);
	YourAccount youacc= new YourAccount(driver);
	Youraddress youadd = new Youraddress(driver);
	Yourorders youorder= new Yourorders(driver);
	
	hp.Clickyouracct();
	sign.entervalidemail("amandeepKaurr91@gmail.com");
	pw.Enterpassword("111111");	
	youacc.clickyouraccount();
	youorder.orderhistory();
	youadd.enterinfoaddwindow("Aman", "5196653423", "pinegroove" ,"Pinegroove apartment", "Kitchener");
	
	
	

	

}}
