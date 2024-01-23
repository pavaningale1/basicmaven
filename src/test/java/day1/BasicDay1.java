package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDay1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
        d.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        d.findElement(By.className("_30XB9F")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//a[2]/div/div/span/span")).click();
        
        
	}

}
