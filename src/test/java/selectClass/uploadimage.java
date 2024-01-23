package selectClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadimage {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://imgbb.com/");
		d.findElement(By.cssSelector("a[class='btn btn-big blue']")).click();
		Runtime.getRuntime().exec("‪C:\\Users\\avani\\OneDrive\\Desktop\\GOJO.au3");

	}

}
