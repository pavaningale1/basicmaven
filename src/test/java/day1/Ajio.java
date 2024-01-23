package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver d=new ChromeDriver ();
		d.get("https://www.ajio.com/");
		d.manage().window().maximize();
		WebElement dc = d.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
		
		dc.sendKeys("shirt");
		dc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Men (159,632)']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[text()='Men Regular Fit Shirt with Patch Pocket'])[1]")).click();
		

	}

}
