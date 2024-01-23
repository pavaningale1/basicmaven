package day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(3000);
		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("shoes");
		 ser.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 d.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
		 d.findElement(By.xpath("//h4[text()='Bundles']")).click();
		 d.findElement(By.xpath("//label[text()='Single Styles']")).click();
		 d.findElement(By.xpath("//h4[text()='Country of Origin']")).click();
		 d.findElement(By.xpath("//label[text()='India']")).click();
		 d.findElement(By.xpath("//h4[text()='Size']")).click();
		 d.findElement(By.xpath("//label[text()='UK6.5']")).click();
		 d.findElement(By.xpath("//label[text()='White']")).click(); 
		 d.findElement(By.xpath("//span[text()='809']")).click();
		 
		 Set<String> g=d.getWindowHandles();
         for (String h : g) {
        	 d.switchTo().window(h);
			
		}
         d.findElement(By.xpath("//p[text()='6']")).click();
         d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
         d.findElement(By.xpath("//a[text()='GO TO BAG']")).click();
         d.findElement(By.xpath("//span[text()='Qty: ']")).click();
         d.findElement(By.id("4")).click();
         d.findElement(By.xpath("//div[text()='DONE']"));
         d.findElement(By.cssSelector("svg[class='itemComponents-base-activeProduct ']")).click();
         d.findElement(By.xpath("//button[text()='REMOVE']")).click();
		 
	}

}
