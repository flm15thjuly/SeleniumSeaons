package sep25th;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods3 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		URL url=new URL("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().to(url);
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		//driver.quit();
		

	}

}
