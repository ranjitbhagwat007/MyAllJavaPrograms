package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JASM_LocateElement {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		driver.findElement(By.id("1")).sendKeys("ranjitbhagwat");
		driver.findElement(By.id("2")).sendKeys("My Name");
		driver.findElement(By.id("3")).sendKeys("xyz");
		driver.findElement(By.name("fname")).sendKeys("ranjit");
		driver.findElement(By.name("name1")).click();
		driver.findElement(By.name("name2")).click();
		driver.findElement(By.name("name3")).click();
		




	}

}
