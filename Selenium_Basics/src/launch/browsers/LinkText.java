package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		WebElement gmail= driver.findElement(By.linkText("Best Sellers"));
		gmail.click();

		
		
		
	}

}
