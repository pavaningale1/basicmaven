package Wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkar {
	public static void main(String[] args) throws IOException, InterruptedException {
		//WebDriver d=new ChromeDriver();
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		d.get("https://www.flipkart.com/");
		  
	    d.findElement(By.className("_30XB9F")).click();
	    WebElement electronic = d.findElement(By.xpath("//span[text()='Electronics']"));
	        
	    Actions a =new Actions(d);
	    a.moveToElement(electronic).perform();
	    
	    d.findElement(By.xpath("//a[text()='Laptop and Desktop']")).click();
	    WebElement elec2 = d.findElement(By.xpath("//span[text()='Electronics']"));
	    
	    a.moveToElement(elec2).perform();
	    
	    d.findElement(By.xpath("(//a[@class='_3QN6WI _1MMnri _32YDvl'])[5]")).click();
	    d.findElement(By.xpath("//a[text()='Ultimus Elite Intel Core i5 10th Gen 1035G4 - (8 GB/512 GB SSD/Wi...']")).click();
	    Set<String> ids = d.getWindowHandles();
		 for(String b:ids)
		 {
			 String all = d.switchTo().window(b).getCurrentUrl();
			
		 }
		 
		 TakesScreenshot ts=(TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File loc=new File ("./WAITFLIP/Frist.png");
		FileUtils.copyFile(temp, loc);
		
		   d.findElement(By.xpath("(//div[@class=\"_2C41yO\"])[1]")).click();
		   Thread.sleep(2000);
		   TakesScreenshot ts1=(TakesScreenshot) d;
			File temp1 = ts1.getScreenshotAs(OutputType.FILE);
			File loc1=new File ("./WAITFLIP/second.png");
			FileUtils.copyFile(temp1, loc1);
			 Thread.sleep(2000);
			TakesScreenshot ts2=(TakesScreenshot) d;
			 Thread.sleep(2000);
		
			d.findElement(By.xpath("(//div[@class=\"_2C41yO\"])[3]")).click();
			
			 Thread.sleep(2000);
			File temp2 = ts2.getScreenshotAs(OutputType.FILE);
			File loc2=new File ("./WAITFLIP/third.png");
			FileUtils.copyFile(temp2, loc2);
			
		
		
	}

}
