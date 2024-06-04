package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown137 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement wb1=	driver.findElement(By.id("Choice1"));
		Select s1= new Select(wb1);
		s1.selectByVisibleText("Demo2");
		WebElement wb2=	driver.findElement(By.id("Choice9"));
		Select s2= new Select(wb2);
		s2.selectByValue("SQL9");
	}

}
