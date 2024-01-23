package Wait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraWait {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.get("https://www.myntra.com/");
		WebDriverWait w= new WebDriverWait (d,Duration.ofSeconds(10));
		
       
		 WebElement ser = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		 ser.sendKeys("perfume");
		 ser.sendKeys(Keys.ENTER);
		 
		 Set<String> ids = d.getWindowHandles();
		 
		 for(String a:ids)
		 {
			 d.switchTo().window(a);
		 }
			 
		 d.findElement(By.cssSelector("img[alt='Park Avenue Signature Collection Voyage Amazon Woods Intense Premium Perfume Spray 120 ml']")).click();
		 String title = d.getTitle();
		  //String excpt ="Buy Park Avenue Signature Collection Voyage Amazon Woods Intense Premium Perfume Spray 120 Ml  - Body Mist And Spray for Men 17210466 | Myntra";
		 w.until(ExpectedConditions.titleContains("Buy Park Avenue Signature Collection Voyage Amazon Woods Intense"));
		// System.out.println(excpt);
//		 d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
//		 
//		 d.findElement(By.xpath("(//span[@class='desktop-userTitle'])[3]")).click();
//		 d.findElement(By.xpath("//span[text()='Bag']")).click();
		 
	}

}
