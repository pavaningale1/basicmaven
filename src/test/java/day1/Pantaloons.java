package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pantaloons {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		WebElement search = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		search.sendKeys("shirt");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='StyleUp'] ")).click();
		Thread.sleep(2000);
		d.findElement(By.id("size_9-10Y")).click();
//		d.findElement(By.cssSelector("span[class='Quantity_plus__2gUw9']")).click();
		d.findElement(By.className("Quantity_plus__2gUw9")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("a[title='Cart']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//img[@alt='delete product'])[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[text()='REMOVE']")).click();
	}

}
