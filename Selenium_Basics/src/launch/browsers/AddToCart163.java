package launch.browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart163 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement srch=	driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("shoes");
		srch.sendKeys(Keys.ENTER);
		WebElement srch1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		srch1.click();
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pcid= s1.iterator();
		String parentId= pcid.next();//first next method always gives parent id
		String childId= pcid.next();//second next method always gives child id
		System.out.println(parentId);
		System.out.println(childId);
		
		driver.switchTo().window(childId);//switches control from parent id to child id
		WebElement addToCart1=	driver.findElement(By.id("add-to-cart-button"));
		addToCart1.click();
		
		//https://grotechminds.com/registeration-form/

		

		
		
		
		
	}

}
