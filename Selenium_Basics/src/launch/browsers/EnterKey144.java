package launch.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterKey144 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> wb1=	driver.findElements(By.name("url"));
		//wb1.click();
		 wb1.get(4).click();
		 /*wb1.sendKeys("");
		wb1.sendKeys(Keys.ENTER);*/
	}

}
