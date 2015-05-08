package com.TestMethods;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringMethods {
	@Test(dataProvider = "stringReverseDataProvider", dataProviderClass = com.dataproviders.DataProviders.class)
	public void stringReverse(String inputString, String expectedOutput) {

		// return new StringBuffer(inputString).reverse().toString();
		String actualOutput = new StringBuffer(inputString).reverse()
				.toString();
		Assert.assertEquals(actualOutput, expectedOutput);

	}

	@Test(dataProvider = "stringAppendDataProvider", dataProviderClass = com.dataproviders.DataProviders.class)
	public void StringAppend(String inputString1, String inputString2,
			String expectedString) {
		String actualStringOutput = inputString1 + inputString2;
		Assert.assertEquals(actualStringOutput, expectedString);
	}

	@Test(dataProvider = "dataFromOtherProject", dataProviderClass = com.bayamp.string.tests.dataProvider.class)
	public void subString(String mainString, String subString,
			boolean expectedOuput) {
		Assert.assertEquals(mainString.contains(new String(subString)),
				expectedOuput);
	}

	@Test
	@Parameters({ "inputString", "StringLength" })
	public void StringLength(String inputString, int StringLength) {
		int count = 0;
		for (Character ch : inputString.toCharArray())
			count++;
		Assert.assertEquals(count, StringLength);
	}

	@Test(dataProvider = "ExcelDataProvider", dataProviderClass = com.dataproviders.DataProviders.class)
	public void StringAppendForExcelData(String inputString1,
			String inputString2) {
		String actualStringOutput = inputString1 + inputString2;
		String expectedString = "BatBall";
		Assert.assertEquals(actualStringOutput, expectedString);
	}

}
