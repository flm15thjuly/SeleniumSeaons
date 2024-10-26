package webtables;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTabledynamic {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void webTableTest() throws InterruptedException, IOException {

		
			WebElement table=driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody"));
			
			List<WebElement>  allRows=table.findElements(By.tagName("tr"));
			
			for(WebElement row:allRows)
			{
				List<WebElement> allCols=row.findElements(By.tagName("td"));
				for(WebElement col:allCols)
				{
					System.out.print(col.getText()+"\t");
				}
				System.out.println();
			}
				

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

}
