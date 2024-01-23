package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectbyVistable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement month = d.findElement(By.id("month"));
		
		Select s=new Select (month);
		List<WebElement> allmonth = s.getOptions();
		for(WebElement a: allmonth) {
			System.out.println(a.getAttribute("value"));
		  s.selectByValue(a.getAttribute("value"));
		}
	}

}
