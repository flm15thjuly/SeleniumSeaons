package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("no of links "+allLinks.size());
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
		driver.quit();
		
	}

}
