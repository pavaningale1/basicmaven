package Wait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajjio {
	

		public static void main(String[] args) throws InterruptedException{
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			
			WebDriverWait waits=new WebDriverWait(d,Duration.ofSeconds(10));
			d.get("https://www.ajio.com/");
			WebElement men=d.findElement(By.xpath("//span[text()='MEN']"));
			Actions a=new Actions(d);
			a.moveToElement(men).perform();
			d.findElement(By.xpath("//a[text()='Bags & Wallets']")).click();
			String actual=d.getTitle();
			String expected="Bags And Wallets";
			waits.until(ExpectedConditions.titleIs(expected));
			System.out.println(actual);
			d.findElement(By.xpath("//span[text()='colors']")).click();
			d.findElement(By.xpath("(//i[@class='facet-checkbox-color-inner'])[3]")).click();
			d.findElement(By.xpath("//span[text()='brands']")).click();
			d.findElement(By.id("verticalsizegroupformat-brand")).click();
			for(;;)
			{
				try {
					d.findElement(By.xpath("//span[text()='Puma']")).click();
					break;
				}
				catch(NoSuchElementException e)
				{
					JavascriptExecutor j=(JavascriptExecutor)d;
					j.executeScript("window.scrollTo(1000,0)");
				}
			}
			d.findElement(By.xpath("//button[text()='Apply']")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//img[@alt='Product image of Puma Leather Bi-Fold Wallet with Logo Applique']")).click();
			Set<String> ids=d.getWindowHandles();
			for(String s:ids)
			{
				d.switchTo().window(s);
			}
			d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			Thread.sleep(4000);
			d.quit();
			
			
			
			
			
			

		}

	
	}


