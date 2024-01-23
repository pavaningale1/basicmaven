package acton1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Skillaray {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://skillrary.com/");
		 Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		 Thread.sleep(2000);
		d.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		
		 Set<String> g=d.getWindowHandles();
         for (String h : g) {
        	 d.switchTo().window(h);
			
		}
        
         WebElement Hover = d.findElement(By.xpath("//a[text()='COURSE']"));
         Actions a=new Actions(d);
         a.moveToElement(Hover).perform();
         Thread.sleep(2000);
         d.findElement(By.xpath("(//a[text()='Selenium Training '])[1]")).click();
         Thread.sleep(2000);
         
         WebElement plus = d.findElement(By.cssSelector("i[class='fa fa-plus']"));
         Thread.sleep(2000);
         a.doubleClick(plus).perform();
        
        

	}

}
