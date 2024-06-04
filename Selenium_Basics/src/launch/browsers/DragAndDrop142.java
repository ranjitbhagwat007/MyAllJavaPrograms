package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop142 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop");
		//WebElement drag=	driver.findElement(By.xpath("(//span[.='div1'])[7]"));
		//WebElement drop=	driver.findElement(By.xpath("//span[.='div2']"));
		WebElement drag=	driver.findElement(By.id("drag7"));
		WebElement drop=	driver.findElement(By.id("div2"));
		Thread.sleep(2000);
		Actions a1= new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		//Actions a2= new Actions(driver);
		Thread.sleep(2000);
		a1.dragAndDrop(drop, drag).perform();
	}

}
