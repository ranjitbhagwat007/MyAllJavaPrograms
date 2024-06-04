package launch.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pharmacy150 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pharmeasy.in");
		WebElement srch=	driver.findElement(By.xpath("//input[@id='topBarInput']"));
			srch.sendKeys("Diclo");
			//Thread.sleep(2000);
			List<WebElement> autoSuggestion=	driver.findElements(By.xpath("//input[@id='topBarInput']"));
			int count =autoSuggestion.size();
			System.out.println(count);
			//autoSuggestion.get(4).click();
	}

}
