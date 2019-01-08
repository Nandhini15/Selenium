package cts.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facetrail1 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amaresh\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dnD = driver.findElement(By.id("day"));
		
		Select s=new Select(dnD);
		
		/*s.selectByIndex(4);
		s.selectByVisibleText("9");
		s.selectByValue("2");
		s.selectByValue("3");
		s.selectByValue("4");
		
		s.deselectByValue("3");
		s.deselectByIndex(4);
		s.deselectByVisibleText("9");
		s.deselectAll();*/
		
		List<WebElement> options = s.getOptions();
		
		for(WebElement w:options)
		{
			System.out.println(w.getText());
			System.out.println(w.getAttribute("value"));
			
		}
		
	}
}
		