package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Library.LoginPage;
import Utils.AppUtils;
import Utils.ExcelUtlis;

public class AdminLoginwithInValidData extends AppUtils{

	String datafile = "C:\\Demos\\DDT.xlsx";
	String datasheet = "AdminLoginwithInvalidData";
	
	@Test
	public  void checkAdminLogin() throws IOException
	{
		int y = ExcelUtlis.getRowCount(datafile, datasheet);
		
		
		String uid,pwd;
		LoginPage lp = new LoginPage();
		for(int i=1;i<=y;i++)
		{
			uid = ExcelUtlis.getStringData(datafile, datasheet, i, 0);
			pwd = ExcelUtlis.getStringData(datafile, datasheet, i, 1);
			lp.Login(uid, pwd);
			boolean res = lp.isErrMsgeisDisplayed();
			Assert.assertTrue(res);
			
			if(res)
			{
				ExcelUtlis.setData(datafile, datasheet, i, 1, "Pass");
				ExcelUtlis.fillGreenColor(datafile, datasheet, i, 1);
				
			}else
			{
				ExcelUtlis.setData(datafile, datasheet, i, 1, "Fail");
				ExcelUtlis.fillGreenColor(datafile, datasheet, i, 1);
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	
	
}
