package screenShort;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage2 {
	  public static void main(String[] args) {
	    LocalDateTime ldt=LocalDateTime.now();
	    String timedate=ldt.toString().replace(":","-");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.primevideo.com/");
		//call method getscreenshot &shore in file form 
		File sc = d.getScreenshotAs(OutputType.FILE);// output its an interface
		
		
		
		//create obj of file
		File loaction=new File("./ScreenShot/netflex"+timedate+".png");
		
		
		
		// screenshot is moving from sc to location
		sc.renameTo(loaction);
		 // every time refresh 
		

	}


	} 


