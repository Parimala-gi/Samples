package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDropdowntest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
//		WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']//option[@value='Saturday']"));
//		day.click();
//		boolean status = day.isDisplayed();
//		System.out.println(status);
		Select sing = new Select(driver.findElement(By.id("select-demo")));
		sing.selectByIndex(5);
		WebElement text = driver.findElement(By.xpath("//p[@class='selected-value']"));
		System.out.println("Text is:"+text.getText());
		Thread.sleep(2000);
		Select mul = new Select(driver.findElement(By.id("multi-select")));
	    System.out.println(mul.isMultiple());
	    mul.selectByVisibleText("New York");
	    mul.selectByValue("Texas");
	    mul.selectByIndex(7);
	    //System.out.println(driver.findElement(By.id("print Me")));
	    List<WebElement> mult = mul.getAllSelectedOptions();
	    System.out.println(mult.size());
	     WebElement fst= mul.getFirstSelectedOption();
	     System.out.println(fst.getText());
	    driver.close();
		
	}

}
