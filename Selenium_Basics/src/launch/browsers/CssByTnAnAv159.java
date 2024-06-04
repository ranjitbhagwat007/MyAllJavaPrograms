package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssByTnAnAv159 {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement srch=	driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
	}

}
