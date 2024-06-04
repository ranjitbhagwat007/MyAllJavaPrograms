package launch.browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		//EdgeDriver ed= new EdgeDriver();
		ChromeDriver driver= new ChromeDriver();//launches empty browser 
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.manage().window().minimize();

		driver.get("http://www.facebook.com");
		System.out.println(driver.getWindowHandle());//gives parent browser id
		System.out.println(driver.getWindowHandles());//gives parent & child browser id
		

	}
}

