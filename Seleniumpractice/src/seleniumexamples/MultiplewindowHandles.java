package seleniumexamples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("parentwindow :" +parentwindowhandle+driver.getTitle());
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		Thread.sleep(1000);
		for(String windowhandle :windowhandles)
		{
			if(!windowhandle.equals(parentwindowhandle))
			{
			driver.switchTo().window(windowhandle);
		    driver.findElement(By.id("firstName")).sendKeys("Tejasree");
		    Thread.sleep(3000);
		    driver.close();
		    Thread.sleep(2000);
			}
			
		}
			driver.switchTo().window(parentwindowhandle);
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("HYR tutorials");
		
	}

	}
