package screenShort;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PantloonSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		LocalDateTime idt=LocalDateTime.now(); 
		String locakDateTime= idt.toString().replace(":", "-");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		
		
		File temp=d.getScreenshotAs(OutputType.FILE);
		File loaction= new File("./pantaloons/fristpage"+locakDateTime+".png");
		FileUtils.copyFile(temp, loaction);
		Thread.sleep(2000);
		WebElement search = d.findElement(By.cssSelector("input[placeholder='Search for products and more...']"));
		search.sendKeys("wallets");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		File temp2=d.getScreenshotAs(OutputType.FILE);
		File loaction2= new File("./pantaloons/secoondpage"+locakDateTime+".png");
		FileUtils.copyFile(temp2, loaction2);
		d.findElement(By.xpath("(//div[text()='Peter England'])[2]")).click();
		

		File temp3=d.getScreenshotAs(OutputType.FILE);
		File loaction3= new File("./pantaloons/Thiredpage"+locakDateTime+".png");
		FileUtils.copyFile(temp3, loaction3);
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		
		d.findElement(By.cssSelector("svg[width='30']")).click();
		File temp4=d.getScreenshotAs(OutputType.FILE);
		File loaction4= new File("./pantaloons/Fourthpage"+locakDateTime+".png");
		FileUtils.copyFile(temp4, loaction4);
		
		
	
	
	}

}
