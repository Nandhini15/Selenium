package cts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTrail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        
		WebElement e1 = driver.findElement(By.id("firstName"));
		e1.sendKeys("Testing");
		WebElement e2 = driver.findElement(By.id("lastName"));
		e2.sendKeys("Username");
		WebElement e3 = driver.findElement(By.id("username"));
		e3.sendKeys("userTesting");
		WebElement e4 = driver.findElement(By.xpath("//input[@name='Passwd']"));
		e4.sendKeys("userPassword");
		WebElement e5 = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		e5.sendKeys("userPassword");
		WebElement e6 = driver.findElement(By.xpath("//span[text()='Next']"));
		e6.click();
		WebElement e7 = driver.findElement(By.id("usernameList"));
		e7.click();
		
	}

}
