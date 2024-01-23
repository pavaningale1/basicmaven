package Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXSkillaray {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver ();	
		d.manage().window().maximize();
		d.get("https://skillrary.com/");
		String Current = d.getCurrentUrl();
		System.out.println(Current);
		
		String actual = "https://skillrary.com/";
		
		if (Current.equals(actual))
		{
			System.out.println("matching");
		
		}
		else
		{
			System.out.println("not matching");
		}
		
		
	}

}
