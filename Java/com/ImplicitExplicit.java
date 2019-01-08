package cts.com;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement alertBtn = driver.findElement(By.id("alert"));
        alertBtn.click();
   
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert a = driver.switchTo().alert();
        a.accept();

	
	driver.quit();
	}

}
