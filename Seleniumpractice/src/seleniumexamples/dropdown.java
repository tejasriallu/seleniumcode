package seleniumexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(30000);
		WebElement course= driver.findElement(By.id("course"));
		Select dropdown = new Select(course);
		List<WebElement> options = dropdown.getOptions();
		Thread.sleep(3000);
		for(WebElement st :options)
		{
			System.out.println(st.getText());
		}
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		dropdown.selectByValue("net");
		

	}

}
