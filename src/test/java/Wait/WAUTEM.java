package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAUTEM {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		WebDriverWait waits=new WebDriverWait(d, Duration.ofSeconds(10));
		d.get("https://skillrary.com/");
		//Titl=d.getTitle();
		String Current = d.getCurrentUrl();
		
		String act = "https://skillrary.com/";
		waits.until(ExpectedConditions.urlToBe(Current));
		System.out.println(Current);
		
	}

}
