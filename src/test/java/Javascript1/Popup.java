package Javascript1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		//d.manage().window().maximize();
		d.get("https://Amazon.com/");
		Thread.sleep(2000);
		//d.executeScript("window.alert('hiii')");//alert type popup
		//d.executeScript("window.confirm('welcom to my world')");
		//d.executeScript("window.prompt('enter ur name')");
	   d.executeScript("window.scrollBy(100,0)");
		//d.executeScript("window.scrollBy(0,990)");
		Thread.sleep(2000);
		//d.executeScript("window.scrollBy(0,-600)");
		
		
		
		
	
	
	}

}
