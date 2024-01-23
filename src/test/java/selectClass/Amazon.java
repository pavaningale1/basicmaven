package selectClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.amazon.in/");
	Thread.sleep(2000);
	}

}
