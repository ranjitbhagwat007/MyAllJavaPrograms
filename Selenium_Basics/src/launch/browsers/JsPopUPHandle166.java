package launch.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class JsPopUPHandle166 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();//it handles JS PopUP alerts
	}

}
