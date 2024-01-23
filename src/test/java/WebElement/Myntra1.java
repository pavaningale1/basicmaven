	package WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {
 
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.myntra.com/");
			Thread.sleep(2000);
			 LocalDateTime idt=LocalDateTime.now();
			 String ids=idt.toString().replace(":","-");
			 WebElement icon = d.findElement(By.cssSelector("a[class='myntraweb-sprite desktop-logo sprites-headerLogo ']"));
	         File temp = icon.getScreenshotAs(OutputType.FILE);
	         
	         File loc= new File("./myntaricon/icon"+ids+".png");
	         FileUtils.copyFile(temp, loc);
		
		}

}
