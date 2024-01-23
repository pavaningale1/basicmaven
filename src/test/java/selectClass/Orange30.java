package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange30 {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.orangehrm.com/en/30-day-free-trial/");
//		 WebElement drop = d.findElement(By.id("Form_getForm_Country_Holder"));
		 WebElement country = d.findElement(By.id("Form_getForm_Country"));
		 
		 Select s=new Select(country);
		// s.selectByVisibleText("American Samoa");
	}

}
