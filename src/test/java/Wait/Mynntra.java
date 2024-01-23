package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mynntra {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.get("https://www.myntra.com/");
		

		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("perfume");
		 ser.sendKeys(Keys.ENTER);
		 WebDriverWait w=new WebDriverWait(d,Duration.ofSeconds(10));
		 String actual = d.getCurrentUrl();
		  String excep = "https://www.myntra.com/perfume?rawQuery=perfume";
		 w.until(ExpectedConditions.urlToBe(excep));
		 System.out.println(actual);
		 
	}

}
