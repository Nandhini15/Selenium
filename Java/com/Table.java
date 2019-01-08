package cts.com;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vino\\eclipse\\java-oxygen\\Facebook\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-table/");
        driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);
      //WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
       List<WebElement> rows = driver.findElements(By.tagName("tr"));
       System.out.println(rows.size());
       for(WebElement row:rows) {
    	   List<WebElement> column = row.findElements(By.tagName("td"));
    	   for(WebElement col:column) {
    		   System.out.println(col.getText());
    	   }
       }
        
		driver.quit();
	}
}