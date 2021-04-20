
package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Keyboard.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[contains(text(),'PenDrive')]//preceding-sibling::td//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'HardDisk')]//preceding-sibling::td//input[@type='checkbox']")).click();
        driver.close();
	}
	


}