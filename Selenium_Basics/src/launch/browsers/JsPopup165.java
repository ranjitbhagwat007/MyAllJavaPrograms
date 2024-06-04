package launch.browsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopup165 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();//it handles JS PopUP alerts
		
	}

}
