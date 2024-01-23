package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement Droplanguage = d.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		
		Actions ac=new Actions(d);
		ac.moveToElement(Droplanguage).perform();
		Thread.sleep(3000);
		
		d.findElement(By.xpath("(//div[text()='Change country/region.'])[1]")).click();
		Thread.sleep(3000);
		WebElement lang = d.findElement(By.id("icp-dropdown"));
		
		Select sc=new Select(lang);
		sc.selectByVisibleText("India");
		
		 WebElement Ind=d.findElement(By.cssSelector("a[class='a-dropdown-link a-active']"));
		 Ind.sendKeys(Keys.ENTER);
	
	}
		
}


