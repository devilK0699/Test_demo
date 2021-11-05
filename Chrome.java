package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000L);
		System.out.println(driver.getTitle());
		
		Assert.assertEquals("Facebook - लॉग इन या साइन अप करें","Facebook - लॉग इन या साइन अप करें");
		
		
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.linkText("पासवर्ड भूल गए?")).click();
		
	

	
		
	}

	
}
