package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.LoginPage;
import Utils.AppUtils;
import Utils.ExcelUtlis;

public class AdminLoginwithTestData extends AppUtils {

	
	String datafiles = "C:\\Demos\\DDT.xlsx";
	String datasheet = "AdminLoginwithValidData";
	@Test
	public void checkadminloginpage() throws IOException {
		
		int x = ExcelUtlis.getRowCount(datafiles, datasheet);
		
		LoginPage lp = new LoginPage();
		String uid,pwd;
		for(int i=1;i<=x;i++)
		{
			uid = ExcelUtlis.getStringData(datafiles, datasheet, i, 0);
			pwd = ExcelUtlis.getStringData(datafiles, datasheet, i, 1);
			lp.Login(uid, pwd);
			boolean res = lp.isAdminModuleDispayed();
			Assert.assertTrue(res);
			if(res)
			{
				ExcelUtlis.setData(datafiles, datasheet, i, 2, "Pass");
				ExcelUtlis.fillGreenColor(datafiles, datasheet, i, 2);
				
			}else
			{
				ExcelUtlis.setData(datafiles, datasheet, i, 2, "Fail");
				ExcelUtlis.fillRedColor(datafiles, datasheet, i, 2);
			}
			lp.Logout();
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
