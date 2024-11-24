package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	

	XSSFWorkbook workbook = null;
	
	public ExcelReader(String path) throws IOException
	{
		FileInputStream inputStream = new FileInputStream(path);		
		 workbook = new XSSFWorkbook(inputStream);
		 System.out.println("open new workbook");
	}
		
	public ArrayList<Object> getData(String sheetName)
	{
		System.out.println("get numner of wb");
		ArrayList<Object> valuePairs = new ArrayList<Object>();
		//ExcelData xlData = null;
				
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow firstRow = sheet.getRow(0);
		System.out.println("get numner of sheet"+sheetName);			
		int noOfRows = sheet.getLastRowNum();
		int noofCols = firstRow.getLastCellNum();
		System.out.println("get numner of row");	
		for(int i=0;i<=noOfRows;i++)
		{
			
			XSSFRow row  = sheet.getRow(i);
			ArrayList<Object> a = new ArrayList<Object>();			
			for(int j=0;j<noofCols;j++)
			{			
				
				String value = row.getCell(j).getStringCellValue();
				a.add(value);				
				System.out.println("value of the rows"+value);
			}			
//			xlData = new ExcelData();
//			xlData.setUsername(a.get(0).toString());			
//			xlData.setPassword(a.get(1).toString());
			
			valuePairs.add(a);
		}
		
		return valuePairs;
	}
	
	
	public void workbookClose() throws IOException
	{
		workbook.close();		
	}
	
	
}

