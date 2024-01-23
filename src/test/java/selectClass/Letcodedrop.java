package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcodedrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver ();	
	d.manage().window().maximize();
	d.get("https://letcode.in/test");
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[text()='Drop-Down']")).click();
	WebElement ID = d.findElement(By.id("superheros"));
	Select s=new Select (ID);
	s.selectByVisibleText("Green Lantern");
	s.selectByVisibleText("Ghost Rider");
	//System.out.println(s.getFirstSelectedOption().getText());
	List<WebElement> all = s.getAllSelectedOptions();
	System.out.println(all);
	
	for(WebElement a: all)
	{
		System.out.println(a.getText());
	}
	
  }

}
