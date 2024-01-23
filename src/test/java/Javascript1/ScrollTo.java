package Javascript1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d=new ChromeDriver ();
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		//d.executeScript("window.scrollBy(0,9000)");
		
		//d.executeScript("window.scrollTo(0,9000)");
		d.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		d.executeScript("window.scrollTo(document.body.scrollWidth,1)");
		
		Thread.sleep(2000);
		//d.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(8000);
		
		d.close();
		
		
	}

}
