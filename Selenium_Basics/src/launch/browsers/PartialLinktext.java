package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.co.in");
		WebElement gmail= driver.findElement(By.partialLinkText("Best"));
		gmail.click();
		
	}

}
