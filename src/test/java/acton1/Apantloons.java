package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Apantloons {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		
		WebElement search = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
	    Actions a=new Actions (d);
	    a.sendKeys(search,"shoes");
	    a.sendKeys(Keys.ENTER);
	    a.perform();
	    
	    WebElement price = d.findElement(By.xpath("//p[text()='Price']"));
	    Thread.sleep(3000);
	    a.click(price).perform();
	    Thread.sleep(2000);
	    
	   WebElement pointet = d.findElement(By.xpath("(//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary'])[1]"));
	    a.clickAndHold(pointet).moveByOffset(100, 0).perform();
	    Thread.sleep(3000);
	    WebElement pointer2 = d.findElement(By.xpath("(//span[@class='MuiSlider-thumb MuiSlider-thumbColorPrimary'])[2]"));
	    a.clickAndHold(pointer2).moveByOffset(-50,0).perform();
	
	}

}
