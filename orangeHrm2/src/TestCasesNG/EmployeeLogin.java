package TestCasesNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.AdminModuleUtils;
import library.Employee;

public class EmployeeLogin extends AdminModuleUtils{
	
	@Parameters({"fName","lName"})
	@Test
	public void checkemplogin(String fName,String lName) {
		
		Employee em = new Employee();
		boolean res = em.addEmployee(fName, lName);
		Assert.assertTrue(res);
		
		
	}
	
	
	
	
	
	
}
