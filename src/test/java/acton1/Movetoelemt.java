package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelemt {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		
		
		WebElement homw = d.findElement(By.xpath("//span[text()='HOME']"));
        Actions a=new Actions (d);
        a.moveToElement(homw, 100, 0).perform();
    }
}
