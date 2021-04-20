package testscripts;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Java tutorial");
		Thread.sleep(2000);
		List<WebElement> eList = driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbtc']"));
		System.out.println("The items are: ");
		for(int i=0 ; i<eList.size(); i++)
		{
			System.out.println(eList.get(i).getText());
			if(eList.get(i).getText().equalsIgnoreCase("java tutorial pdf"))
			{
		    eList.get(i).click();
			break;
			}
	    }
	    
     driver.close();
}
}
