package com.dataproviders;

//import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {

	/*
	 * DataProvider by passing Method as an input parameter
	 * 
	 * @DataProvider(name="dataProvider") public static Object[][]
	 * getData(Method method){ Object[][] result=null;
	 * if(method.getName().equals("stringReverse")) result=new
	 * Object[][]{{"uday","yadu"},{"palindrome","emordnilap"}};
	 * 
	 * else if(method.getName().equals("StringAppend")) result=new
	 * Object[][]{{"uday","deep","udaydeep"},{"ball","bat","ballbat"}}; return
	 * result; }
	 */
	@DataProvider(name = "stringReverseDataProvider")
	public static Object[][] getData() {
		Object[][] result = null;

		result = new Object[][] { { "uday", "yadu" },
				{ "palindrome", "emordnilap" } };
		return result;
	}

	@DataProvider(name = "stringAppendDataProvider")
	public static Object[][] getData1() {
		Object[][] result = null;

		result = new Object[][] { { "uday", "deep", "udaydeep" },
				{ "ball", "bat", "ballbat" } };
		return result;
	}

	@DataProvider(name = "ExcelDataProvider")
	public static Object[][] dataProvider() {
		Object[][] MainResult = null;
		String Filepath = "C:\\Users\\Uday Deep Thota\\Desktop\\data.xlsx";
		String SheetName = "ExcelData";
		MainResult = com.excel.ReadDataExcel.ReadDataFromExcel(Filepath,
				SheetName);
		return MainResult;

	}
}