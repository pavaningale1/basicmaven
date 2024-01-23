package Poppups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://licindia.in/");
		d.findElement(By.xpath("//button[text()='Close']")).click();
		d.findElement(By.xpath("//span[contains(text(),' Pay Premium ')]")).click();
		
		//d.switchTo().alert().dismiss();
		String popuptext = d.switchTo().alert().getText();
		System.out.println(popuptext);
		d.switchTo().alert().accept();

	}

}
