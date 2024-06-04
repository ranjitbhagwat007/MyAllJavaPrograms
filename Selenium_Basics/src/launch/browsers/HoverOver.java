package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement wb=	driver.findElement(By.xpath("//span[@class='nav-line-2']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(wb).perform();
		WebElement signin=	driver.findElement(By.xpath("(//span[@class='Sign in'])[1]"));
		signin.click();
			
		
	}

}
