package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement buttom = d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
		Actions a=new Actions(d);
		a.doubleClick(buttom).perform();
		
	
	}

}
