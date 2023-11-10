package Testcases;

import java.io.IOException;

import Utils.ExcelUtlis;

public class sample {

	public static void main(String[] args) throws IOException {
		ExcelUtlis.setData("C:\\Demos\\DDT.xlsx", "AdminLoginwithValidData", 1, 2, "Pass");
		ExcelUtlis.fillGreenColor("C:\\Demos\\DDT.xlsx", "AdminLoginwithValidData", 1, 2);

	}

}
