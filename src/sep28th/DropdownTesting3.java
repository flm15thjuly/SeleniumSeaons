package sep28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']//following-sibling::option[text()='Books']")).click();
		
		driver.findElement(By.xpath("//option[text()='Books']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("harry potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		driver.quit();
		
		
	}

}
