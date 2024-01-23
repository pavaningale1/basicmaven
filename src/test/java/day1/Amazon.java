package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		d.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(2000);
		WebElement land = d.findElement(By.xpath("//div[text()='EN']"));
		Thread.sleep(2000);
		Actions a=new Actions(d);
		a.moveToElement(land).perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[text()='Change country/region.'])[1]")).click();
		WebElement langdrop = d.findElement(By.id("icp-dropdown"));
		Thread.sleep(2000);
		 Select s=new Select(langdrop);
		 boolean langdrop1 = s.isMultiple();
		 System.out.println(langdrop1);
		}

}
