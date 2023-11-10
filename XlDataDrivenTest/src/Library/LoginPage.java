package Library;

import org.openqa.selenium.By;

import Utils.AppUtils;

public class LoginPage extends AppUtils{

	public void Login(String uid,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	
	public boolean isAdminModuleDispayed() {
		
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
			
		}
	}
	
		public void Logout() {
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
		
		
	}
	
		public boolean isErrMsgeisDisplayed() {
			String errmsge;
			errmsge  = driver.findElement(By.id("spanMessage")).getText();
			if(errmsge.toLowerCase().contains("invalid")) {
				return true;
			}else
			{
				return false;
			}
		}
		
		public boolean isEmployeeModuleDispayed() {
			
			try {
				driver.findElement(By.linkText("Admin")).isDisplayed();
				return false;
			} catch (Exception e) {
				return true;
			}
				
			
		}
		
		
		
		
}
