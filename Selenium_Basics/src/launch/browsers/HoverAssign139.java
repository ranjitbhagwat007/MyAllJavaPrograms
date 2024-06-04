package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAssign139 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
		WebElement wb=	driver.findElement(By.linkText(" Demo1"));
		/*Actions a1= new Actions(driver);
		a1.moveToElement(wb).perform();
		WebElement signin=	driver.findElement(By.xpath("//span[@class='popup4']"));
		signin.click(); */
	}

}
