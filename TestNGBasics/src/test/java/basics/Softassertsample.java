package basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassertsample {
	
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	@BeforeMethod
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void bootstrapalert()
	{
		WebElement Bootstrap=driver.findElement(By.xpath("//div[contains(text(),'Bootstrap Alert')]"));
		String actualbtstrap=Bootstrap.getText();
		System.out.println(actualbtstrap);
		String expectedbtstrap="Bootstrap Alert";
		
		//Assert.assertEquals(actualbtstrap, expectedbtstrap);
		
		String actualcolor=Bootstrap.getCssValue("background-color");
		System.out.println(actualcolor);
		String expectedcolor="blue";
		
		softassert.assertEquals(actualbtstrap, expectedbtstrap);
		softassert.assertEquals(actualcolor, expectedcolor);
		
		softassert.assertAll();//to get result in report
		//to get failure status in report
		
	}
	
	@Test
	public void Bootstrapcheck()
	{
		WebElement Bootstrap=driver.findElement(By.xpath("//div[contains(text(),'Bootstrap Alert')]"));
		
		boolean actualstate=Bootstrap.isDisplayed();
		boolean expectedstate=false;
		Assert.assertTrue(expectedstate);
		Assert.assertTrue(actualstate);
		//softassert.assertAll();
	}
	
	
	
}
