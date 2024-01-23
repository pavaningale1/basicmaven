package Getioption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	//WebElement date = d.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
	WebElement month = d.findElement(By.id("month"));
	Thread.sleep(2000);
	 Select s= new Select (month);
	 List<WebElement> dropdown = s.getOptions();
	 //System.out.println(dropdown);
	 
	 for(WebElement a:dropdown)
	 {
		 System.out.println(a.getText());
	 }
	
	}
	

}
