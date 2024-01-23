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

public class MyntraSS {
	

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			 LocalDateTime ldt = LocalDateTime.now();
			 String localdate=ldt.toString().replace(":", "-");
			ChromeDriver d= new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.myntra.com/");
			Thread.sleep(2000);
			d.findElement(By.xpath("//span[text()='Bag']")).click();
			
			File k=d.getScreenshotAs(OutputType.FILE);
			File destinationfile=new File("./ScreenShot/myntra3"+localdate+".png");
			k.renameTo(destinationfile);
			
			d.navigate().back();
			Thread.sleep(2000);
			
			WebElement c = d.findElement(By.className("desktop-searchBar"));
			c.sendKeys("shoes");
			c.sendKeys(Keys.ENTER);
			
			d.findElement(By.xpath("//label[text()='Men']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//label[text()='Sports Shoes']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("(//h3[text()='HRX by Hrithik Roshan'])[1]")).click();
			Set<String> o=d.getWindowHandles();
			System.out.println(o);
			for (String g : o) {
				d.switchTo().window(g);
				
			}
			d.findElement(By.xpath("//p[text()='6']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	        Thread.sleep(3000);
	        d.findElement(By.xpath("//span[text()='Bag']")).click();
	        Thread.sleep(2000);
	        
	        File k1=d.getScreenshotAs(OutputType.FILE);
			File destinationfile1=new File("./ssimages/myntra4"+localdate+".png");
			//k1.renameTo(destinationfile1);
			FileUtils.copyFile(k1, destinationfile1);
	        
	}

}
