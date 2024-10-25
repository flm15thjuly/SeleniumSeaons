package hanldingwindowsalertsframes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
	}
	@Test(description="To validate alert handling of guru99 bank")
	public void alertTest()
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr589366");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("yjahunA");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(alert.getText(), "Customer does not exist!!");
		alert.accept();
	}
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
