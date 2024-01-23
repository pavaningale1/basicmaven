package Poppups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoit {





	
	public static void main(String[] args) {
		
		WebDriver cd = new ChromeDriver();
	    cd.manage().window().maximize();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    cd.get("https://www.google.com/");
	    
	    WebElement textfield = cd.findElement(By.id("APjFqb"));
	    textfield.sendKeys("AutoIt Downloads");
	    textfield.sendKeys(Keys.ENTER);
	    
	    cd.findElement(By.xpath("//h3[text()='AutoIt Downloads']")).click();
	    cd.findElement(By.cssSelector("img[title='Download AutoIt']")).click();
	}

	
		
	}



