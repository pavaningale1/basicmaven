package day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkar {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver d=new ChromeDriver();
			d.manage().window().maximize();
	        d.get("https://www.flipkart.com/");
	        Thread.sleep(2000);
	        d.findElement(By.className("_30XB9F")).click();
	        Thread.sleep(2000);
	         WebElement s = d.findElement(By.name("q"));
	         s.sendKeys("perfumes");
	         Thread.sleep(2000);
	         s.sendKeys(Keys.ENTER);
	         d.findElement(By.xpath("//a[text()='Bella vita organic Luxury Unisex Perfume Gift Set For M...']")).click();
	         Thread.sleep(2000);
	         Set<String> g=d.getWindowHandles();
	         for (String h : g) {
	        	 d.switchTo().window(h);
				
			}
	         d.findElement(By.xpath("//button[text()='Add to cart']")).click();
	         Thread.sleep(2000);
	         d.findElement(By.xpath("//div[text()='Remove']")).click();	
	        
	   
	        }
	

}
