package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	 
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver d=new ChromeDriver ();	
			d.manage().window().maximize();
			d.get("https://webdriveruniversity.com/Actions/index.html");
			
			WebElement source = d.findElement(By.id("draggable"));
			WebElement target = d.findElement(By.id("droppable"));
			Actions a= new Actions (d);
			//a.dragAndDrop(source, target).perform();==>1.way to do drag&drop
			a.clickAndHold(source).moveToElement(target).release();//release(wt)
			
			a.perform();
			WebElement dou = d.findElement(By.id("double-click"));
			a.doubleClick(dou).perform();
			
			WebElement Hold = d.findElement(By.id("click-box"));
			a.clickAndHold( Hold).perform();
			
			
			
	}

}
