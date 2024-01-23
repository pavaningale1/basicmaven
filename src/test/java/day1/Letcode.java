package day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/windows");
		Thread.sleep(3000);
		d.findElement(By.id("multi")).click();
		 Set<String> ids= d.getWindowHandles();
		  
		 for(String a:ids)
		 {
			 String all = d.switchTo().window(a).getCurrentUrl();
			 String childone = "https://letcode.in/alert";
			  if(all.contains(childone))
			  {
				  break;
			  }
			  
		 }
		 d.findElement(By.id("accept")).click();
		 Thread.sleep(2000);
		 //d.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 for(String a:ids)
		 {
			 String all = d.switchTo().window(a).getCurrentUrl();
			 //String childone = "https://letcode.in/dropdowns";
			  if(all.contains("https://letcode.in/dropdowns"))
			  {
				  break;
			  }
			  
		 }
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//option[text()='Aquaman']")).click();
		
	
		
	}

}
