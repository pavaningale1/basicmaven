package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/slider/");
		//d.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		Thread.sleep(2000);
		WebElement spiderman = d.findElement(By.className("demo-frame"));
		//d.switchTo().frame(spiderman);
		d.switchTo().frame(0);
		WebElement slider = d.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default"));
		WebElement Drag = d.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement target = d.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions a=new Actions (d);
		a.clickAndHold(slider).moveToElement(slider, 100, 0).perform();
	   a.dragAndDrop(Drag, target).perform();
	
	}

}
