package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider2 {
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://jqueryui.com/slider/");
		
			
			Thread.sleep(2000);
			d.findElement(By.xpath("//a[text()='Draggable']")).click();
			WebElement batman = d.findElement(By.className("demo-frame"));
			d.switchTo().frame(batman);
			
			WebElement dra = d.findElement(By.xpath("//p[text()='Drag me around']"));
	         
			Actions a=new Actions (d);
			a.dragAndDropBy(dra, 50, 0).perform();
		
		}

}
