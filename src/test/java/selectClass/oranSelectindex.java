package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oranSelectindex {
	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.orangehrm.com/en/30-day-free-trial/");
//		 WebElement drop = d.findElement(By.id("Form_getForm_Country_Holder"));
		 WebElement country = d.findElement(By.id("Form_getForm_Country"));
		 
		 Select s=new Select(country);
		 List<WebElement> allcounty = s.getOptions();
		 for(int i=0;i<allcounty.size();i++)
		 {
			 System.out.println(i);
			 s.selectByIndex(i);
		 }
		 
	}

}
