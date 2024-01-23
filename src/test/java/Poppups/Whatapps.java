package Poppups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatapps {
public static void main(String[] args) {
	WebDriver d=new  ChromeDriver (); 
	d.manage().window().maximize();
	d.get("https://demo.guru99.com/test/upload");
	d.findElement(By.xpath("uploadfile_0")).click();
	
	
	
}
}
