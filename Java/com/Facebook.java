package cts.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook extends BaseClass {
	

	public static void main(String[] args) throws AWTException {

		
		WebDriver driver 
	= getDriver("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		sendKeys(txtUser, "nandhininandhu");
////
//		WebElement txtUser1 = driver.findElement(By.id("pass"));
//		sendKeys(txtUser1, "nandhini@1234");
//		WebElement btnLogin = driver.findElement(By.xpath("//input[@aria-label='Log In']"));
//		click(btnLogin);
////		
//		back(driver);
//		forward(driver);
//		refresh(driver);
//		
//		driver.navigate().to("https://mail.google.com/");
//		WebElement findElement = driver.findElement(By.xpath("//h2[text()='Sign Up']"));
//        String text = findElement.getText();
//        System.out.println(text);
//        System.out.println(findElement.getAttribute("class"));
//        WebElement find = driver.findElement(By.xpath("//div[@class='mbl _3m9 _6o _6s _mf']"));
//        System.out.println(find.getText());
//      
		Actions a = getActionObj(driver);
//        Actions a = new Actions(driver);
       actionDblClick(txtUser, a);
       actionContextClick(txtUser, a);
//        
//        Robot r = new Robot();
          Robot r = getRobotObj();
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN) ;
//     
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        
//        a.click(txtUser1).perform();
//        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_V);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        r.keyRelease(KeyEvent.VK_V);
//        
//       WebElement element = driver.findElement(By.id("day"));
//	   Select s = new Select(element);
//	   s.selectByIndex(4);
//	   s.selectByValue("5");
//	   s.selectByVisibleText("5");
////	   s.deselectAll();
////	   s.deselectByIndex(4);
////	   s.deselectByValue("5");
////	   s.deselectByVisibleText("5");
//	   List<WebElement> options = s.getOptions();
//	   for(WebElement w : options) {
//		   System.out.println(w.getText());
//		   System.out.println(w.getAttribute("value"));
//	   }
//	   s.selectByIndex(4);
//		s.selectByIndex(5);
//		s.selectByIndex(6);
//		
//		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
//		WebElement firstSelectedOption = s.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//		
//		boolean multiple = s.isMultiple();
//		
//		System.out.println(multiple);
//		
	quit(driver);
	   
	}

}
