package Javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
public static void main(String[] args) throws InterruptedException {

	ChromeDriver d=new ChromeDriver ();
	d.get("https://www.ajio.com/");
	d.manage().window().maximize();
	WebElement dc = d.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
	
	dc.sendKeys("perfum");
	dc.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	for(;;) {
		try {
	d.findElement(By.xpath("//div[text()='Together for Her Eau de Toilette - 50 ml']")).click();
	break;
		}catch(NoSuchElementException a) {
			d.executeScript("window.scrollBy(0,900)");
			
		}
	}
}

}
