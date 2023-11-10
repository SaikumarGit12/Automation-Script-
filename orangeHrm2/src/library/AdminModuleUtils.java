package library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.AppUtils;

public class AdminModuleUtils extends AppUtils{

		String url = "Admin";
		String pwd = "Qedge123!@#";
		LoginPage lp;
		
		
	@BeforeTest
	public void AdminLOgin()
	{
		lp = new LoginPage();
		lp.Login(url, pwd);
	}
	
	@AfterTest
	public void Logout()
	{
		lp.Logout();
	}
	
	
	
	
	
	
	
}
