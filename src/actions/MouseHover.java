package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.kvb.co.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mouseHoverTest()
	{
	
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Personal']")))
		         .pause(3000)
				 .moveToElement(driver.findElement(By.xpath("//a[text()='Loans ']")))
				 .pause(2000)
				 .click(driver.findElement(By.xpath("//a[text()='Two Wheeler Loan']")))
				  .perform();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}
