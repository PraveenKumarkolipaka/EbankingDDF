package com.ebanking.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
		Thread.sleep(3000);
//		login........................
		driver.findElement(By.xpath("(//div[@class='ml-2'])[2]")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/ui-root/div/div/login/page-layout/div/div/page-content/div/div[2]/form/action-button/button/span")).click();
		Thread.sleep(3000);
//		pay to user.......................
//		driver.findElement(By.xpath("(//div[@class='quick-access-text'])[1]")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Car repair")).click();
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("50,00");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"id_4\"]/div")).click();
//		driver.findElement(By.xpath("//*[@id='id_4_futureDate']")).click();
////		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\'id_6\']")).sendKeys("11-06-2023");
//		driver.findElement(By.xpath("//*[@id=\"id_5\"]")).sendKeys("hello car world");
//		driver.findElement(By.xpath("/html/body/ui-root/div[1]/div/payment/page-layout/div/div/page-content/div/div[2]/actions/action-button")).click();
////		driver.findElement(By.xpath("")).click();
////		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		
		
		
	}

}
