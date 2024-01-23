package Javascript1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkar {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver d=new ChromeDriver ();
		d.get("https://www.Flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		
		
		 WebElement frst = d.findElement(By.className("Pke_EE"));
		 frst.sendKeys("shoes");
		 frst.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 
		 d.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		File temp = d.getScreenshotAs(OutputType.FILE);
		File loac=new File("./FlipkartJACa/fristpage.png");
		FileUtils.copyFile(temp, loac);
		Thread.sleep(8000);
		d.close();
		
	}

}
