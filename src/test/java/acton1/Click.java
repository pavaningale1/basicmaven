package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/radio.html");
		WebElement radio = d.findElement(By.id("vfb-7-2"));
		
		
		Actions a=new Actions(d);
		a.click(radio).perform();
	}

}
