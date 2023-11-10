package TestCasesNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;
import library.LoginPage;

	
	public class adminLoginwithValidDataNG extends AppUtils{
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void CheckAdmin(String adminuid, String adminpwd) {
		LoginPage lp = new LoginPage();
		lp.Login(adminuid, adminpwd);
		boolean res = lp.isAdminModuleDispayed();
		Assert.assertTrue(res);
		lp.Logout();
	}
	
	
	
	
}
