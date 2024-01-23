package day1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraBeautyTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		WebElement dc = d.findElement(By.id("search"));
		dc.sendKeys("perfume");
		dc.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Category']")).click();
		d.findElement(By.xpath("//div[text()=' Mens Perfumes (EDT & EDP) ']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Ajmal Silver Shade Eau De Perfume (100ml)']")).click();
		Thread.sleep(2000);
		Set<String> ids=d.getWindowHandles();
		for (String a:ids)
		 {
		String title=d.switchTo().window(a).getTitle();
			 
		 }
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(2000);
		d.findElement(By.className("cart-count")).click();
		
		
		File temp = d.getScreenshotAs(OutputType.FILE);
		File loc= new File("./Terabeauti/bag.png");
		FileUtils.copyFile(temp, loc);
//		
//		for (String b:ids) {
//			String title=d.switchTo().window(b).getTitle();
//			System.out.println(title);
//			
//			String parenttitle = "Mens Perfumes (EDT & EDP) | Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com";
//			
//			if(title.contains(parenttitle)) {
//				break;
//			}
//		}
		//d.findElement(By.xpath("//span[text()='Brand']")).click();		
		 
	}
}

