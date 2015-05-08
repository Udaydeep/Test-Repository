package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataExcel {
	 static int rowCount=0;
	public static Object[][] ReadDataFromExcel(String FilePath, String SheetName)
	{
		Object[][] result=null;
		Cell firstCellInRow=null;
		Cell secondCellInRow=null;
		try {
			FileInputStream fis=new FileInputStream(FilePath);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(SheetName);
			Row row=sheet.getRow(1);
			firstCellInRow=row.getCell(0);
			secondCellInRow=row.getCell(1);
		}
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		 catch (IOException e) {
			e.printStackTrace();
		}
		result=new Object[][]{{firstCellInRow.getStringCellValue(),secondCellInRow.getStringCellValue()}};
		
		return result;
	}
	
	
}

