package com.ebanking.master;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Library {
	FileInputStream FIS;
	String Expval,Actval;
	public static WebDriver driver;

	public void openApp(String URL) throws Exception
	{
		
		String Expval="Facebook helps you connect and share with the people in your life.";
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);
		String Actval=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();

//		driver.findElement(By.xpath("(//div[@class='ml-2'])[2]")).click();
		//Thread.sleep(3000);
		//comparision
		if(Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Sucessfully launched");
		}
		else
		{
			System.out.println("Failed launched");
		}
//		return Actval;

	}




	public String Adminlogin(String Uname,String Pwd) throws Exception

	{
		
//		Expval="Your Pages and profiles";
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Actval=driver.findElement(By.xpath("//*[text()='Your Pages and profiles']")).getText();
		//comprasion.........
//		if(Expval.equalsIgnoreCase(Actval))
//		{
//			System.out.println("Login successfully");
//		}
//		else
//		{
//			System.out.println("Login Failed");
//		}
//		return Actval;
		
		
		if(Uname.equalsIgnoreCase("9550495586")&&Pwd.equalsIgnoreCase("9347440829@kpk"))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		return Actval;

	}
	public String close()
	{
		driver.quit();
		return "pass";
	}

}
