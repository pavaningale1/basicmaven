package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		d.get("https://demoapp.skillrary.com");
	//	Thread.sleep(2000);
		 d.findElement(By.xpath("//a[text()='LOGIN']")).click();
		// Thread.sleep(2000);
		 WebElement Email = d.findElement(By.id("email"));
		/// Thread.sleep(2000);
		 Email.sendKeys("admin");
		// Thread.sleep(2000);
		 Email.sendKeys(Keys.ENTER);
		 
		 WebElement Password = d.findElement(By.id("password"));
		// Thread.sleep(2000);
	     
		 Password.sendKeys("admin");
		 Password.sendKeys(Keys.ENTER);
		// Thread.sleep(2000);
		 
		
		 d.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		// Thread.sleep(2000);
		 
		 d.findElement(By.xpath("//a[text()='Sign out']")).click();
		 //Thread.sleep(2000);
		 
	}

}
