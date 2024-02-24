package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlcontrols {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		WebElement hindi =driver.findElement(By.id("hindichbx"));
		hindi.click();  // radio button selected
		if(hindi.isSelected())
		{
			hindi.click(); // radio button unselected
			Thread.sleep(3000);
			
		}
      driver.findElement(By.id("registerbtn")).click();
      String text = driver.findElement(By.id("msg")).getText();
      System.out.println(text);
      
	}

}
