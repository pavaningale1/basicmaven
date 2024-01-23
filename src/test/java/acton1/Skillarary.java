package acton1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillarary {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://skillrary.com/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
			
			
		 Set<String> g=d.getWindowHandles();
	        
		 for (String h : g) 
		 {
	        	 d.switchTo().window(h);
				
		 }
		 d.findElement(By.xpath("//a[text()='LOGIN']")).click();
		 WebElement Email = d.findElement(By.id("email"));
		 Email.sendKeys("admin");
		 Email.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement Password = d.findElement(By.id("password"));
	     
		 Password.sendKeys("admin");
		 Password.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		
		 d.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//a[text()='Sign out']")).click();
		 
		 Thread.sleep(8000);
		 d.quit();
	}

}
