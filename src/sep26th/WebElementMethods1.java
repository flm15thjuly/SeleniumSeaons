package sep26th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//WebElement usernametextbox=driver.findElement(By.id("username"));
		
		//usernametextbox.sendKeys("reyaz0806");
		
		driver.findElement(By.id("username")).sendKeys("reyaz0806");
		
		driver.findElement(By.name("password")).sendKeys("reyaz123");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepick_in")).clear();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepick_in")).sendKeys("29/09/2024");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
