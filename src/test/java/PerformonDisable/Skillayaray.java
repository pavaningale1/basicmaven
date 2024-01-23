package PerformonDisable;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillayaray {
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
		 WebElement Disable = d.findElement(By.cssSelector("input[class='form-control']"));
		 d.executeScript("arguments[0].value='Amravati'", Disable);
		 
		 
		 
	}
}
