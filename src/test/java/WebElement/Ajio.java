package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver d=new ChromeDriver ();
		d.get("https://www.ajio.com/");
		d.manage().window().maximize();
		WebElement dc = d.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
		
		dc.sendKeys("bag");
		dc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
