package acton1;



	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.time.LocalDateTime;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon {

		public static void main(String[] args) throws InterruptedException, IOException {
			LocalDateTime td=LocalDateTime.now();
			String timedate=td.toString().replace(":", "-");
			ChromeDriver c=new ChromeDriver();
			c.manage().window().maximize();
			c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.get("https://www.amazon.com/");
			Thread.sleep(2000);
			WebElement stf=c.findElement(By.id("twotabsearchtextbox"));
			stf.sendKeys("watches");
			stf.sendKeys(Keys.ENTER);
			c.findElement(By.xpath("//img[@alt='Casio F91W-1 Classic Resin Strap Digital Sport Watch']")).click();
			c.findElement(By.id("color_name_1")).click();
			Thread.sleep(2000);
			File tempfile=c.getScreenshotAs(OutputType.FILE);
			File destination=new File("./Watches/image "+timedate+".png");
			FileUtils.copyFile(tempfile, destination);
			Thread.sleep(2000);
			
			c.findElement(By.id("color_name_2")).click();
			Thread.sleep(2000);
			File tempfile1=c.getScreenshotAs(OutputType.FILE);
			File destination1=new File("./Watches/image1 "+timedate+".png");
			FileUtils.copyFile(tempfile1, destination1);
			Thread.sleep(3000);
			c.findElement(By.id("color_name_3")).click();
			Thread.sleep(2000);
			File tempfile2=c.getScreenshotAs(OutputType.FILE);
			File destination2=new File("./Watches/image2 "+timedate+".png");
			FileUtils.copyFile(tempfile2, destination2);
			Thread.sleep(8000);
			c.quit();
			
			
			
			

		}

	}
	


