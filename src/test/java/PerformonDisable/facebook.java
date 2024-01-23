package PerformonDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]")).click();
		d.findElement(By.xpath("//option[text()='2']")).click();
	
	}

}
