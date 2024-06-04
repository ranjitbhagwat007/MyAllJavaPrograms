package launch.browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTheLinks {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> links=	driver.findElements(By.tagName("a"));
		int count= links.size();
		System.out.println(count); //prints the count of links present in that page
		
		for(int i=0;i<count;i++) {
			
			WebElement s1= links.get(i);
			String link= s1.getAttribute("href"); //getAttribute is a method used to get value of any attribute
			System.out.println(link);// prints the href attributes value i.e.-url
			String linkText= s1.getText(); 
			System.out.println(linkText);// prints the linkText value 
			
		}
		
		
	}

}
