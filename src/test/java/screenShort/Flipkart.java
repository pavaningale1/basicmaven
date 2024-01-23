package screenShort;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		LocalDateTime ldt=LocalDateTime.now();
		String lc=ldt.toString().replace(":", "-");
		
		
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		File temp = d.getScreenshotAs(OutputType.FILE);
		File loac=new File("./Flipkart/fristpage"+lc+".png");
		FileUtils.copyFile(temp, loac);
		
		 WebElement frst = d.findElement(By.className("Pke_EE"));
		 frst.sendKeys("shoes");
		 frst.sendKeys(Keys.ENTER);
		  
		 File temp2 = d.getScreenshotAs(OutputType.FILE);
		 File loca2=new File("./Flipkart/secondpage"+lc+".png");
		 FileUtils.copyFile(temp2, loca2);
		 
		 d.findElement(By.xpath("(//a[@class='IRpwTa'])[1]")).click();
		 
		 Set<String> ids = d.getWindowHandles();
		  for(String a:ids)
		  {
			  d.switchTo().window(a).getCurrentUrl();
		  }
		  
		 File temp3 = d.getScreenshotAs(OutputType.FILE);
		 File loca3=new File("./Flipkart/thirdpage"+lc+".png");
		 FileUtils.copyFile(temp3, loca3);
		 
		 
		 
		  d.findElement(By.xpath("//button[text()='Add to cart']")).click();
		     Thread.sleep(10000);
			 File temp4 = d.getScreenshotAs(OutputType.FILE);
			 File loca4=new File("./Flipkart/fourthpage"+lc+".png");
			 FileUtils.copyFile(temp4, loca4);
		  
		
		
		
		
	
		
	}

}
