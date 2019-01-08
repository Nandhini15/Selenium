package cts.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Goibibo {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//label[@for='gi_roundtrip_label']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Dublin (DUB)");
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Dublin']"));
		element.click();
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Dublin (DUB)");
		WebElement element1 = driver.findElement(By.xpath("//span[normalize-space()='Dublin']"));
		element1.click();
		driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div/div[3]/div[1]/div[1]/div/input")).click();
		driver.findElement(By.id("fare_20190125")).click();
		driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div/div[3]/div[1]/div[2]/div/input[1]")).click();
		driver.findElement(By.id("fare_20190312")).click();
		driver.findElement(By.id("adultPaxPlus")).click();
		driver.findElement(By.id("childPaxPlus")).click();
		
}
}