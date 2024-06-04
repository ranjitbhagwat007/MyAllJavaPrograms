package launch.browsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign164 {

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
		
		driver.switchTo().window(childId);
		WebElement wishlist=	driver.findElement(By.xpath(	"//a[@class='a-button-text a-text-left']"));
		wishlist.click();
		WebElement email=	driver.findElement(By.id("ap_email"));
		email.sendKeys("ranjitbhagwat007@gmail.com");
		WebElement continuebtn=	driver.findElement(By.id("continue"));
		continuebtn.click();
		WebElement pass=	driver.findElement(By.id("ap_password"));
		pass.sendKeys("xyz");
		WebElement sbmt=	driver.findElement(By.id("signInSubmit"));
		sbmt.click();	
		WebElement addToCrt=	driver.findElement(By.id("add-to-cart-button"));
		addToCrt.click();
		WebElement buyNow=	driver.findElement(By.name("proceedToRetailCheckout"));
		buyNow.click();

		
	}

}
