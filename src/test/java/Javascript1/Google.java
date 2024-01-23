package Javascript1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver d=new ChromeDriver ();
		d.get("https://doodles.google/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//li[@class='glue-header__item glue-header__item'])[4]")).click();
		Actions a=new Actions (d);
		
		
		for(;;)
		{
			try {
                 d.findElement(By.xpath("(//div[@class='panel-btn interactive'])[5]")).click();
				  //a.moveToElement(screnshot);
                
				break;
			
			}catch(NoSuchElementException z) {
				d.executeScript("window.scrollBy(0,500)");
			}
		}
		 //WebElement screen = d.findElement(By.xpath("(//div[@class='panel-btn interactive'])[1]")); 
	    
		 File ss = d.getScreenshotAs(OutputType.FILE);
		 File loc=new File("./Google/FAQ2.png");
		 FileUtils.copyFile(ss, loc);
		 

	}

}
