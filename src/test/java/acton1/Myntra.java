package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(3000);
		WebElement bag = d.findElement(By.xpath("//span[text()='Bag']"));
		 
		Actions a= new Actions (d);
		a.sendKeys(bag,Keys.ENTER).perform();
	
	
	
	}
	
    

}


