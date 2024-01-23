package Getioption;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oranfehrm {
	public static void main(String[] args) {

		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.orangehrm.com/en/30-day-free-trial/");
		 WebElement drop = d.findElement(By.id("Form_getForm_Country_Holder"));
		 
		 Select s=new Select(drop);
		 
		 List<WebElement> coount = s.getOptions();
		 System.out.println(coount);
		 for(WebElement a: coount)
		 {
			 System.out.println(a.getText());
		 }
	}

}
