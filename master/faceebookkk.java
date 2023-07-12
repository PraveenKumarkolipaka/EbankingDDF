package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceebookkk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\browser\\chrome\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9550495586pp");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9347440829@kpkpp");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
