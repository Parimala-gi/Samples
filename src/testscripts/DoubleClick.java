package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		WebElement dbl = driver.findElement(By.xpath("//button[contains(text(),'Click Me / Double Click Me!')]"));
		Actions action = new Actions(driver);
   	    action.doubleClick(dbl).perform();
   	    Thread.sleep(2000);
        dbl.click();
        Thread.sleep(2000);
        action.contextClick(dbl).perform();
        driver.close();
	}

}
