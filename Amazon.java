package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refridrator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	String name= driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']")).getText();

	System.out.println("Name:-"+name);
	
	String count= driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//div[@class='sg-col-inner']//span[@class='a-size-base']")).getText();
	System.out.println("Number of reviewers is:-"+count);
	
	String price= driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//div[@class='sg-col-inner']//span[@class='a-price-whole']")).getText();

		System.out.println("Price for this Refriderator is: "+price);
		
		
		
		
		String save=driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//div[@class='a-row a-size-base a-color-base']/span[text()='Save ₹2,500 (17%)']")).getText();
		System.out.println("You are saving : "+save);
		
		String sub2=price.replace(",", "");
		double str2=Double.valueOf(sub2);
		System.out.println();

		System.out.println("price1: "+str2);
		driver.findElement(By.xpath("//div[@data-asin='B08SC2ZTDP']//div[@class='sg-col-inner']//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		
		
		Set<String> s=driver.getWindowHandles();
		
		java.util.Iterator<String> it=s.iterator();
		
		String parent =it.next();
		String child =it.next();
		
		driver.switchTo().window(child);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String price2=driver.findElement(By.xpath("//div[@id='ppd']//div[@id='price']//span[@id='priceblock_ourprice']")).getText();
		
		String sub1=price2.substring(1).replace(",", "");
		System.out.println("price2: "+sub1);
		System.out.println();
		double str1=Double.valueOf(sub1);
		
		if(str2==str1)
		{
			System.out.println("Price Matched...");
		}
		else
			
		{
			System.out.println("Price not Matched...");

		}
	/*		
		String att21=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][3]//td[@class='comparison_sim_items_column comparable_item0']//span")).getText();
		String att22=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][3]//td[@class='comparison_sim_items_column comparable_item1']//span")).getText();
		String att23=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][3]//td[@class='comparison_sim_items_column comparable_item2']//span")).getText();
		String att24=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][3]//td[@class='comparison_sim_items_column comparable_item3']//span")).getText();

		String att11=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][2]//td[@class='comparison_sim_items_column comparable_item0']//span")).getText();
		String att12=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][2]//td[@class='comparison_sim_items_column comparable_item1']//span")).getText();
		String att13=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][2]//td[@class='comparison_sim_items_column comparable_item2']//span")).getText();
		String att14=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row'][2]//td[@class='comparison_sim_items_column comparable_item3']//span")).getText();
*/
		
		String att11=driver.findElement(By.xpath("//*[@id='HLCXComparisonTable']/tbody/tr[9]/td[1]")).getText();
		String att12=driver.findElement(By.xpath("//*[@id='HLCXComparisonTable']/tbody/tr[9]/td[2]")).getText();
		String att13=driver.findElement(By.xpath("//*[@id='HLCXComparisonTable']/tbody/tr[9]/td[3]")).getText();
		String att14=driver.findElement(By.xpath("//*[@id='HLCXComparisonTable']/tbody/tr[9]/td[4]")).getText();

		String att21=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[1]")).getText();
		String att22=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[2]")).getText();
		String att23=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[3]")).getText();
		String att24=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[4]")).getText();

		
		System.out.println("\n\t   Refriderator1     Refriderator2     Refriderator3    Refriderator4\t");

		
		System.out.println("***************************************************************************************");
		
		System.out.println();
		System.out.println("Brand Name:\t"+att11+"\t\t"+att12+"\t\t"+att13+"  \t     "+att14);
		
		System.out.println();
		
		System.out.println("Capacity:\t"+att21+"\t"+att22+"\t"+att23+"\t"+att24);

		
	}

}
