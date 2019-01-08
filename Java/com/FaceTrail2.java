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

public class FaceTrail2 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amaresh\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dnD = driver.findElement(By.id("day"));
		
		Select s=new Select(dnD);
		
		s.selectByIndex(4);
		s.selectByIndex(5);
		s.selectByIndex(6);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);	
		
				
	}

}
