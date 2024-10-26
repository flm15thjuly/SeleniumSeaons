package fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadDemo1 {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void fileUploadTest() throws InterruptedException, IOException, AWTException {

		
		driver.findElement(By.xpath("//span[text()='New post']/preceding-sibling::img")).click();
		
		driver.findElement(By.xpath("//label[text()='Choose Photo/Video']/child::img")).click();
		
		Thread.sleep(3000);
		
		String filePath="D:\\FLM15thJulyWS\\SeleniumSeasons\\Xpath writing Techniques.png";
		
		StringSelection selection=new StringSelection(filePath);
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		Clipboard  clipboard=toolkit.getSystemClipboard();
		
		clipboard.setContents(selection, null);
		
		//Robot class 
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
				

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
