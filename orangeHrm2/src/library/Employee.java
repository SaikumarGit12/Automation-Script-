package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.AppUtils;

public class Employee extends AppUtils{

	
	public boolean addEmployee(String fName, String lName) {
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		String empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement emptable = driver.findElement(By.id("resultTable"));
		
		List<WebElement>  rows =emptable.findElements(By.tagName("tr"));
		
		boolean flag = false;
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
			if(cols.get(1).getText().equals(empid))
			{
				flag = true;
				break;
			}
		}
		
		return flag;
		
		
		
		
	}
	
	
	
}
