package Wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajio2 {
	public static void main(String[] args) throws IOException {
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.ajio.com/");
	 WebElement ajo = d.findElement(By.name("searchVal"));
	ajo.sendKeys("Perfumes");
	ajo.sendKeys(Keys.ENTER);
	d.findElement(By.xpath("//label[@for='Men']"));
	d.findElement(By.xpath("//span[text()='price']")).click();
	d.findElement(By.id("minPrice")).sendKeys("100");
	d.findElement(By.id("maxPrice")).sendKeys("500");
	d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	
          d.findElement(By.xpath("//div[text()='Sport Vegan Revive Body Spray']")).click();
	 Set<String> ids = d.getWindowHandles();
	 for(String a:ids)
	 {
		 d.switchTo().window(a).getTitle();
	 }
	d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	
	d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	TakesScreenshot t=(TakesScreenshot) d;
	File per = t.getScreenshotAs(OutputType.FILE);
	File dfile = new File("./AjioA2/Perfume.png");
	FileUtils.copyFile(per, dfile);

	}

}
