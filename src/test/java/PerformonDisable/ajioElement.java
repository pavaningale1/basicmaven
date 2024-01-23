package PerformonDisable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajioElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver d= new ChromeDriver ();
		d.manage().window().maximize();
		d.get("https://www.ajio.com/");
		WebElement c = d.findElement(By.name("searchVal"));
		c.sendKeys("SUNGLASS");
		c.sendKeys(Keys.ENTER);
		
		for(;;)
		{
			try {
				WebElement ss = d.findElement(By.cssSelector("img[alt='Product image of Ted Smith TS-50755-C5 UV-Protected Rimless Square Sunglasses']"));
				
				
				break;
			}catch(NoSuchElementException a)
			{
				d.executeScript("window.scrollBy(0,500)");
			}
			
		}
		
		WebElement ss = d.findElement(By.cssSelector("img[alt='Product image of Ted Smith TS-50755-C5 UV-Protected Rimless Square Sunglasses']"));

		File sun = ss.getScreenshotAs(OutputType.FILE);
		File f=new File("./Ajioass/sun.png");
		FileUtils.copyFile(sun, f);
		  
		
	}

}
