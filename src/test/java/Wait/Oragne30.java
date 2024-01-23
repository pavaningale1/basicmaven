package Wait;

import org.openqa.selenium.chrome.ChromeDriver;

public class Oragne30 {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.orangehrm.com/en/30-day-free-trial/");
		
	}

}
