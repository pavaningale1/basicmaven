package acton1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver ();
		d.manage().window().maximize();
		d.get("https://demo.vtiger.com/vtigercrm/");
		WebElement buttom = d.findElement(By.className("button buttonBlue"));
		Actions a=new Actions (d);
		a.sendKeys(buttom,Keys.ENTER);
	}

}
