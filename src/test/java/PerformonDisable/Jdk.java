package PerformonDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import acton1.Sendkeys;

public class Jdk {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://google.com");
		Thread.sleep(2000);
		
		 WebElement web = d.findElement(By.id("APjFqb"));
		  web.sendKeys("downlod jdk 1.8");
		  web.sendKeys(Keys.ENTER);
		  
		  d.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		  d.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
	      
		  WebElement button = d.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz'],"));
	      
		  d.executeScript("arguments[0].click()",button );
	}

}
