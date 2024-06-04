package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		/*driver.getTitle();	
		String title= driver.getTitle();
		System.out.println(title);*/
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//driver.findElement(By.name("btnK")).click();

	}

}
