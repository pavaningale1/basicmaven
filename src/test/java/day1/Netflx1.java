package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.netflix.com/in/");
		//d.findElement(By.id("a7fb2494913b0")).sendKeys("pavaningale100@gmail.com");
		 d.findElement(By.name("email")).sendKeys("pavaningale100@gmail.com");

	}

}
