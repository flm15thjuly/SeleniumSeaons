package javascriptexecutor;

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

public class ScrollToElement {
	
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
		
		WebElement element=driver.findElement(By.xpath("//div[text()='Sell on Pepperfry']"));
		
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
	
		//js.executeScript("arguments[0].scrollIntoView();",element);
		
		js.executeScript("arguments[0].click();",element);
		
		//element.click();
		
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	


}
