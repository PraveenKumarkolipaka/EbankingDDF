package com.ebanking.master;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SCript {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\browser\\chrome\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
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

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@name='login']")).click();
		}
	}

}
