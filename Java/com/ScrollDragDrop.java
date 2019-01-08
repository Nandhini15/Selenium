package cts.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDragDrop {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		System.out.println(element.getText());
		JavascriptExecutor exe = ((JavascriptExecutor)driver);
        exe.executeScript("arguments[0].scrollIntoView()", element);
        WebElement src = driver.findElement(By.xpath("//li[@id='credit2']"));
        System.out.println(src.getText());
        WebElement des = driver.findElement(By.id("bank"));
        System.out.println(des.getText());
        Actions a = new Actions(driver);
        a.dragAndDrop(src, des).perform();
        TakesScreenshot k = (TakesScreenshot)driver;
        File srcc = k.getScreenshotAs(OutputType.FILE);
        File desc = new File("C:\\Users\\Vino\\Desktop\\Screenshots\\Snap1");
        FileUtils.copyFile(srcc, desc);
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement promtBtn = driver.findElement(By.xpath("//button[@onclick='promptConfirm()']"));
		promtBtn.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	}

}
