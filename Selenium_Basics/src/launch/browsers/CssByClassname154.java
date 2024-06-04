package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssByClassname154 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement srch=	driver.findElement(By.cssSelector(".Pke_EE"));
		srch.sendKeys("Shoes");
		srch.sendKeys(Keys.ENTER);
	}

}
