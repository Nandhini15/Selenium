package cts.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormValidation extends BaseClass{

	public static void main(String[] args) {
		
		WebDriver driver = getDriver(
				"https://www.toolsqa.com/automation-practice-form/");
		WebElement e1 = driver.findElement(By.name("firstname"));
		sendKeys(e1, "Testing");
		WebElement e2 = driver.findElement(By.name("lastname"));
		sendKeys(e2, "Username");
		WebElement e3 = driver.findElement(By.id("sex-1"));
		click(e3);
		WebElement e4 = driver.findElement(By.id("exp-1"));
		click(e4);
		WebElement e5 = driver.findElement(By.id("datepicker"));
		sendKeys(e5, "15/11/2000");
		WebElement e6 = driver.findElement(By.id("profession-0"));
		click(e6);
		WebElement e7 = driver.findElement(By.id("profession-1"));
		click(e7);
		WebElement e8 = driver.findElement(By.id("tool-1"));
		click(e8);
		WebElement e9 = driver.findElement(By.id("tool-2"));
		click(e9);
		WebElement e10 = driver.findElement(By.id("continents"));
		Select s = new Select(e10);
		s.selectByVisibleText("North America");
		WebElement e11 = driver.findElement(By.id("selenium_commands"));
		Select x = new Select(e11);
		x.selectByVisibleText("Browser Commands");
		x.selectByVisibleText("Navigation Commands");
		List<WebElement> options = x.getAllSelectedOptions();
		for(WebElement w: options) {
			System.out.println(w.getText());
		}
			WebElement firstSelectedOption = x.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
			boolean multiple = x.isMultiple();
			System.out.println(multiple);
			WebElement e12 = driver.findElement(By.id("submit"));
			e12.click();	
		
	}

}
