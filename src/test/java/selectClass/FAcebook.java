package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FAcebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		WebElement date = d.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		WebElement month = d.findElement(By.id("month"));
	     Thread.sleep(2000);
	 Select s= new Select (month);
		 s.selectByVisibleText("Sep");
		//-----------------------------------------------
		
		Select s1=new Select (date);
		s1.selectByVisibleText("11");
   
		WebElement year = d.findElement(By.id("year"));
		Select s2=new Select (year);
		s2.selectByVisibleText("1999");


	}

}
