package screenShort;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.netflix.com/in/");
		//call method getscreenshot &shore in file form 
		File sc = d.getScreenshotAs(OutputType.FILE);// output its an interface
		//to get the location where the sc is save 
		//System.out.println(sc.getAbsolutePath()); it temparty solu
		//Thread.sleep(100000);
	
		
		
		//create obj of file
		File loaction=new File("./ScreenShot/netflex.png");
		
		
		
		// screenshot is moving from sc to location
		sc.renameTo(loaction);
		 // every time refresh 
		

	}

}
