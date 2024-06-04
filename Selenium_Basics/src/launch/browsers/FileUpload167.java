package launch.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload167 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement firstname=	driver.findElement(By.xpath("//input[@id='fname']"));
		firstname.sendKeys("ranjit");
		WebElement lastname=	driver.findElement(By.xpath("//input[@id='lname']"));
		lastname.sendKeys("bhagwat");
		WebElement mail=	driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("ranjitbhagwat007@gmail.com");
		WebElement pass=	driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("@.com");
		//WebElement gender=	driver.findElement(By.linkText("Male"));
		//gender.click();
		WebElement skill=	driver.findElement(By.id("Skills"));
		Select s1= new Select(skill);
		s1.selectByVisibleText("Technical Skills");
		WebElement ctry=	driver.findElement(By.id("Country"));
		Select s2= new Select(ctry);
		s2.selectByVisibleText("India");
		WebElement prsntadd=	driver.findElement(By.id("Present-Address"));
		prsntadd.sendKeys("mumbai");
		WebElement prmntadd=	driver.findElement(By.id("Permanent-Address"));
		prmntadd.sendKeys("satara");
		WebElement pcode=	driver.findElement(By.id("Pincode"));
		pcode.sendKeys("415509");
		WebElement caste=	driver.findElement(By.id("Relegion"));
		Select s3= new Select(caste);
		s3.selectByVisibleText("Hindu");
		WebElement docUplod=	driver.findElement(By.id("file"));
		docUplod.sendKeys("C:\\Users\\Shree\\OneDrive\\Desktop\\My photo.jpg");
		WebElement rlct=	driver.findElement(By.id("relocate"));
		rlct.click();
		WebElement sbmt=	driver.findElement(By.name("Submit"));
		sbmt.click();
		
		
		
		
	}

}
