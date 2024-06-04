package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin134 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement wb1=	driver.findElement(By.xpath("//input[@name='email']"));
		wb1.sendKeys("ranjitbhagwat007@gmail.com");
		Thread.sleep(2000);
		WebElement gmail_continue= driver.findElement(By.xpath("//input[@id='continue']"));
		gmail_continue.click();
		WebElement pass= driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("ranjitbhagwat007");
		WebElement signin= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();		
	}

}
