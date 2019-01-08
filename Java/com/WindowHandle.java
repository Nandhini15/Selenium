package cts.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		String mainWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		WebElement mulWin = driver.findElement(By.linkText("Open Seperate Multiple Windows"));
		mulWin.click();
		WebElement mulClick = driver.findElement(By.xpath("//button[@onclick='multiwindow()']"));
		mulClick.click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext()) {
			String childWindow = iterator.next();
			if(!mainWindow.equals(childWindow)) {
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
	}

}
