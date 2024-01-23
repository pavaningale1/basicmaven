package acton1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();
		d.manage().window().maximize();
		d.get("https://www.naukri.com/");
		
		Actions s=new Actions(d);
		s.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		s.sendKeys(Keys.PAGE_UP).perform();
		//s.sendKeys(Keys.HELP).perform();
		s.sendKeys(null, args);
	}

}
