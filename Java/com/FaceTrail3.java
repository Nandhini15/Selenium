package cts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceTrail3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@aria-label = 'First name']"));
        ele1.sendKeys("Testing");
        WebElement ele2 = driver.findElement(By.xpath("//input[@aria-label = 'Last name']"));
        ele2.sendKeys("Username");
        WebElement ele3 = driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email']"));
        ele3.sendKeys("5149178434");
        WebElement ele4 = driver.findElement(By.xpath("//input[@aria-label = 'New password']"));
        ele4.sendKeys("TestingPassword");
        
        WebElement ele5 = driver.findElement(By.id("month"));
        Select s = new Select(ele5);
        s.selectByValue("10");
        WebElement ele6 = driver.findElement(By.id("day"));
        Select m = new Select(ele6);
        m.selectByValue("15");
        WebElement ele7 = driver.findElement(By.id("year"));
        Select n = new Select(ele7);
        n.selectByValue("2000");
        WebElement ele8 = driver.findElement(By.xpath("//input[@value='1']"));
        ele8.click();
        WebElement ele9 = driver.findElement(By.name("websubmit"));
        ele9.click();
        
	}

}
