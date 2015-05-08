package com.csv;
import au.com.bytecode.opencsv.CSVReader;

public class CSVFileReader {
	public CSVReader reader=null;
	
	public String getPath(String FileName)
	{
		String path=CSVFileReader.class.getClassLoader().getResource("com/data").getPath();
		path=path.replaceAll("bin","src");
		path=path +"\" +FileName";
		return path;
		
	}
	
	public Object[][] getData(String FileName)
	{
		return null;
		
	}

}
