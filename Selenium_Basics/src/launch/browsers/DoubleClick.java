package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement wb=	driver.findElement(By.linkText("Gmail"));
		Actions a1= new Actions(driver);
		a1.doubleClick(wb).perform();
	}

}
