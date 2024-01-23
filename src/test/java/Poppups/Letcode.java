package Poppups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Letcode {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://letcode.in/test");
		d.findElement(By.xpath("//a[text()='Dialog']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("accept")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		d.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		d.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		d.switchTo().alert().sendKeys("pavan");
		d.switchTo().alert().accept();
	}

}
