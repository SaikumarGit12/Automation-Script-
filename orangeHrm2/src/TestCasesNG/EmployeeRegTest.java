package TestCasesNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import library.AdminModuleUtils;
import library.EmployeeRegTestCaes;

public class EmployeeRegTest extends AdminModuleUtils{
	
	
	
	
	@Parameters({"role","empname","uname", "pwrd"})
	@Test
	public void checkEmp(String role,String empname,String uname,String pwrd) throws InterruptedException
	{
		EmployeeRegTestCaes emp = new EmployeeRegTestCaes();
		emp.RegEmployee(role, empname, uname, pwrd);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
