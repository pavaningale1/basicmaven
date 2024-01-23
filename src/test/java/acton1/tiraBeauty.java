package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tiraBeauty {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		
		  WebElement brand = d.findElement(By.xpath("//a[text()=' Brands ']"));
		  Thread.sleep(2000);
		  
		  Actions a=new Actions(d);
		  a.moveToElement(brand).perform();
		  WebElement top = d.findElement(By.xpath("//div[text()=' Top Brands '] "));
		  Thread.sleep(2000);
		  
		  
		  
		  Actions a1=new Actions(d);
		  a.moveToElement(top).perform();
		  Thread.sleep(2000);
		 
		  d.findElement(By.xpath("(//div[@class='brand-image'])[13]")).click();
		  Thread.sleep(2000);
		  WebElement img = d.findElement(By.cssSelector("img[alt='Plum | Plum 3% Niacinamide Toner with Rice Water - (150ml)']"));
		  Thread.sleep(2000);
		  
		  
		  Actions a2=new Actions(d);
		  a.moveToElement(img).perform();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("(//button[@class='add-to-bag__btn'])[1]")).click();
		  Thread.sleep(2000);
		  d.findElement(By.className("profile-icons")).click();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("(//div[@class='remove'])[1]")).click();
		  d.findElement(By.xpath("//button[text()=' Remove ']")).click();
		  Thread.sleep(5000);
		  d.quit();
		
		
		
		
		
		
		
		
	}

}
