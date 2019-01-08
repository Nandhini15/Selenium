package cts.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	public static void sendKeys(WebElement e, String s) {
		e.sendKeys(s);
	}
	public static void click(WebElement button) {
		button.click();
	}
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	public static void forward(WebDriver driver) {
		driver.navigate().forward();
	}
	public static void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	public static Actions getActionObj(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}
	public static void actionDblClick(WebElement e, Actions a) {
		a.doubleClick(e).perform();
	}
	public static void actionContextClick(WebElement e, Actions a) {
		a.contextClick(e).perform();
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
	public static Robot getRobotObj() throws AWTException {
		Robot r = new Robot();
		return r;
	}
//	public static void keyPress(Robot r) {
//		r.keyPress(KeyEvent.VK_DOWN);
//	}
//	public static void keyRelease(Robot r) {
//		r.keyRelease(KeyEvent.VK_DOWN);
//	}
}
