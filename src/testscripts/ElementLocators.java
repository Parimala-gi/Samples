package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Testuser");
		driver.findElement(By.name("firstName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Testuser1");
		driver.findElement(By.cssSelector("#idOfButton")).click();
		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		System.out.println("Is gender selected: "+gender.isSelected());
		WebElement val = driver.findElement(By.xpath("//input[@value='Automation']"));
		System.out.println("Is Checkbox Enabled: "+val.isEnabled());
		val.click();
		System.out.println("Is Checkbox selected: "+val.isSelected());
		driver.findElement(By.xpath("//select//option[contains(text(),'Manual Testing')]")).click();
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println("No of Attributes: "+elements.size());
		for(WebElement item:elements)
		{
			System.out.println("Attribute:"+item.getAttribute("name"));
		}
		driver.findElement(By.linkText("This is a link")).click();
		driver.navigate().back();
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Current Url is: "+driver.getCurrentUrl());
        driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("Title after forward is: "+driver.getTitle());
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();

	}

}
