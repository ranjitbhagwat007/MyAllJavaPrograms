package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath133 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement wb1=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wb1.sendKeys("shoe");
		wb1.sendKeys(Keys.ENTER);
	}

}
