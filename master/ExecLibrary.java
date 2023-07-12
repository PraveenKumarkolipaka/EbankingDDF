package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecLibrary extends Library{
	public static void main(String[] args) throws Exception 
	{
		//WebDriver driver = null;

		//instance class
		Library obj=new Library();

		//launch/opeaning
		obj.openApp("https://www.facebook.com/");

		//to get data excel file path
		FileInputStream FIS=new FileInputStream("C:\\Users\\Praveen kumar\\eclipse-workspace\\EbankingDDF\\src\\com\\ebanking\\testdata\\Facebook.xlsx");
		//work book
		XSSFWorkbook wb=new XSSFWorkbook(FIS);
		//worksheet
		XSSFSheet ws=wb.getSheet("Sheet1");
		int Rowcount=ws.getLastRowNum();
		System.out.println(Rowcount);
		//multiple iteration (loop) 
		for(int i=1;i<=Rowcount;i++)
		{
			String uname=ws.getRow(i).getCell(0).getStringCellValue();
			String pwd=ws.getRow(i).getCell(1).getStringCellValue();

			obj.Adminlogin(uname,pwd);
			//			ws.getRow(i).getCell(2).setCellValue(Result);
			//			System.out.println(Result);

		}
		//Results
		FileOutputStream FOS=new FileOutputStream("C:\\Users\\Praveen kumar\\eclipse-workspace\\EbankingDDF\\src\\com\\ebanking\\results\\ppp.xlsx");
		wb.write(FOS);
		wb.close();


	}

}
