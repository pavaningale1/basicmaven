package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class triabeauty {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		
		WebElement freg = d.findElement(By.xpath("//a[text()='Fragrance']"));
		Thread.sleep(2000);
		
		Actions a=new Actions(d);
		a.moveToElement(freg).perform();
		Thread.sleep(3000);
		
		d.findElement(By.xpath(" //a[text()=' Unisex Perfumes ']")).click();
		Thread.sleep(3000);
		WebElement imgper = d.findElement(By.cssSelector("img[alt='Forest Essentials | Forest Essentials Nargis Mini Intense Perfume (10ml)']"));
		Thread.sleep(3000);
		Actions a1=new Actions(d);
		a.moveToElement(imgper).perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='add-to-bag__btn'])[1]")).click();
		
		
	}

}
