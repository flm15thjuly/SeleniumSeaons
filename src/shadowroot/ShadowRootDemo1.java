package shadowroot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowRootDemo1 {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void shadowDomTest() throws InterruptedException, IOException, AWTException {

		WebElement shadowHost1= driver.findElement(By.xpath("//div[@id='shadow_host']"));
				
		SearchContext shadowRoot1=shadowHost1.getShadowRoot();
		
		WebElement element=shadowRoot1.findElement(By.cssSelector("input[type='text']"));
		
		element.sendKeys("selenium");
		
		

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}


}
