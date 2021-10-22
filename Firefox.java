package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Firefox {
	
	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000L);
				
				System.out.println(driver.getTitle());
				
				Assert.assertEquals("Facebook - लॉग इन या साइन अप करें","Facebook - लॉग इन या साइन अप करें");
				
				driver.findElement(By.id("email")).sendKeys("hello");
				driver.findElement(By.id("pass")).sendKeys("12345");
				driver.findElement(By.linkText("पासवर्ड भूल गए?")).click();
				
				
			}

		

	}

