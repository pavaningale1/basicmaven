package day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Bag']")).click();
		
		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("wallet");
		 ser.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 d.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		 Set<String> g=d.getWindowHandles();
         for (String h : g) {
        	 d.switchTo().window(h);
			
		}
         d.findElement(By.xpath("//span[text()='WISHLIST']")).click();
         Thread.sleep(8000);
         d.quit();
	}
}
