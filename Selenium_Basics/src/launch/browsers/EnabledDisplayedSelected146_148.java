package launch.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledDisplayedSelected146_148 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement srch=	driver.findElement(By.name("q"));
		if(srch.isDisplayed()  && srch.isEnabled()) {
			srch.sendKeys("India");
			//Thread.sleep(2000);
			List<WebElement> autoSuggestion=	driver.findElements(By.xpath("//div[@class='OBMEnb'"));
			int count =autoSuggestion.size();
			System.out.println(count);
			autoSuggestion.get(4).click();
			
		}

		//(//a[@class='a-link-normal s-no-outline'])[1]
		//#APjFqb
		//.Pke_EE
		//textarea#APjFqb
		//textarea.gLFyf
		//[name='customerName']
		//input[id='ap_phone_number']
		//input.Pke_EE[name='q']
		//input[id^='two']
	}

}
