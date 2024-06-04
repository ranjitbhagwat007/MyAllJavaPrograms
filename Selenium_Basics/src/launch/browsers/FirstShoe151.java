package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstShoe151 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=	driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		WebElement srch1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		srch1.click();
		}

}
