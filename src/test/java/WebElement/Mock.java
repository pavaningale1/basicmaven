package WebElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock {

	     public static void main(String[] args) throws InterruptedException, IOException {
   
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
		 
		  d.findElement(By.xpath("(//div[@class='brand-image'])[4]")).click();
		  
		  Thread.sleep(3000);
		  WebElement img = d.findElement(By.xpath("(//img[@class='fy__img image'])[2]"));
		  Thread.sleep(3000);
		  Actions a2=new Actions(d);
		  a.moveToElement(img).perform();
		  Thread.sleep(2000);
		  d.findElement(By.xpath("(//button[text()=' Add to Bag '])[4]")).click();
		  Thread.sleep(2000);
		  d.findElement(By.className("profile-icons")).click();
		  Thread.sleep(2000);
          File ss = d.getScreenshotAs(OutputType.FILE);
            
          File loc=new File("./MOCK/Frist.png");
          FileUtils.copyFile(ss, loc);
            
          d.findElement(By.xpath("(//div[@class='remove'])[1]")).click();
  		  d.findElement(By.xpath("//button[text()=' Remove ']")).click();
  		  Thread.sleep(5000);
  		  d.quit();

	}

}
