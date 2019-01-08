package cts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FigiTrail extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
//		driver.get(
//				"https://www.figidigitalmedia.figicorp.com/app/login");
//		WebElement element1 = driver.findElement(By.name("login"));
//		element1.sendKeys("nandhini");
//		WebElement element2 = driver.findElement(By.xpath("//input[@name='password']"));
//		element2.sendKeys("nandhu@123");
//		WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
//        element3.click();
        WebDriver driver = getDriver("https://www.gmail.com");
//        Thread.sleep(300);
//       driver.findElement(By.linkText("LOGIN")).click();
        driver.findElement(By.id("identifierId")).sendKeys("nandhini");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//div[text()='Enter your password']")).sendKeys("abc");
	}

}
