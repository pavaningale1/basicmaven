package Javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		

		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("perfume");
		 ser.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 //d.executeScript("window.scrollBy(0,150)");
		 d.findElement(By.xpath("//label[text()='70% and above']")).click();
		 d.findElement(By.xpath("//a[text()='Next']")).click();
		 d.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
	}

}
