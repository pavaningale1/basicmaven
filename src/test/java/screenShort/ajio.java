package screenShort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajio {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver d= new ChromeDriver ();
		d.manage().window().maximize();
		d.get("https://www.ajio.com/");
		WebElement c = d.findElement(By.name("searchVal"));
		c.sendKeys("bag");
		c.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		d.findElement(By.cssSelector("label[class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//label[text()='Fashion Bags (903)']")).click();
		
		WebElement bag = d.findElement(By.xpath("(//img[@alt='Product image of SUPERDRY Tarp Crossbody Bag'])[2]"));
		 File temp = bag.getScreenshotAs(OutputType.FILE);
		 File loc=new File("./ajio/bag.png");
		 
		 FileUtils.copyFile(temp, loc);
		 
		 
		 Thread.sleep(3000);
		 
		 d.close();
		 
		
		
		
	}

}
