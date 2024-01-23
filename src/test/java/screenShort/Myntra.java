package screenShort;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Bag']")).click();
		LocalDateTime ldt=LocalDateTime.now();
	    String timedate=ldt.toString().replace(":","-");
	    File sc = d.getScreenshotAs(OutputType.FILE);
	    File loaction=new File("./ScreenShot/Myntra"+timedate+".png");
	    sc.renameTo(loaction);
	    d.findElement(By.cssSelector("svg[class='logo-inline']")).click();
		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("watches");
		 ser.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 
		 d.findElement(By.xpath("(//h4[text()='ColorFit Icon Buzz Smart Watch'])[1]")).click();
		 Set<String> ids = d.getWindowHandles();
		 for(String a:ids)
		 {
			 String all = d.switchTo().window(a).getCurrentUrl();
			
		 }
		 d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		 d.findElement(By.xpath("//span[text()='Bag']")).click();
		 File sc1 = d.getScreenshotAs(OutputType.FILE);
		  File loaction2=new File("./ScreenShot/Myntra1"+timedate+".png");
		   sc1.renameTo(loaction2);
		   
		    d.quit();
		  
		 
		 }

}
