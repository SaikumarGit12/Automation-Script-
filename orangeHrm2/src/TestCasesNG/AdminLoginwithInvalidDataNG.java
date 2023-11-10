package TestCasesNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import library.LoginPage;

public class AdminLoginwithInvalidDataNG extends AppUtils{
	
	@Test
	public void CheckAdminwithInvalidData(String adminid, String adminpsd) {
		
		LoginPage lp = new LoginPage();
		lp.Login(adminid , adminpsd);
		boolean res = lp.isErrMsgeisDisplayed();
		Assert.assertTrue(res);
		
		
		
	}
	
	
	
	
}
