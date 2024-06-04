package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement gmail= driver.findElement(By.id("ap_email"));
		gmail.sendKeys("ranjitbhagwat007@gmail.com");
		WebElement gmail_continue= driver.findElement(By.id("continue"));
		gmail_continue.click();
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("weytrwyyue");
		WebElement gmail_signin= driver.findElement(By.id("signInSubmit"));
		gmail_signin.click();
		
	}

}
