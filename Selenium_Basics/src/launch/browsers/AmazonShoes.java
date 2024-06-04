package launch.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoes {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			srch.sendKeys("shoes");
			//Thread.sleep(2000);
			List<WebElement> autoSuggestion=	driver.findElements(By.xpath("//div[@class='two-pane-results-container]/div/div'"));
			int count =autoSuggestion.size();
			System.out.println(count);
			autoSuggestion.get(4).click();
	}

}

