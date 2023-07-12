package com.ebanking.master;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreatingExcelSheet {
	@Test
	public void testDataExport() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("E:\\software testing\\Excel\\Praveen.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("Praveen1");

		XSSFRow row=ws.createRow(0);
		row.createCell(0).setCellValue("demos");
		row.createCell(1).setCellValue("1234");

		XSSFRow row1=ws.createRow(1);
		row1.createCell(0).setCellValue("webdriver");
		row1.createCell(1).setCellValue("123");
		
		XSSFRow row2=ws.createRow(2);
		row1.createCell(0).setCellValue("demo");
		row1.createCell(1).setCellValue("1234");
		
		wb.write(fos);
	}
}
