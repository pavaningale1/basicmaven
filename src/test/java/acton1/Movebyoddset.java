package acton1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movebyoddset {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		
		Actions a=new Actions (d);
		a.moveByOffset(400, 0).contextClick().perform();
		
	}

}
