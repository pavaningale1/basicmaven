package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right = d.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions a=new Actions(d);
		a.contextClick(right).perform();
		
	}
}
