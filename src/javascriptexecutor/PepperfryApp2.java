package javascriptexecutor;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PepperfryApp2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void scrollTest() throws InterruptedException
	{
		
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//p[text()='Partner With Us']/parent::div/descendant::div"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement element=null;
		
		for(int i=0;i<allLinks.size();i++)
		{
			element=allLinks.get(i);
			js.executeScript("arguments[0].click();",element);
			Thread.sleep(2000);
			
		}
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	


}
