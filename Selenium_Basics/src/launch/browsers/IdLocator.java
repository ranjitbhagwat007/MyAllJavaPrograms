package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("ranjitbhagwat@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qwertereyee");
		driver.findElement(By.name("login")).click();


	}

}
