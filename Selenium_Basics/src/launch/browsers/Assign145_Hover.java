package launch.browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign145_Hover {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		/*WebElement wb=	driver.findElement(By.xpath("//span[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(wb).perform();*/
	}

}
