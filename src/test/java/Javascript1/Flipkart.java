package Javascript1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
        d.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        d.findElement(By.className("_30XB9F")).click();
        Thread.sleep(2000);
         WebElement s = d.findElement(By.name("q"));
         s.sendKeys("realme");
         Thread.sleep(2000);
         s.sendKeys(Keys.ENTER);
         d.findElement(By.xpath("//div[text()='realme C51 (Mint Green, 64 GB)']")).click();
	    
         Set<String> ids = d.getWindowHandles();
          
         for(String a:ids)
         {
        	 d.switchTo().window(a).getCurrentUrl();
         }
         Thread.sleep(3000);
         d.executeScript("window.scrollBy(0,1500)");
         
         File temp = d.getScreenshotAs(OutputType.FILE);
         File temp1=new File("./ASS/spec.png");
         FileUtils.copyFile(temp, temp1);
         
	
	}

}
