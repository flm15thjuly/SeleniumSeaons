package sep24th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
