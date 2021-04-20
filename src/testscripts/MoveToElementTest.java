package testscripts;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class MoveToElementTest {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
//		Using Actions class
//		WebElement obj = driver.findElement(By.xpath("//a[contains(text(),'Components')]"));
//  		Actions action = new Actions(driver);
//		action.moveToElement(obj).perform();
//		driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
		
//		Using SendKeys Method
		WebElement sch = driver.findElement(By.xpath("//input[@name='search']"));
		sch.sendKeys(Keys.chord(Keys.SHIFT,"P"));
		sch.sendKeys(Keys.chord("hone"));
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcfile = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\Admin\\Pictures\\seleniumscreenshot\\sample.png"));
//		sch.sendKeys(Keys.ENTER);
//	    sch = driver.findElement(By.xpath("//input[@name='search']"));
//		sch.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(1000);
//		sch.sendKeys(Keys.PAGE_UP);
//		Thread.sleep(1000);
//		sch.sendKeys(Keys.BACK_SPACE);
//		sch.clear();
//		Thread.sleep(2000);
		
		
	//	Using Robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_T);
        
		
		driver.quit();

	}

}
