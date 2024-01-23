package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.meesho.com/");
		WebElement bag = d.findElement(By.xpath("//span[text()='Bags & Footwear']"));
	    
		Actions a=new Actions(d);
		a.moveToElement(bag);
	    a.perform();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//p[text()='Formal Shoes'])[2]")).click();
	    Thread.sleep(5000);
	    d.close();
	
	}

}
