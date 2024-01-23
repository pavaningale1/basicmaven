package PerformonDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letcode {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(2000);
		WebElement tf = d.findElement(By.id("noEdit"));
		Thread.sleep(2000);
		d.executeScript("arguments[0].value='pavan'",tf);
	}
	

}
