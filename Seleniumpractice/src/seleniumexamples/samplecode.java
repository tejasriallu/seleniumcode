package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplecode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.name("q"));
		if(textbox.isEnabled())
		{
			textbox.sendKeys("sachin tendulkar");
			String enteredtext= textbox.getAttribute("value");
			System.out.println(enteredtext);
			Thread.sleep(3000);
			textbox.clear();
			textbox.sendKeys("chiranjeevi");
			driver.close();
			
		}
	    
		
		
	}
 
}
