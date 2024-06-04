package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssByTagname_Id155 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement srch=	driver.findElement(By.cssSelector("textarea#APjFqb"));
		srch.sendKeys("India");
		srch.sendKeys(Keys.ENTER);
	}

}
