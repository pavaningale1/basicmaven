package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakyaa {
	public static void main(String[] args) {
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.nykaa.com/");
		WebElement serf = d.findElement(By.name("search-suggestions-nykaa"));
		serf.sendKeys("sunglass");
		serf.sendKeys(Keys.ENTER);
	}

}
