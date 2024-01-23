package Wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraASS {
	public static void main(String[] args) throws IOException {
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		WebDriverWait waits = new WebDriverWait(cd, Duration.ofSeconds(20));
		
		
		cd.get("https://www.myntra.com/");
		 
			
		WebElement nb = cd.findElement(By.className("desktop-searchBar"));
		nb.sendKeys("watches");
		nb.sendKeys(Keys.ENTER);
		
		cd.findElement(By.className("brand-more")).click();
		cd.findElement(By.xpath("//label[text()='Fossil']")).click();
		cd.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		cd.findElement(By.cssSelector("span[class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		String url = cd.getCurrentUrl();
		System.out.println(url);
		String url2="https://www.myntra.com/watches?f=Brand%3AFossil&rawQuery=watches";
		
		waits.until(ExpectedConditions.urlToBe(url));
		
		cd.findElement(By.xpath("//h4[text()='Men Chronograph Analogue Watch']")).click();
		
		Set<String> ids = cd.getWindowHandles();
		System.out.println(ids);
		
		for(String ids1 : ids)
		{
			cd.switchTo().window(ids1).getTitle();
		}
		
		cd.executeScript("window.scrollBy(0,1200)");
		
		WebElement product = cd.findElement(By.className("pdp-product-description-content"));
		File destination = cd.getScreenshotAs(OutputType.FILE);
		File f=new File("./MYNTRA/Watches.png");
		FileUtils.copyFile(destination, f);
		
	}

	
	}


