package Poppups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Justdail1 {
	public static void main(String[] args) {
		
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(op);
		d.get("https://mcdelivery.co.in/");
		d.manage().window().maximize();
	
	}

}
