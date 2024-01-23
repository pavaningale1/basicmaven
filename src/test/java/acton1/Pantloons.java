package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pantloons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		Thread.sleep(2000);
		WebElement accer = d.findElement(By.xpath("//span[text()='ACCESSORIES']"));
         
		
		Actions a=new Actions(d);
		a.moveToElement(accer);
		a.perform();
		
		d.findElement(By.xpath("//a[text()='Men Wallets']")).click();
		Thread.sleep(2000);
		
		WebElement wallets = d.findElement(By.xpath("(//img[@alt='Textured Leather Wallet'])[1]"));
		
		Actions a1=new  Actions (d);
		a.moveToElement(wallets);
		a.perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class='PlpWeb_product-quickview-button__2CDvM'])[1]")).click();
		Thread.sleep(4000);
		
		d.quit();
	}

}
