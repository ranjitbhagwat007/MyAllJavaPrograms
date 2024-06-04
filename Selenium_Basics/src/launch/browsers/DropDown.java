package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement wb=	driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(wb);
		//s1. selectByVisibleText("Watches");
		//s1.selectByValue("search-alias=stripbooks")
		s1.selectByIndex(15);
		
	}

}
