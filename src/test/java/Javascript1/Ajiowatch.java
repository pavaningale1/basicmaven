package Javascript1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajiowatch {
public static void main(String[] args) throws InterruptedException {

	ChromeDriver d=new ChromeDriver ();
	d.get("https://www.ajio.com/");
	d.manage().window().maximize();
	WebElement dc = d.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']"));
	
	dc.sendKeys("Watches");
	dc.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	for(;;)
	{
		try {
			d.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCN00051E']")).click();
			break;
		}catch(NoSuchElementException a)
		{
			d.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	}
	
}

}
