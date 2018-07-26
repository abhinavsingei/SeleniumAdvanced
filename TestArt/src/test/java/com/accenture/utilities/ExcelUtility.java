package com.accenture.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.accenture.pages.Registeration;



public class ExcelUtility {

	public void getTestData() throws IOException
	{
	FileInputStream fin = new FileInputStream("C:\\Abhinav\\DataDriven\\File1.xls");
	//XSSFWorkbook x =new XSSFWorkbook(fin);
	HSSFWorkbook HS= new HSSFWorkbook(fin);
	HSSFSheet sheet = HS.getSheet("TestData");
	
	int NumberOfRows = sheet.getLastRowNum();
	System.out.println("NumberOfRows ="+NumberOfRows);
	
	for(int i=1;i<NumberOfRows;i++)
	{
		//String Data = sheet.getRow(i).getCell(0).getStringCellValue();
		//System.out.println("Cell:"+i +" = "+Data);
//		for (int j=0;j<sheet.getRow(i).getLastCellNum();j++)
//		{
//			System.out.println("Coumn : "+sheet.getRow(i).getCell(j));
//		}
		String FirstName = sheet.getRow(i).getCell(0).getStringCellValue();
		String LastName = sheet.getRow(i).getCell(1).getStringCellValue();
		String Email = sheet.getRow(i).getCell(2).getStringCellValue();
		String Password = sheet.getRow(i).getCell(3).getStringCellValue();
		String ConfirmPassword = sheet.getRow(i).getCell(4).getStringCellValue();
		System.out.println("FirstName"+i+" = "+FirstName+"\n"+"LastName"+i+" = "+LastName+"\n"+"Email"+i+" = "+Email+"\n"+"Password"+i+" = "+Password+"\n"+"ConfirmPassword"+i+" = "+ConfirmPassword+"\n");
		Registeration.registerbyEXcel(FirstName, LastName, Email, Password, ConfirmPassword);
	}
	/*String Data = sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println("First Cell Data = "+Data);
	*/
	}
	public static void main(String[] args) throws IOException {
		ExcelUtility e = new ExcelUtility();
		e.getTestData();
		
	}
}
