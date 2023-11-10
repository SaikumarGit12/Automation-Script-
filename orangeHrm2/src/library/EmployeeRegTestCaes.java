package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import Utils.AppUtils;

public class EmployeeRegTestCaes extends AppUtils{

	
	public boolean RegEmployee(String role,String empName,String uName,String pwrd) throws InterruptedException {
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		Select rolist = new Select(driver.findElement(By.id("systemUser_userType")));
		rolist.selectByVisibleText(role);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empName);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uName);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwrd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwrd);
		Thread.sleep(20);
		driver.findElement(By.id("btnSave")).click();
		
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(uName);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable;
		emptable = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = emptable.findElements(By.tagName("tr"));
		boolean rest = false;
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> clos = rows.get(i).findElements(By.tagName("td"));
			if(clos.get(1).getText().equals(uName))
			{
				rest = true;
				break;
			}
			
		}
		return rest;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
