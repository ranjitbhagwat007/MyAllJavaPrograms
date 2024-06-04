package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown135 {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement wb1=	driver.findElement(By.id("twotabsearchtextbox"));
		wb1.sendKeys("shoe");
		wb1.sendKeys(Keys.ENTER);
		WebElement wb2=	driver.findElement(By.linkText("Featured"));
		Select s2= new Select(wb2);
		s2.selectByValue("Price: Low to High");
	}

}
