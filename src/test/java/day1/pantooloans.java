package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class pantooloans {
   public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver ();
	d.manage().window().maximize();
	d.get("https://www.pantaloons.com/");
	
}
}
