package PerformonDisable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdoebn {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("file:///C:/Users/avani/OneDrive/Desktop/Drop.html");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//select[@name='dropdown'])[1]")).click();
		
	}

}
