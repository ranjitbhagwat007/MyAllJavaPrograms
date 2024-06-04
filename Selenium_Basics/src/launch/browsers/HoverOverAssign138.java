package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverAssign138 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement wb=	driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a1= new Actions(driver);
		a1.moveToElement(wb).perform();
		WebElement shirt=	driver.findElement(By.className("_3490ry"));
		Thread.sleep(2000);
		shirt.click();

	}

}
