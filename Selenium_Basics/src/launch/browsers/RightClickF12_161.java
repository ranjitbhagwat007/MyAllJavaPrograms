package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickF12_161 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login=	driver.findElement(By.className("login_button"));
		login.click();
		WebElement un=	    driver.findElement(By.id("username"));
		un.sendKeys("ABC");
		WebElement pass=	driver.findElement(By.name("password"));
		pass.sendKeys("xyz");
		WebElement captha=	driver.findElement(By.name("loginCaptchaValue"));
		captha.sendKeys("123456"); 
		
		
	}

}
